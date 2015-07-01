package kanbanSimulator;

import repast.simphony.context.Context;
import repast.simphony.context.space.graph.NetworkBuilder;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.RandomGridAdder;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;
import repast.simphony.space.grid.StrictBorders;


public class KanbanSimulatorModel implements ContextBuilder<Object>{

	public Context<Object> build(Context<Object> context) {
		
		context.setId("KanbanSimulator");
		
		Parameters p = RunEnvironment.getInstance().getParameters();
		int height = (Integer)p.getValue("worldHeight");
		int width = (Integer)p.getValue("worldWidth");
		
		//Organization root = WorkFlowSimFactory.eINSTANCE.createOrganization();
		//root.setOrgName("test");
		//System.out.println(root.getOrgName());
		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
		Grid<Object> grid3D = gridFactory.createGrid("3DGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height, 50));
		Grid<Object> grid2D = gridFactory.createGrid("2DGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height));
		Grid<Object> gridWIN = gridFactory.createGrid("WINGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height));
		NetworkBuilder<Object> netBuilder = new NetworkBuilder<Object>("WI_Hierarchy", context, true);
		netBuilder.buildNetwork();
//		Network<Object> net = (Network<Object>)context.getProjection("organization network");
//		Grid<Object> grid = (Grid)context.getProjection("Grid");
		
		SimulationContextBuilder cb = new SimulationContextBuilder("KanbanSimulatorContextBuilder");

		cb.XMLtoEObjects ();
        cb.ContextImplementation(context);
		
		return context;
	}
}

