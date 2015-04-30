package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.awt.Color;

import org.eclipse.emf.common.util.EList;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;
import repast.simphony.visualization.visualization3D.ShapeFactory;
import repast.simphony.visualizationOGL2D.DefaultStyleOGL2D;
import saf.v3d.ShapeFactory2D;
import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;


public class God {
	private String name;
	private String description;
	private LinkedList<ServiceProviderAgent> organizationMembers;
	private LinkedList<DemandSource> demandSources;
	private LinkedList<KSSTask> waitingList;
	private LinkedList<KSSTask> arrivedList;
	private LinkedList<KSSTask> endedList;
	
	public int totalValueAdded;
	

public God() {
	this.name = "God";
	this.description = "THE ONE WHO KNOWS EVERYTHING";
	this.organizationMembers = new LinkedList<ServiceProviderAgent>();
	this.demandSources = new LinkedList<DemandSource>();
	this.waitingList = new LinkedList<KSSTask>();
	this.arrivedList = new LinkedList<KSSTask>();
	this.endedList = new LinkedList<KSSTask>();
}

//Schedule the step method for agents.  The method is scheduled starting at 
	// tick one with an interval of 1 tick.  Specifically, the step starts at 0, and
	// and recurs at 1,2,3,...etc
	@ScheduledMethod(start=0,interval=1)
	public void step() {		
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");	
		Network<Object> net = (Network<Object>) context.getProjection("organization network");		
		
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		
		double timeNow = schedule.getTickCount();
		System.out.println("-------------- TIME NOW : " + timeNow + " --------------");

		// ---------------- !! Remove Ended WIs From Context------------------------------		
		for (int w=0; w<this.getEndedList().size(); w++) {
			KSSTask wItem = this.getEndedList().get(w);				
			// Completed WI: Add Value to Total Value
			if (wItem.isCompleted()){
				this.totalValueAdded += wItem.getCurrentValue(); 				
			}
			this.getEndedList().remove(wItem);
			// Remove WI from Context
			context.remove(wItem);
			
		}
		
		// ---------------- Check WIs to be Created ------------------------------
		for (int w=0; w<this.getWaitingList().size(); w++) {
			KSSTask wItem = this.getWaitingList().get(w);						
			if (!wItem.isCreated()) {
				if( (wItem.arrTime<=timeNow)) {
					// Create WI
					wItem.setCreated(timeNow);					
				}
			}
		}
		
		// --------------- Move Created WIs to Arrived List and go to Demand Source ------------
		System.out.println("Waiting WIs: "+this.getWaitingList().size());
		for (int w=0; w<this.getWaitingList().size();w++) {			
			KSSTask wItem = this.getWaitingList().get(w);	
			if (wItem.isCreated()) {					
				System.out.println("Is Created: "+wItem.getName()+" id:"+wItem.getTaskId());
				// Add WI to WI's Demand Source
				DemandSource dSource = this.getDemandSources().get(0);
				dSource.getAssignmentQ().add(wItem);								
				// Add WI to Arrived List
				this.getArrivedList().add(wItem);	
//				System.out.println("Arrived "+this.getArrivedList());
				// Remove WI from Waiting List
				this.getWaitingList().remove(wItem);
//				System.out.println("Waiting "+this.getWaitingList());
				// Add WI to Context
				context.add(wItem);	
			}
		}
						
		// ---------------- Check WIs already Ended and Move to Ended List ------------------------------
		for (int w=0; w<this.getArrivedList().size(); w++) {
			KSSTask wItem = this.getArrivedList().get(w);	
			if (wItem.isEnded()){					
				System.out.println("Is Ended: "+wItem.getName()+" id:"+wItem.getTaskId());
				// Add WI to Completed List
				this.getEndedList().add(wItem);		
				// Remove WI from Arrived List
				this.getArrivedList().remove(wItem);
			}
		}
					
		
		// ---------------- Graphical Control ------------------------------
//		net.removeEdges();
		int c = 0;int r = 0;int t = 0;
		for (int w=0; w<this.getArrivedList().size(); w++) {
			KSSTask wItem = this.getArrivedList().get(w);		
//			if (!wItem.isAssigned()) {
				// Grid Locations
//				int c = 0;int r = 0;int t = 0;
				if (wItem.getPatternType().getName().matches("Capability")) {																															
					grid.moveTo(wItem,12+2*c,29,4);c++;}
				else if (wItem.getPatternType().getName().matches("Requirement")) {
					grid.moveTo(wItem,11+2*r,26,8);r++;}
				else  {grid.moveTo(wItem,11+t,23,12);t++;}
				// Add KSSTask Dependency Edges
				for (int wst = 0; wst < wItem.getKSSsTasks().size(); wst++) {
					KSSTask wItemsTask = wItem.getKSSsTasks().get(wst);
					if ( (this.getArrivedList().contains(wItemsTask)) && (!wItemsTask.isAssigned()) ){
						net.addEdge(wItem,wItemsTask);
					}
//				}
			}
		}
		
//		 *** Visualization ***
		
		for (int s=0;s<this.organizationMembers.size();s++){
			ServiceProviderAgent SP = this.organizationMembers.get(s);
			for (int w=0;w<SP.getBacklogQ().size();w++){
				grid.moveTo(SP.getBacklogQ().get(w), 11+w, 18-SP.getId()*4, 15);
			}
			for (int w=0;w<SP.getReadyQ().size();w++){
				grid.moveTo(SP.getReadyQ().get(w), 11+w, 19-SP.getId()*4, 15);
			}
			for (int w=0;w<SP.getActiveQ().size();w++){
				if (!SP.getActiveQ().get(w).isEnded()){
				grid.moveTo(SP.getActiveQ().get(w), 11+w, 20-SP.getId()*4, 15);}
			}
		}
		// *********************
		

	// -------------------- END STEP --------------------------------						
	}
	
	public LinkedList<ServiceProviderAgent> getOrganizationMembers() {
		return this.organizationMembers;
	}
	public LinkedList<DemandSource> getDemandSources() {
		return this.demandSources;
	}
	public LinkedList<KSSTask> getWaitingList() {
		return this.waitingList;
	}
	public LinkedList<KSSTask> getArrivedList() {
		return this.arrivedList;
	}
	public LinkedList<KSSTask> getEndedList() {
		return this.endedList;
	}
	public int getTotalValueAdded() {
		return this.totalValueAdded;
	}
}
