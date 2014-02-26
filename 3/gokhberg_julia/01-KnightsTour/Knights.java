import java.io.*;
import java.util.*;

class Knights
{
    private int[][] board;
    private int sidelen, moves;
    private boolean solved = false;

    public Knights (int x){
	sidelen = x;
	board = new int[x][x];
	for (int i = 0; i < x; i++){
	    for (int j = 0; j < x; j++){
		board[i][j] = 0;
	    }
	}
    }

    //I looked at Anya's code to understand how to print out the board because I wasn't quite sure how to do it! Sorry :/
    public String printboard(){
	String s = "";
	int x = sidelen;
	for (int i = 0; i < x; i++){
	    for (int j = 0; j < x; j++){
		s += board[i][j] + "\t";
		if ((j + 1) == sidelen){
		    s += "\n";
		}
	    }
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
	//i don't get why this if clause works
	if ( ((x < 0) || (x >= sidelen) || (y < 0) || (y >= sidelen)) || (board[x][y] != 0)) {
	    solved = false;
	    return;
	}if (moves == (sidelen*sidelen)){
	    solved = true;
	    return;
	}else {
	    System.out.println(this);
	    solve(x+2,y+1);
	    if (!solved) 
		solve(x+2,y-1);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	    if (!solved) 
		solve(x+1,y-2);
	    if (!solved)
		solve(x+1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    if (!solved)
		solve(x-1,y+2);
	    board[x][y] = moves + 1 ;

	}
    }


    public static void main(String[] args)
    {
	Knights a = new Knights(5);
	System.out.println(a.printboard());
	a.solve(0,0);
	System.out.println(a.printboard());

    }

}
