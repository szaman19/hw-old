import java.io.*;
import java.util.*;

class Knights {
    private int[][] board;
    private int steps = 0;
    private int num = 1;
    private boolean solved = false;

    public Knights(int l)
    {
	board = new int[l][l];
	steps = l*l;
    }

    public String toString(){
	String ret = "";
	for(int row = 0; row < board.length; row++){
	    for(int col = 0; col < board[row].length; col++){
		if(board[row][col] <10){
		    ret = ret + board[row][col] + "  ";
		}
		else{
		    ret = ret + board[row][col] + " ";
		}
	    } 
	    ret = ret + "\n";
	}
	return ret;
    }

    private void wait(int n){
	try{
	    Thread.sleep(n);
	}
	catch (Exception e){};
    }

    public void solve(int x, int y) {
	if(!solved){
	    try {
		if (board[x][y] == 0) {
		    board[x][y]= num++;
		    if (board[x][y] == steps){
			solved = true;
			wait(50);
			System.out.println(this);
			return;
		    }
		    solve(x+1, y+2);
		    if(!solved)
			solve(x-1, y+2);
		    if(!solved)
			solve(x+2, y-1);
		    if(!solved)
			solve(x+2, y+1);
		    if(!solved)
			solve(x-1, y-2);
		    if(!solved)
			solve(x+1, y-2);
		    if(!solved)
			solve(x-2, y+1);
		    if(!solved)
			solve(x-2, y-1);
		    board[x][y] = 0 ;
		    num--;
		}
	    }
	    catch (Exception e) {
	    }
	}
    }
}