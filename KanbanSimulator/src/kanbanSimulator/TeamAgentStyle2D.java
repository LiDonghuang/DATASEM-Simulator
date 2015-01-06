package kanbanSimulator;

import java.awt.Color;

import repast.simphony.visualizationOGL2D.DefaultStyleOGL2D;

/**
 * The 2D style for Schelling Model Agents.  
 *
 * @author Eric Tatara
 */

public class TeamAgentStyle2D extends DefaultStyleOGL2D {
	

	@Override
	public Color getColor(Object o) {
		TeamAgent agent = (TeamAgent)o;
		if (agent.getType() == 0)	
			return Color.RED;
		else if ((agent.getType() == 1))
			return Color.BLUE;
		else if ((agent.getType() == 2))
			return Color.GREEN;
		return null;
	}
}