import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner {

    public static void main(String[] args) {

	ActorWorld world = new ActorWorld();
	SpiralBug albert = new SpiralBug(2);
	albert.setColor(Color.red);
	world.add(new Location(6, 4), albert);
	world.show();
    }

}