import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class CircleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld( new UnboundedGrid<Actor>() );
        world.add( new CircleBug(3) );
        world.show();
    }
}
