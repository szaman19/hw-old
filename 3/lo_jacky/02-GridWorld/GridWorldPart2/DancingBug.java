import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int steps;
    private int[] turns;
    private int turnsIndex;

    public DancingBug(int turnsIndex)
    {
	steps = 0;
	turns = new int[turnsIndex];
	for (int i = 0; i < turnsIndex; i++)
	    {
		turns[i] = (int)(Math.random() * 10);
	    }
    }

    public void act()
    {
	if (canMove())
	    {
		move();
	    }
	else
	    {
		for (int i = 0; i < turns[turnsIndex]; i++)
		    {
			turn();
		    }
		turnsIndex++;
		if (turnsIndex == turns.length)
		    {
			turnsIndex = 0;
		    }
	    }
    }
}
