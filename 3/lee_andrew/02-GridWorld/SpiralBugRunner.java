import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner{
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	SpiralBug sam = new SpiralBug(3);
	sam.setColor(Color.RED);
	world.add(new Location(4,6), sam);
	world.show();
    }
}
