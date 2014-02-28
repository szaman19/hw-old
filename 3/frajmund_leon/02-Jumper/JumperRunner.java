import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperRunner{
    public static void main(String[] args){

	ActorWorld world = new ActorWorld();
        Jumper alice = new Jumper();
        alice.setColor(Color.ORANGE);
        Jumper bob = new Jumper();
        world.add(new Location(2, 3), alice);
        world.show();
    }
}
