import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Actor;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;

public class SpiralBugRunner
{
    public static void main( String args[] )
    {
        UnboundedGrid grid = new UnboundedGrid<Actor>();
	ActorWorld world = new ActorWorld(grid);
        SpiralBug bug1 = new SpiralBug(3);
        bug1.setColor(Color.ORANGE);
        world.add (new Location(3, 5), bug1 );
        world.show( );
    }
}
