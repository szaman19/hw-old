import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int[] turns;
    private int turn;

    public DancingBug(int[] a)
    {
	turns = a;
	turn = 0;
    }

    public void turn(int n)
    {
	for (int x = 1; x <= n; x++) 
	    {
		turn();
	    }
    }
		    
    public void act()
    {
        if (turn == turns.length)
        {
            turn = 0;
            turn(turns[turn]);
	    turn++;
	    super.act();
        }
    }
}
