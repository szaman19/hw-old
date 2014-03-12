import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    public DancingBug()
    {
        super();
    }

    /**
     * Moves to the next location of the square.
     */
    public void act(int[] numTurns)
    {
	for (int i = 0; i < numTurns.length; i++){
	    for (int t = 0; t <= numTurns[i]; t++){
		
	    }
	
	    if (canMove())
	    {
            move();
	    }
	}
    }
}
