import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZBugRunner {

    public static void main (String[] args) {
	ActorWorld world = new ActorWorld();
	ZBug andrew = new ZBug(4);
	andrew.setColor(Color.PINK);
	world.add(new Location(5,2), andrew);
	world.show();
    }
}