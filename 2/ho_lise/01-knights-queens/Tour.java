import java.io.*;
import java.util.*;
// This Tour class assumes that the board's n is less than 100
public class Tour{
    private String[][] board;
    private int counter;
    private boolean solved = false;
    final private String none = "0   ";
    // just for counting references, I was just curious how many moves it would take for the board to fill up... :) 
    public int timer = 0;
    

    public Tour(int n){
	board = new String[n][n];
	for (int a = 0; a<n; a++){
	    for (int b=0; b<n; b++){
		board[a][b] = none;
	    }
	}
	counter= 1;
    }

    public Tour(){
	int n=5;
	board = new String[n][n];
	for (int a = 0; a<n; a++){
	    for (int b=0; b<n; b++){
		board[a][b] = none;
	    }
	}
	counter= 1;	
    }
	
    public String toString(){
       	String str = "[0;0H";

	int row, col;
	for (row = 0; row < board.length; row++){
	    for (col = 0; col< board[0].length;col++){
		str= str + "" + board[row][col];
	    }
	    str= str +"\n";
	}
	return str;
    }
    private void delay (int d){
	try{
	    Thread.sleep(d);
	}
	catch(InterruptedException e){
	    System.exit(0);
	}
    }
    public String stringify(int n){
	if (n <10){
	    return n + "   ";
	}
	else if (n < 100){
	    return n + "  ";
	}
	else{
	    return n + " ";
	}
    }

    public void solve(int x, int y){
	if (counter > Math.pow(board.length,2)){
	    solved = true;
	    System.out.println(this);
	}
	else if (board[x][y].equals(none)){
	    timer++;
	    //delay(10);
	    board[x][y]= stringify(counter);
	    System.out.println(this);
	    counter++;    
	    if (x+2<board.length && y+1<board[0].length){
		solve(x+2, y+1);
	    }
	    
	    if (!solved){
		if (x+2<board.length && y-1>=0){
		    solve(x+2, y-1);
		}
	    }
	    if (!solved){
		if (x-2 >=0 && y-1 >=0){
		    solve(x-2, y-1);
		}
	    }
	    if (!solved){
		if (x-2 >= 0 && y+1<board[0].length){
		    solve(x-2, y+1);
		}
	    }
	    if (!solved){
		if (x+1<board.length && y-2 >= 0){
		    solve(x+1, y-2);
		}
	    }
	    if (!solved){
	        if (x-1 >= 0 && y-2 >= 0){
		    solve(x-1, y-2);
		}
	    }
	    if (!solved){
		if (x+1<board.length && y+2<board[0].length){
		    solve(x+1, y+2);
		}
	    }
	    if (!solved){
		if (x-1 >= 0 && y+2<board[0].length){
		    solve(x-1, y+2);
		}
	    }
	    board[x][y] = none;
	    counter--;
	}

    }
    public static void main(String[]args){
	Tour KT = new Tour(5);

	System.out.println("[2J");
	System.out.println(KT);
	
	KT.solve(0,0);
	System.out.println(KT.timer);
	
       	Tour A = new Tour(4);

	System.out.println("[2J");
	System.out.println(A);
	
	A.solve(0,1);
	System.out.println(A.timer);
    }
}