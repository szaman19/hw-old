import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld( new UnboundedGrid<Actor>() );
        world.add( new SpiralBug(8) );
        world.show();
    }
}
