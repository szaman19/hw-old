import java.io.*;
import java.util.*;

public class Chess {

    private int[][] board;
    private int h,w,maxy,maxx;
    final private char untravelled = '0';
    private boolean solved = false;
    private int knightStep = 0;

    public void knightTour(int row, int col) {
	h = maxy = col;
	w = maxx = row;
	board = new int[row][col];
	for (int i=0;i<h;i++) {
	    for (int j=0;j<w;j++) {
		board[j][i] = untravelled;
	    }
	}
	knightSolve(0,0);
    }

    public void knightSolve(int x, int y) {
	delay(25);
	if (solved) {
	    System.out.println(this);
	    return;
	}
	else if (x + 1 > w || x - 1 < 0 ||
		 y + 2 > h || y - 2 < 0) {
	    System.out.println(this);
	    return;
	}
	else if (board[x][y] == untravelled) {
	    board[x][y] = knightStep;
	    System.out.println(this);
	    knightSolve(x+1,y+2);
	    knightSolve(x-1,y+2);
	    knightSolve(x+1,y-2);
	    knightSolve(x-1,y-2);
	    knightSolve(x+2,y+1);
	    knightSolve(x-2,y+1);
	    knightSolve(x+2,y-1);
	    knightSolve(x-2,y-1);
	    board[x][y] = untravelled;
	}
    }

    public String go(int x,int y){
	return (""+x+";"+y+"H");
    }
        
    public String clear(){
	return  "2J";
    }
        
    public String toString(){
	String ans = ""+maxx+","+maxy+"\n";
	for(int i=0;i<maxx*maxy;i++){
	    if(i%maxx ==0 && i!=0){
		ans+="\n";
	    }
	    ans += board[i%maxx][i/maxx];
	}
	return clear()+go(0,0)+ans+"\n";
    }

    private void delay(int n) {
	try{
	    Thread.sleep(n);
	}catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public static void main(String[] args) {
	Chess c = new Chess();
	c.knightTour(5, 5);
    }

}
