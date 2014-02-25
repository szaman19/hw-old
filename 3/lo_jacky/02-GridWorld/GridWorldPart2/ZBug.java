import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int turns;

    public ZBug(int length)
    {
	steps = 0;
	turns = 0;
	sideLength = length;
	turn();
	turn();
    }

    public void act()
    {
	if (steps < sideLength && canMove())
	    {
		move();
		steps++;
	    }
	else if (turns < 2)
	    {
	        for (int i = 0; i < 2 * (turns + 1) + 1; i++)
		    {
			turn();
		    }
		steps = 0;
		turns++;
	    }
    }
}
