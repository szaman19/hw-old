import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add( new Jumper() );
        world.show();
    }
}