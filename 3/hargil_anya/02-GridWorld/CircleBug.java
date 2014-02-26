import info.gridworld.actor.Bug;
 
public class CirlceBug extends Bug
{
    private int steps;
    private int sideLength;
    /**
     * Constructs a circle bug that traces an octagon of a given side length
     * @param length the side length
     */
    public BoxBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
	    {
		move();
		steps++;
	    }
        else
	    {
		turn();
		steps = 0;
	    }
    }
}
