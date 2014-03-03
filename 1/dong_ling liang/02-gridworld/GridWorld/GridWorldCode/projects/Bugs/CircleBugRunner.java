import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
	CircleBug pete = new CircleBug(3);
        world.add(new Location(5, 5), pete);
        world.show();
    }
}
