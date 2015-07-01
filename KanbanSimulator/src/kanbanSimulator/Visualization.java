package kanbanSimulator;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;

public class Visualization {
	public SystemOfSystems SoS;

		@ScheduledMethod(start=0,interval=1,priority=0)
		public void step() {		
			Context<Object> context = ContextUtils.getContext(this);	
			Grid<Object> grid3D = (Grid<Object>)context.getProjection("3DGrid");	
			Grid<Object> grid2D = (Grid<Object>)context.getProjection("2DGrid");
			Grid<Object> gridWIN = (Grid<Object>)context.getProjection("WINGrid");
			Network<Object> netWI_Hierarchy = (Network<Object>) context.getProjection("WI_Hierarchy");				
			System.out.println("-- Finalize Visualization... --");
			
			// ---------------- Visualization Control ------------------------------	
//			net.removeEdges();		
//			 *** WI Dependencies Visualization ***	
			int c = 0;int r = 0;int t = 0;
			for (int w=0; w<SoS.getArrivedList().size(); w++) {
				KSSTask wItem = SoS.getArrivedList().get(w);		
//				if (!wItem.isAssigned()) {
					// Grid Locations
//					int c = 0;int r = 0;int t = 0;
					if (wItem.getPatternType().getName().matches("Capability")) {																															
						grid3D.moveTo(wItem,12+2*c,29,4);
						gridWIN.moveTo(wItem,12+2*c,29);
						c++;}
					else if (wItem.getPatternType().getName().matches("Requirement")) {
							grid3D.moveTo(wItem,11+2*r,26,8);
							gridWIN.moveTo(wItem,11+2*r,26);
							r++;}
					else   {grid3D.moveTo(wItem,11+1*t,23,12);
							gridWIN.moveTo(wItem,11+1*t,23);
							t++;}
					// Add KSSTask Dependency Edges
					for (int wst = 0; wst < wItem.getSubTasks().size(); wst++) {
						KSSTask wItemsTask = wItem.getSubTasks().get(wst);
						if ( SoS.getArrivedList().contains(wItemsTask) ){
							netWI_Hierarchy.addEdge(wItem,wItemsTask);
						}
//					}
				}
			}	
//			 *** SP Queues Visualization ***		
			for (int s=0;s<SoS.getOrganizationMembers().size();s++){
				ServiceProviderAgent SP = SoS.getOrganizationMembers().get(s);
				for (int w=0;w<SP.getBacklogQ().size();w++){
					grid3D.moveTo(SP.getBacklogQ().get(w), 11+w, 18-SP.getId()*4, 15);
					grid2D.moveTo(SP.getBacklogQ().get(w), 11+w, 18-SP.getId()*4);
				}
				for (int w=0;w<SP.getReadyQ().size();w++){
					grid3D.moveTo(SP.getReadyQ().get(w), 11+w, 19-SP.getId()*4, 15);
					grid2D.moveTo(SP.getReadyQ().get(w), 11+w, 19-SP.getId()*4);
				}
				for (int w=0;w<SP.getActiveQ().size();w++){
					if (!SP.getActiveQ().get(w).isEnded()){
					grid3D.moveTo(SP.getActiveQ().get(w), 11+w, 20-SP.getId()*4, 15);
					grid2D.moveTo(SP.getActiveQ().get(w), 11+w, 20-SP.getId()*4);
					}
				}
				for (int w=0;w<SP.getRequirementsQ().size();w++){
					grid3D.moveTo(SP.getRequirementsQ().get(w), 11+w, 21-SP.getId()*4, 15);
					grid2D.moveTo(SP.getRequirementsQ().get(w), 11+w, 21-SP.getId()*4);
				}
			}
		}
}

