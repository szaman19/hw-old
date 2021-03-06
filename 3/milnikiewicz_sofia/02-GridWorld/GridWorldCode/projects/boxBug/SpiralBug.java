import info.gridworld.actor.Bug;


public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;

    public SpiralBug(int length)
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
	    sideLength++;
	    turn();
	    sideLength++;
            steps = 0;
        }
    }
}
