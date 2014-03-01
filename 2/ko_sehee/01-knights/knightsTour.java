import java.io.*;
import java.util.*;

public class knightsTour{
    private int[][] board;
    int n = 0;
    int moves = 0;
    boolean solved = false;
    public knightsTour(int size){
	n = size;
	board = new int[n][n];
    }
    public void setUp(){
	for (int i = 0; i < n; i ++){
	    for (int j = 0; j < n; j ++){
		board[j][i]=0;
	    }
	}

    }
    public String toString(){
	String s = "";
	for (int i = 0; i <n; i++){
	    for (int j = 0; j < n; j ++){
		s = s + " " + String.format("%3d", board[j][i]); // number of digits given to each number
	    }
	    s = s + "\n\n";
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


    public void solve(int x, int y){
        if(moves ==n*n){
	    solved = true;
	    System.out.println(this);
	}
	else if(board[x][y]!= 0){
	    return;
	}
	else if(board[x][y] == 0){
	    //delay(75);
	    board[x][y] = moves+1;
	    //System.out.println(this);
	    moves = moves + 1;
	    try{
		solve(x+2, y+1);
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
	    }
	    if (!solved){
		try{
		    solve(x+2,y-1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved){
		try{
		    solve(x-2,y+1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved){
		try{
		    solve(x-2,y-1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved){
		try{
		    solve(x+1,y-2);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved ){
		try{
		    solve(x+1,y+2);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved){
		try{
		    solve(x-1,y-2);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if (!solved){
		try{
		    solve(x-1,y+2);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	    }
	    if(!solved){
		board[x][y]=0;
		moves = moves -1;
	    }
		    
       
	}
    }
}
