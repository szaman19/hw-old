import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZBugRunner{

	public static void main(String[] args){
	    ActorWorld world = new ActorWorld();
	    ZBug emily = new ZBug(6);
	    emily.setColor(Color.ORANGE);
	    // ZBug bob = new ZBug(3);
	    world.add(new Location(0, 0), emily);
	    // world.add(new Location(0, 0), bob);
	    world.show();
	}
}
