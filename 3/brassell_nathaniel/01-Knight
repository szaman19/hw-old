import java.io.*;
import java.util.*;

class Knights_Tour{

    private char[][] board;
    private int x,y;
    final private char me = 'x';
    final private char avail = '0';
    private char travelled = '1';
    final private char wall = ' ';
    private boolean solved = false;

    public Board(String filename){
	board = new char[11][11];
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
	solved = true;
	for(int s = 0; s < board[1].length(); s++){
	    for(int h = 0; h < board[1][1].length(); h++){
	    if (board[s][h] == '0')
		solved = false;
	    }
	}
	if (board[x][y] == wall){
	    return;
	}
	else if (board[x][y] == avail) {
	    board[x][y]=me;
	    System.out.println(this);
	    solve(x+2,y+1);
	    if (!solved) 
		solve(x+2,y-1);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	    if (!solved)
		solve(x+1,y+2);
	    if (!solved)
		solve(x+1,y-1);
	    if (!solved)
		solve(x-1, y+2);
	    if (!solved)
		solve(x-1, y-2); 
	    maze[x][y]=travelled;


	}
    }


    public static void main(String[] args){
	Knights_Tour k = new Knighs_Tour("maze.dat");


	System.out.println("[2J");
	k.solve(3,3);


    }


}
