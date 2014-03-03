import java.io.*;
import java.util.*;

public class Knights {
    private int[][] board;
    private int h,w;
    private int me = 1;
    final private int places = -1;
    final private int travelled = 0;
    private boolean solved = false;
    
    public Knights(){
	board = new int[5][5];
	h = 5;
	w = 5;
	for (int i = 0; i < h; i++){
	    for (int j = 0; j<w;j++){
		board[i][j] = places;
	    }
	}
    }
    
    public String toString(){
	String s = "";
	for (int i=0;i<h;i++){
	    for (int j=0;j<w;j++){
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    private void delay(int n){
	try{
	    Thread.sleep(n);
	}catch (InterruptedException e){
	    System.exit(0);
	}
    }

    public boolean good(int x, int y){
	if (x<h && y < w)
	    return true;
	else
	    return false;
    }

    public void solve(int x, int y){
	delay(25);
	if (board[x][y] == 25){
	    solved = true;
	    System.out.println(this);
	    return;
	}
	else if (board[x][y] == places){
	    board[x][y] = me;
	    System.out.println(this);
	    me = me + 1;
	    if (good(x+2,y+1))
		solve(x+2,y+1);
	    if (!solved && good(x+2,y-1))
		solve(x+2,y-1);
	    if (!solved && good(x-2,y+1))
		solve(x-2,y+1);
	    if (!solved && good(x-2,y-1))
		solve(x-2,y-1);
	    if (!solved && good(x+1,y+2))
		solve(x+1,y+2);
	    if (!solved && good(x-1,y+2))
		solve(x-1,y+2);
	    if (!solved && good(x+1,y-2))
		solve(x+1,y-2);
	    if (!solved && good(x-1,y-2))
		solve(x-1,y-2);
	    board[x][y] = travelled;
	}
    }

    public static void main(String[] args){
	Knights k = new Knights();
	k.solve(0,0);
    }
}
