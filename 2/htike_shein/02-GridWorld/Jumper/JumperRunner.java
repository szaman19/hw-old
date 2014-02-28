import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper alice = new Jumper();
        world.add(new Location(7, 2), alice);
        world.add(new Location(6, 2), new Flower());
        world.add(new Location(4, 2), new Rock());
        world.add(new Location(2, 2), new Rock());
        world.add(new Location(1, 2), new Rock());
        world.add(new Location(2, 3), new Rock());
        world.show();
    }
}