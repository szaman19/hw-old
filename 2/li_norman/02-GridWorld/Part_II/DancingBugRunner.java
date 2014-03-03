import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld( new UnboundedGrid<Actor>() );
        int[] angles = {45, 225, 135};
        world.add( new DancingBug(angles) );
        world.show();
    }
}
