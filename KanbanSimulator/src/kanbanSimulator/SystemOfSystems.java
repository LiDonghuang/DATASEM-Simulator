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


public class SystemOfSystems {
	private String name;
	private String description;
	private LinkedList<ServiceProviderAgent> organizationMembers;
	private LinkedList<DemandSource> demandSources;
	private LinkedList<KSSTask> waitingList;
	private LinkedList<KSSTask> arrivedList;
	private LinkedList<KSSTask> endedList;
	
	public int completedWIs;
	public int totalValueAdded;
	public double timeNow;

public SystemOfSystems() {
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
	@ScheduledMethod(start=0,interval=1,priority=40)
	public void step() {		
		Context<Object> context = ContextUtils.getContext(this);
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();

		timeNow = schedule.getTickCount();
		System.out.println("-------------- TIME NOW : " + timeNow + " --------------");
		System.out.println("-- This is GOD's Turn --");
				
		for (int w=0; w<this.getWaitingList().size();w++) {			
			KSSTask wItem = this.getWaitingList().get(w);	
			// ---------------- Check WIs to be Created ------------------------------
			if (!wItem.isCreated()) {
				if( (wItem.isDemanded()) && (wItem.getArrivalTime()<=timeNow)) {
					// Create WI
					wItem.setCreated();					
				}
			}
			// ------- Move Created WIs to Arrived List and go to Demand Source -------
			if ((wItem.isCreated())) {									
				// Add WI to WI's Demand Source 
				if (wItem.isDemanded()) {
				DemandSource dSource = this.getDemandSources().get(0);
				dSource.getAssignmentQ().add(wItem); }
				// Add WI to Arrived List
				this.getArrivedList().add(wItem);	
//				System.out.println("Arrived "+this.getArrivedList());
				// Remove WI from Waiting List
				this.getWaitingList().remove(wItem);
				w--;
//				System.out.println("Waiting "+this.getWaitingList());
				// Add WI to Context
				context.add(wItem);	
			}
		}
		System.out.println("Waiting WIs: "+this.getWaitingList().size());	
		
		// --------- Check Arrived WIs -------------
		// Check WIs already Ended and Move to Ended List
		for (int w=0; w<this.getArrivedList().size(); w++) {
			KSSTask wItem = this.getArrivedList().get(w);	
			if (wItem.isEnded()){					
				// Add WI to Ended List
				this.getEndedList().add(wItem);		
				// Remove WI from Arrived List
				this.getArrivedList().remove(wItem);
				w--;
			}
		}
							
	
		// ---------------- !! Remove Ended WIs From Context------------------------------		
		for (int w=0; w<this.getEndedList().size(); w++) {
			KSSTask wItem = this.getEndedList().get(w);				
			// Completed WI: Add Value to Total Value
			if (wItem.isCompleted()){
				this.completedWIs ++;
				this.totalValueAdded += wItem.getCurrentValue(); 				
			}
			this.getEndedList().remove(wItem);
			// Remove WI from Context
			System.out.println("Remove "+wItem.getPatternType().getName()+": "
					+wItem.getName()+" id:"+wItem.getID());
			context.remove(wItem);	
			w--;
		}
		System.out.println("Completed WIs: "+this.completedWIs);
		// ---------------- Termination Condition ------------------------------
		if ((this.getWaitingList().size()==0)
			&&(this.getArrivedList().size()==0)&&(this.getEndedList().size()==0)){
			RunEnvironment.getInstance().endRun();
		}
	// ------------------- END STEP --------------------------------						
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
