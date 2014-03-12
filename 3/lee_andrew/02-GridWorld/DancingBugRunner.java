import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	int[] list = {1,3,4,2,5,7};
	DancingBug diana = new DancingBug(list);
	diana.setColor(Color.WHITE);
	world.add(new Location(5,5), diana);
	world.show();
    }
}
