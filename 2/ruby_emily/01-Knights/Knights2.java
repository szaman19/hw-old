import java.io.*;
import java.util.*;

public class Knights2{
    private int[][] board;
    private int count, maxmoves;
    private boolean solved = false;
    
    public Knights2(int x, int y){
	board = new int[x][y];
	for (int i=0;i<y;i++){
	    for (int j=0;j<x;j++){
		board[i][j]=0;
	    }
	}
	count=1;
	maxmoves=x*y;
    }

    public void solve(int x, int y){
	if (count==maxmoves){
	    solved=true;
	    System.out.println(this);
	}
	if (x < 0 || y < 0){
	    return;
	}
	else if (board[x][y]==0){
	   
		board[x][y]=count;
		count++;
		System.out.println(this);
	    
		solve((x-2),(y+1));
		if (!solved)
		    solve((x-2),(y-1));
		if (!solved)
		    solve((x+2),(y-1));
		if (!solved)
		    solve((x+2),(y+1));
		if (!solved)
		    solve((x-1),(y+2));
		if (!solved)
		    solve((x-1),(y-2));
		if (!solved)
		    solve((x+1),(y+2));
		if (!solved)
		    solve((x+1),(y-2));
		if (!solved){
		    board[x][y]=0;
		    count--;
		}
	
	    
	}
    }

    public String toString(){
        String s="";
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }


    public static void main(String[] args){
	Knights2 Kn = new Knights2(5,5);
	Kn.solve(0,0);
	System.out.println(Kn.toString());
    }
}
