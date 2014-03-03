import info.gridworld.actor.Bug;
 
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int side;
    /**
     * Constructs a circle bug that traces a Z of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
	side = 1;
        sideLength = length;
	setDirection(90);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && side <= 3)
	    {
		if (canMove())
		    {
			move();
			steps++;
		    }
	    }
        else if (side == 1) 
	    {
	        setDirection(225);
		steps = 0;
		side++;
	    }
	else if (side == 2)
	    {
	        setDirection(90);
		steps = 0;
		side++;
	    }
    }
}
