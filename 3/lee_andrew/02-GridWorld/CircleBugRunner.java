import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBugRunner
{
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	CircleBug cass = new CircleBug(3);
	cass.setColor(Color.BLUE);
	world.add(new Location(5,5), cass);
	world.show();
    }
}
