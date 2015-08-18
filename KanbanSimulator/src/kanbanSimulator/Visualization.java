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
//	public Context<Object> context = ContextUtils.getContext(this);
//	public Grid<Object> grid3D = (Grid<Object>)context.getProjection("3DGrid");	
//	public Grid<Object> grid2D = (Grid<Object>)context.getProjection("2DGrid");
//	public Grid<Object> gridWIN = (Grid<Object>)context.getProjection("WINGrid");
//	public Network<Object> netWI_Hierarchy = (Network<Object>) context.getProjection("WI_Hierarchy");	
		@ScheduledMethod(start=0,interval=1,priority=0)
		public void step() {		
			System.out.println("\n-- Progress WorkItems... --");
			for (int s=0;s<SoS.getOrganizationMembers().size();s++) {
				ServiceProviderAgent currentSP = SoS.getOrganizationMembers().get(s);
				for (int w=0;w<currentSP.getActiveQ().size();w++) {
					KSSTask currentWI = currentSP.getActiveQ().get(w);
					currentWI.step();
				}
			}
			Context<Object> context = ContextUtils.getContext(this);	
			Grid<Object> grid3D = (Grid<Object>)context.getProjection("3DGrid");	
			Grid<Object> grid2D = (Grid<Object>)context.getProjection("2DGrid");
			Grid<Object> gridWIN = (Grid<Object>)context.getProjection("WINGrid");
			Network<Object> netWI_Hierarchy = (Network<Object>) context.getProjection("WI_Hierarchy");				
			System.out.println("\n-- Finalize Visualization... --");
			
			// ---------------- Visualization Control ------------------------------	
//			net.removeEdges();		
//			 *** WI Dependencies Visualization ***	
			int m = 0;int g =0 ;int c = 0;int r = 0;int t = 0;int a = 0;
			int m_max = 0;int g_max =0 ;int c_max = 0;int r_max = 0;int t_max = 0;int a_max = 0;
			for (int w=0; w<SoS.getArrivedList().size(); w++) {
				KSSTask wItem = SoS.getArrivedList().get(w);		
//				if (!wItem.isAssigned()) {
					// Grid Locations
//					int c = 0;int r = 0;int t = 0;
					if (wItem.getPatternType().getName().matches("Mission")) {																															
//							grid3D.moveTo(wItem,12+5*m,99,2);
							gridWIN.moveTo(wItem,12+5*m,99);
							m++;}
					else if (wItem.getPatternType().getName().matches("Stage")) {																															
//							grid3D.moveTo(wItem,12+4*g,96,4);
							gridWIN.moveTo(wItem,12+4*g,96);
							g++;}
					else if (wItem.getPatternType().getName().matches("Capability")) {																															
//							grid3D.moveTo(wItem,12+3*c,93,4);
							gridWIN.moveTo(wItem,12+3*c,93);
							c++;}
					else if (wItem.getPatternType().getName().matches("Requirement")) {
//							grid3D.moveTo(wItem,11+2*r,90,8);
							gridWIN.moveTo(wItem,11+2*r,90);
							r++;}
					else if (wItem.getPatternType().getName().matches("Task")) {
//							grid3D.moveTo(wItem,11+2*t,87,12);
							gridWIN.moveTo(wItem,11+1*t,87);
							t++;}
					else if (wItem.getPatternType().getName().matches("Activity")) {
//							grid3D.moveTo(wItem,11+1*a,84,12);
							gridWIN.moveTo(wItem,11+1*a,84);
							a++;}
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
//					grid3D.moveTo(SP.getBacklogQ().get(w), 11+w, 88-SP.getId()*4, 15);
					grid2D.moveTo(SP.getBacklogQ().get(w), 11+w, 88-SP.getId()*4);
				}
				for (int w=0;w<SP.getReadyQ().size();w++){
//					grid3D.moveTo(SP.getReadyQ().get(w), 11+w, 89-SP.getId()*4, 15);
					grid2D.moveTo(SP.getReadyQ().get(w), 11+w, 89-SP.getId()*4);
				}
				for (int w=0;w<SP.getActiveQ().size();w++){
					if (!SP.getActiveQ().get(w).isEnded()){
//					grid3D.moveTo(SP.getActiveQ().get(w), 11+w, 90-SP.getId()*4, 15);
					grid2D.moveTo(SP.getActiveQ().get(w), 11+w, 90-SP.getId()*4);
					}
				}
				for (int w=0;w<SP.getComplexQ().size();w++){
//					grid3D.moveTo(SP.getComplexQ().get(w), 11+w, 91-SP.getId()*4, 15);
					grid2D.moveTo(SP.getComplexQ().get(w), 11+w, 91-SP.getId()*4);
				}
			}
		}
}

