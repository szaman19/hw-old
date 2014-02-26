import java.io.*;
import java.util.*;

public class Knight{
    private int[][] board;
    private int step = 1;
    private int win, side;
    private boolean solved = false;

    public Knight(int n){
	board = new int[n][n];
	win = n*n;
	side = n;
    }
    
    public void solve(int x, int y){
        if(step == win){
	    solved = true;
	    System.out.println(this);
	}
	else if(x >= 0 && y >= 0 &&
		x < side && y < side &&
		board[x][y] == 0){
	    board[x][y] = step++;
	    //System.out.println(this);
	    solve(x+2, y+1);
	    if(!solved) solve(x+2, y-1);
	    if(!solved) solve(x-2, y-1);
	    if(!solved) solve(x-2, y+1);
	    if(!solved) solve(x+1, y-2);
	    if(!solved) solve(x+1, y+2);
	    if(!solved) solve(x-1, y-2);
	    if(!solved) solve(x-1, y+2);
	    board[x][y] = 0;
	    step--;
	}
    }

    public String toString(){
	String ans = "";
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[i].length; j++){
		ans += board[i][j] + " ";
	    } 
	    ans += "\n";
	}
	return ans;
    }

    public static void main(String[] args){
	Knight k = new Knight(5);
	k.solve(0,0);
    }


}
