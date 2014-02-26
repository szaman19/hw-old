import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class DancingBugRunner
{
    public static void main( String args[] )
    {
	int[] a = new int[6];
	for (int x = 0; x < a.length; x++) 
	    {
		a[x] = (int)Math.random()*8;
	    }
        ActorWorld world = new ActorWorld( );
        DancingBug bug1 = new DancingBug(6);
        bug1.setColor(Color.ORANGE);

        world.add (new Location(7, 8), bug1 );

        world.show( );
    }
}

