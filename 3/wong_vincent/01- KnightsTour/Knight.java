import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Knight {

    public char[][] maze;
    public int h,w;
    public boolean solved = false;
    final public char me='z';
    final public char wall=' ';
    final public char path='#';
    final public char exit='$';
    final public char travelled='.';

    public Maze(String filename) {
	maze = new char[80][25];
	h=0;
	w=0;
	try {
	    FileInputStream fstream=new FileInputStream(filename);
	    DataInputStream in = new DataInputStream(fstream);
	    
	    while (in.available()!=0) {
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
	catch (Exception e) {
	    System.err.println("File Input Error");
	}
    }

   
    public String toString() {
	String s = "[0;0H";
	int i,j;
	for (i=0;i<h;i++){
	    for (j=0;j<w;j++){
		s = s + maze[j][i];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    private void delay (int n) {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    
    public void solve(int x,int y) {
	
	if (maze[x][y] == exit) {
	    solved = true;
	} 
	else if (maze[x][y]==path) {
	    delay(75);
	    System.out.println(this);
	    maze[x][y]=me;
	    
	    solve(x+2,y+1);
	    if (!solved)
		solve(x+2,y-1);
	    if (!solved)
		solve(x-2,y-1);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x+1,y+2);
	    if (!solved)
		solve(x+1,y-2);
	    if (!solved)
		solve(x-1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    
	    maze[x][y]=travelled;
	}
	// otherwise it's a base case like hitting a wall, z, travelled
    }


    public static void main(String[] args){
	Maze m = new Maze("maze.dat");

	System.out.println("[2J");
	System.out.println(m);
	m.solve(2,3);
    }

}
