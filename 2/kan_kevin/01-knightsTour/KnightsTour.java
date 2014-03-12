import java.io.*;
import java.util.*;

public class KnightsTour{
    public int[][] board;
    public boolean solved = false;
    public int size;
    public int steps = 1;

    public KnightsTour(){
	size = 5;
	board = new int[size][size];
    }
    public KnightsTour(int length){
	size = length;
	board = new int[size][size];
    }

    public String toString(){
	String s = "";
	for (int i = 0; i< size; i++){
	    for (int j = 0; j<size; j++){
		if (board[j][i] < 10)
		    s = s + "0" +(board[j][i]) + " ";
		if (board[j][i] >= 10)
		    s = s + (board[j][i]) + " ";
	    }
	    s = s + ("\n");
	}
	return s;
    }

    public void solve(){
	solve(0,0);
    }

    public void solve(int x, int y) {
	if (steps == size*size) {
	    solved = true;
	    System.out.println(this);
	}
	else if (x<size && y<size && x>=0 && y>=0 && board[x][y]==0) {
	    delay(500);
	    board[x][y]=steps;
	    System.out.println(this);
	    steps++;
	    solve(x+2,y+1);
	    if (!solved)
		solve(x+2,y-1);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	    if (!solved)
		solve(x-1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    if (!solved)
		solve(x+1,y+2);
	    if (!solved)
		solve(x+1,y-2);
	    System.exit(0);
	}
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
    /*
============================================
    */
    public static void main(String[] args){
	KnightsTour k = new KnightsTour();
	k.solve(2,3);
	System.out.println(k);
    }



}

