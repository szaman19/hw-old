import java.io.*;
import java.util.*;

public class Driver{

    public Chessboard Board;
    public int size, wid;
    public boolean solved = false;

    public static void main(String[] args){
	Driver D = new Driver(7);
	D.knightsTour(0,0,1);
	D.Board = new Chessboard(7);
	D.nQueens();

    }

    public Driver(int n){
	Board = new Chessboard(n);
	size = Board.size;
	wid = Board.wid;
    }
    
    public void nQueens(){
	for (int i = 0; i<(int)Math.ceil(wid/2.0); i++){
	    Board.board[i][2*i] = "Q";
	}
	for (int i = (int)Math.ceil(wid/2.0); i<wid-2; i++){
	    Board.board[i][2 * (i - (int)Math.ceil(wid/2.0)) + 1] = "Q";
	}
	System.out.println(Board);
    }

    public void knightsTour(int row, int col, int knight){
	
	if (knight == size &&
	    Board.board[row][col].equals("-")){
	    Board.board[row][col] = "" + knight;
	    System.out.println(Board);
	    solved = true;
	}
	else if (row < wid && 
		 col < wid &&
		 row >= 0 &&
		 col >= 0){
	    if (Board.board[row][col].equals("-")){
		Board.board[row][col]= ""+knight;
		if (!solved &&
		    row+2 < wid && 
		    col+1 < wid &&
		    row+2 >= 0 &&
		    col+1 >= 0)
		    knightsTour(row+2,col+1,knight+1);
		if (!solved &&
		    row+2 < wid && 
		    col-1 < wid &&
		    row+2 >= 0 &&
		    col-1 >= 0)		    
		    knightsTour(row+2,col-1,knight+1);
		if (!solved &&
		    row-2 < wid && 
		    col-1 < wid &&
		    row-2 >= 0 &&
		    col-1 >= 0)
		    knightsTour(row-2,col-1,knight+1);
		if (!solved &&
		    row-2 < wid && 
		    col+1 < wid &&
		    row-2 >= 0 &&
		    col+1 >= 0)
		    knightsTour(row-2,col+1,knight+1);
		if (!solved &&
		    row+1 < wid && 
		    col+2 < wid &&
		    row+1 >= 0 &&
		    col+2 >= 0)
		    knightsTour(row+1,col+2,knight+1);
		if (!solved &&
		    row+1 < wid && 
		    col-2 < wid &&
		    row+1 >= 0 &&
		    col-2 >= 0)
		    knightsTour(row+1,col-2,knight+1);
		if (!solved &&
		    row-1 < wid && 
		    col-2 < wid &&
		    row-1 >= 0 &&
		    col-2 >= 0)
		    knightsTour(row-1,col-2,knight+1);
		if (!solved &&
		    row-1 < wid && 
		    col+2 < wid &&
		    row-1 >= 0 &&
		    col+2 >= 0)
		    knightsTour(row-1,col+2,knight+1);
		Board.board[row][col]="-";
	    }	    
	}
    }
}