import java.io.*;
import java.util.*;

class Knights{

    public static void main (String[] args){
	Knights k = new Knights(5);
	System.out.println(k.getboard());
	k.solveKnights(0,0);
	System.out.println(k.getboard());
    }

    private int[][] board;
    private int sidelength;
    private int nummoves=0;
    private boolean solved = false;
    
    public Knights(int n){
	sidelength = n;
	board = new int[n][n];
	for (int i=0; i<n; i++){
	    for (int i2=0; i2<n; i2++){
		board[i][i2] = 0;
	    }
	}
    }

    public String getboard(){
	String s = "";
	int n = sidelength;
	for (int i=0; i<n; i++){	    
	    for (int i2=0; i2<n; i2++){
		s = s + board[i][i2] + " ";
		if (i2+1==n){
		    s+="\n";
		}
	    }
	}
	return s;
    }

    public void solveKnights(int x, int y){
        if (((x < 0) || (x >= sidelength) || (y < 0) || (y >= sidelength)) || (board[x][y] != 0)) {
	    solved = false;
	    return;
	}
	if (nummoves == (sidelength*sidelength)){
	    solved = true;
	    return;
	}
	else {
	    board[x][y] = nummoves++;
	    if (!solved) 
	    solveKnights(x+2, y+1);
	    if (!solved) 
	    solveKnights(x+1, y-2);
	    if (!solved) 
	    solveKnights(x+1, y+2);
	    if (!solved) 
	    solveKnights(x-1, y+2);
	    if (!solved) 
	    solveKnights(x-2, y-1);
	    if (!solved) 
	    solveKnights(x-2, y+1);
	    if (!solved) 
	    solveKnights(x-1, y-2);
	    if (!solved) 
	    solveKnights(x+2, y-1);  
	}
    }	   
}
