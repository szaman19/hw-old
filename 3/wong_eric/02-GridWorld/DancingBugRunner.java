import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {

    public static void main(String[] args) {
	int[] spinnyspins = {1, 4, 7, 3, 7, 8, 6, 2};
	ActorWorld world = new ActorWorld();
	DancingBug giorgio = new DancingBug(spinnyspins);
	giorgio.setColor(Color.YELLOW);
	world.add(new Location(4, 6), giorgio);
	world.show();
    }

}