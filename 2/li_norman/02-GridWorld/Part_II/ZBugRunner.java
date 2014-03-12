import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class ZBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld( new UnboundedGrid<Actor>() );
        world.add( new ZBug(5) );
        world.show();
    }
}
