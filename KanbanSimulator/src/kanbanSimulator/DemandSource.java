package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.awt.Color;

import org.eclipse.emf.common.util.EList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;
import datasem.xtext.kanban.domainmodel.kanbanmodel.impl.*;
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
import governanceModels.GovernanceSearchStrategy;


public class DemandSource extends WorkSourceImpl{
	public SystemOfSystems SoS;
	
	private int id;
	private WorkSource workSource;
	private LinkedList<ServiceProviderAgent> targetTo;
	private LinkedList<KSSTask> assignmentQ;
//	private LinkedList<KSSTask> arrivedList;
//	private LinkedList<KSSTask> completedList;
	public Context<Object> context = ContextUtils.getContext(this); 

public DemandSource(int id, WorkSource wSource) {
	this.id = id;
	this.name = wSource.getName();
	this.description = wSource.getDescription();
	this.workSource = wSource;
	this.targetTo = new LinkedList<ServiceProviderAgent>();	
	this.assignmentQ = new LinkedList<KSSTask>();
}

	@ScheduledMethod(start=1,interval=1,priority=30)
	public void step() {		

		System.out.println("-- Demand Source "+this.getName()+" is now active --");
		// ----------------- Assign WI to Target Units --------------------------------
		System.out.println(this.getName()+" on-hand WIs: "+this.getAssignmentQ().size());
		for (int w = 0; w < this.getAssignmentQ().size(); w++) {
			KSSTask wItem = this.getAssignmentQ().get(w);
			System.out.println(this.getName()+" is Assigning "+wItem.getPatternType().getName()
					+": "+wItem.getName()+" (id:"+wItem.getID()+")");
			ArrayList<ServiceProviderAgent>serviceProviderCandidates = 
					this.findServiceProviders(wItem);					
//			if (!wItem.isAggregationNode())  {
				if	(serviceProviderCandidates.size()!=0) {
					// ============== Apply WI Assignment Rule =========================
					ServiceProviderAgent selectedSP = serviceProviderCandidates.get(RandomHelper.nextIntFromTo(0, serviceProviderCandidates.size()-1));
					// ================================================================
					// Assign WI to SP
					selectedSP.assignWI(wItem);		
					// Remove WI from AssignmentQ
					this.getAssignmentQ().remove(wItem);
					w--; }
				else {
					System.out.println("Failed to Assign "+wItem.getPatternType().getName()
							+": "+wItem.getName()+" (id:"+wItem.getID()+")"); 
					}
				}
			}
//		}
	
	
	
	public LinkedList<ServiceProviderAgent> getTargetTo() {
		return this.targetTo;
	}
	public LinkedList<KSSTask> getAssignmentQ() {
		return this.assignmentQ;
	}
	public ArrayList<ServiceProviderAgent> findServiceProviders(KSSTask wItem) {
		// 1. What Service does this WI request?				
		String wItem_reqService = wItem.getReqSpecialties().get(0).getName();
		// 2. What ServiceProviders can provide this Service for this WI?
		ArrayList<ServiceProviderAgent> serviceProviderCandidates = new ArrayList<ServiceProviderAgent>(0);
		// Only Search From "Target Units"
		for (int c = 0; c < this.getTargetTo().size(); c++) {
			ServiceProviderAgent tAgent = this.getTargetTo().get(c);	
			// 2.1 List All Services of that ServiceProvider
			for (int ts = 0; ts < tAgent.getServices().size(); ts++) {
				String tAgent_Service = tAgent.getServices().get(ts).getServiceType().getName();	
				// 2.2 Find if any matches the Service requested
				if (wItem_reqService.matches(tAgent_Service)) {
					// 2.3 If any, add the ServiceProvider to Candidates list
					serviceProviderCandidates.add(tAgent);
				}
			}
		}	
		System.out.println("# of candidate SPs: "+serviceProviderCandidates.size());
		return serviceProviderCandidates;
	}
	

}