package kanbanSimulator;

import repast.simphony.context.Context;
import repast.simphony.context.space.graph.NetworkBuilder;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.RandomGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;
import repast.simphony.random.RandomHelper;


public class KanbanSimulatorModel implements ContextBuilder<Object>{

	public Context<Object> build(Context<Object> context) {
		
		Parameters p = RunEnvironment.getInstance().getParameters();
		int numAgents = (Integer)p.getValue("initialNumAgents");
		int height = (Integer)p.getValue("worldHeight");
		int width = (Integer)p.getValue("worldWidth");
		
		//Organization root = WorkFlowSimFactory.eINSTANCE.createOrganization();
		//root.setOrgName("test");
		//System.out.println(root.getOrgName());
		
		/*GridFactoryFinder.createGridFactory(null).createGrid("Grid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new RandomGridAdder<Object>(), true, width, height));
		
		NetworkBuilder<Object> netBuilder = new NetworkBuilder<Object>(
				"organization network", context, true);
		netBuilder.buildNetwork();
		Network<Object> net = (Network<Object>)context.getProjection("organization network");
		Grid<Object> grid = (Grid)context.getProjection("Grid");*/
		
		ContextBuilderTest cbTest=new ContextBuilderTest("0");
		cbTest.XMLParseTest();
		cbTest.DirectoryRegistrationTest();
		cbTest.WorkFlowGenerationTest(context);
		
		return context;
	}
}