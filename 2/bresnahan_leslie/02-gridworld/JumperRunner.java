
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.*;
import info.gridworld.grid.*;


public class JumperRunner
{
    public static void main(String[] args)
    {

        ActorWorld world = new ActorWorld();

        world.add( new Jumper());
	world.add( new Rock());
	world.add( new Flower());
	world.add( new Bug());

        world.show();

    }
}
