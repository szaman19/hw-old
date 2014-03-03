import java.io.*;
import java.util.*;

class Knights{

    public static void main (String[] args){
	Knights k = new Knights(5);
	System.out.println(k.printboard());
	k.solve(0,0);
	System.out.println(k.printboard());
    }

    private int[][] board;
    private int side;
    private int nummoves=1;
    private boolean done = false;
    
    public Knights(int n){
	side = n;
	board = new int[n][n];
	for (int i=0; i<n; i++){
	    for (int i2=0; i2<n; i2++){
		board[i][i2] = 0;
	    }
	}
    }

    public String printboard(){
	String s = "";
	int n = side;
	for (int i=0; i<n; i++){	    
	    for (int i2=0; i2<n; i2++){
		s = s + board[i][i2] + "\t";
		if (i2+1==n){
		    s+="\n";
		}
	    }
	}
	return s;
    }

    public void solve(int x, int y){
        if (((x < 0) || (x >= side) || (y < 0) || (y >= side)) || (board[x][y] != 0)) {
	    done = false;
	    return;
	}
	if (nummoves-1 == (side*side)){
	    done = true;
	    return;
	}
	else {
	    board[x][y] = nummoves++;
	    if (!done) 
	    solve(x+2, y+1);
	    if (!done) 
	    solve(x+1, y-2);
	    if (!done) 
	    solve(x+1, y+2);
	    if (!done) 
	    solve(x-1, y+2);
	    if (!done) 
	    solve(x-2, y-1);
	    if (!done) 
	    solve(x-2, y+1);
	    if (!done) 
	    solve(x-1, y-2);
	    if (!done) 
	    solve(x+2, y-1);  
	}
    }	   
}
