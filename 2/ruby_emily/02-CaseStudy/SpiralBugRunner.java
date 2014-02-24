import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner{

	public static void main(String[] args){
	    ActorWorld world = new ActorWorld();
	    SpiralBug emily = new SpiralBug(6);
	    emily.setColor(Color.ORANGE);
	    SpiralBug bob = new SpiralBug(3);
	    world.add(new Location(7, 8), emily);
	    world.add(new Location(5, 5), bob);
	    world.show();
	}
}
