import java.io.*;
import java.util.*;

class Knights
{
    public int[][] maze;
    public boolean solved = false;
	public int num;
    public Knights(int len)
    {
	maze = new int[len][len];
	num = 0;
    }

    public String toString()
    {
	String s = "\n";
	int i,j;
	for (i=0;i<maze.length;i++)
	    {
		for (j=0;j<maze[0].length;j++)
		    {
			s = s + maze[j][i] + "  ";
		    }

		s = s + "\n";
	    }
	return s;
    }

    private void delay(int n)
    {
	try{
		Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    
    public void solve(int x,int y) {

	if (maze[0].length * maze.length == num) {
	    solved = true;
		System.out.println(this);
	} else if ((( x>(-1) && y>(-1) && y<maze.length && x<maze[0].length ) 
				&& maze[x][y] == 0)){
				
		num++;
	    System.out.println(this);
	    maze[x][y]=num;
		if (!solved)
			solve(x+1,y+2);
	    if (!solved )
			solve(x+2,y+1);
		if (!solved)
			solve(x-1,y+2);
	    if (!solved )
			solve(x-2,y+1);
		if (!solved)
			solve(x+1,y-2);
	    if (!solved )
			solve(x+2,y-1);
		if (!solved)
			solve(x-1,y-2);
	    if (!solved )
			solve(x-2,y-1);
		if (num == maze[x][y]) {
			maze[x][y] = 0;
			num--;
		}
		
	}

	// otherwise it's a base case like hitting a wall, z, travelled
    }


    public static void main(String[] args)
    {
	Knights m = new Knights(5);
	System.out.println(m);
	m.solve(4,4);
    }

}

