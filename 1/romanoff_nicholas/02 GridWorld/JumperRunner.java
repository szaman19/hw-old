// Nicholas Romanoff
// Period One
// Homework #02 GridWorld
// 2014-02-24

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class JumperRunner {
	public static void main(String[] args) {
       		ActorWorld world = new ActorWorld();
		Jumper jumper = new Jumper("BLUE");
        	world.add(new Location(1,1),jumper);
        	world.add(new Rock());
        	world.show();
    	}
}
