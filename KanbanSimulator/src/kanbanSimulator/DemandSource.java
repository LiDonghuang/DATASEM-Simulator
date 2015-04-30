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
import governanceModels.governanceSearchStrategy;


public class DemandSource extends WorkSourceImpl{
	private int id;
	private WorkSource workSource;
	private LinkedList<ServiceProviderAgent> targetUnits;
	private LinkedList<KSSTask> assignmentQ;
//	private LinkedList<KSSTask> arrivedList;
//	private LinkedList<KSSTask> completedList;

public DemandSource(int id, WorkSource wSource) {
	this.id = id;
	this.name = wSource.getName();
	this.description = wSource.getDescription();
	this.workSource = wSource;
	this.targetUnits = new LinkedList<ServiceProviderAgent>();	
	this.assignmentQ = new LinkedList<KSSTask>();
}

//Schedule the step method for agents.  The method is scheduled starting at 
	// tick one with an interval of 1 tick.  Specifically, the step starts at 0, and
	// and recurs at 1,2,3,...etc
	@ScheduledMethod(start=1,interval=1)
	public void step() {		
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");		

		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		double timeNow = schedule.getTickCount();
										
		// ----------------- Assign WI to Target Units --------------------------------
		for (int w = 0; w < this.getAssignmentQ().size(); w++) {
			// 1. What Service does this WI request?
			KSSTask wItem = this.getAssignmentQ().get(w);	
			String wItem_reqService = wItem.getReqSpecialties().get(0).getName();
            // 2. What ServiceProviders can provide this Service for this WI?
			ArrayList<ServiceProviderAgent> tU_candidates = new ArrayList<ServiceProviderAgent>(0);
			for (int c = 0; c < this.getTargetUnits().size(); c++) {
				ServiceProviderAgent tAgent = this.getTargetUnits().get(c);	
				// 2.1 List All Services of that ServiceProvider
				for (int ts = 0; ts < tAgent.getServices().size(); ts++) {
					String tAgent_Service = tAgent.getServices().get(ts).getServiceType().getName();	
					// 2.2 Find if any matches the Service requested
					if (wItem_reqService.matches(tAgent_Service)) {
						// 2.3 If any, add the ServiceProvider to Candidates list
						tU_candidates.add(tAgent);
					}
				}
			}
			
			// ONLY ASSIGN WIs WHICH ARE NOT AGGREGATION NODES!
			if ( (tU_candidates.size() != 0) && (!wItem.isAggregationNode()) ) {
				// ============== Apply WI Assignment Rule =========================
				ServiceProviderAgent selectedSP = tU_candidates.get(RandomHelper.nextIntFromTo(0, tU_candidates.size()-1));
				// ================================================================
				// Assign WI to SP
				selectedSP.assignTask(wItem);		
				// Set WI "Assigned"
				wItem.setAssigned();
				// Remove WI from AssignmentQ
				this.getAssignmentQ().remove(wItem);
			}
		}
	}
	
	
	
	public LinkedList<ServiceProviderAgent> getTargetUnits() {
		return this.targetUnits;
	}
	public LinkedList<KSSTask> getAssignmentQ() {
		return this.assignmentQ;
	}
//	public LinkedList<KSSTask> getArrivedList() {
//		return this.arrivedList;
//	}
//	public LinkedList<KSSTask> getCompletedList() {
//		return this.completedList;
//	}

}