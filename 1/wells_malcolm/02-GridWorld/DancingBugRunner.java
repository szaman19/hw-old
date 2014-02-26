import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**                                                                                      
 * This class runs a world that contains box bugs. <br />                                
 * This class is not tested on the AP CS A and AB exams.                                 
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
	int[] array = {1, 5, 6, 2};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(array);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}

