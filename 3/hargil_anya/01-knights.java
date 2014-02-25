import java.io.*;
import java.util.*;

class Maze
{
    private char[][] maze;
    private int h,w;
    final private char me = 'z';
    final private char path = '#';
    final private char wall = ' ';
    final private char exit = '$';
    final private char travelled = '.';
    private boolean solved = false;

    public Maze(String filename)
    {
	maze = new char[80][25];
	h=0;
	w=0;
	try
	    {

		FileInputStream fstream=new FileInputStream(filename);
		DataInputStream in = new DataInputStream(fstream);

		while (in.available()!=0)
		    {
			String line = in.readLine();
			if (w==0)
			    w = line.length();
			for (int i=0;i<line.length();i++)
			    {
				maze[i][h]=line.charAt(i);
			    }
			h++;
		    }
		in.close();
	    }
	catch (Exception e)
	    {
		System.err.println("File Input Error");
	    }

    }

    public String toString()
    {
	String s = "[0;0H";

	int i,j;
	for (i=0;i<h;i++)
	    {
		for (j=0;j<w;j++)
		    {
			s = s + maze[j][i];
		    }

		s = s + "\n";
	    }
	return s;
    }

    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}catch (InterruptedException e) {
	    System.exit(0);
	}
    }


    public void solve(int x, int y) {
	delay(25);
	if (maze[x][y]==exit) {
	    solved = true;
	    System.out.println(this);
	    return;
	}else if (maze[x][y] == path) {
	    maze[x][y]=me;
	    System.out.println(this);
	    solve(x+1,y);
	    if (!solved) 
		solve(x-1,y);
	    if (!solved)
		solve(x,y+1);
	    if (!solved)
		solve(x,y-1);
	    maze[x][y]=travelled;

	}
    }


    public static void main(String[] args)
    {
	Maze m = new Maze("maze.dat");

	System.out.println("[2J");
	m.solve(2,3);

    }

}
