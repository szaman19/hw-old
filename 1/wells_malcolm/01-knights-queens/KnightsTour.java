import java.io.*;
import java.util.*;
class KnightsTour{
    public int[][] board;
    public boolean solved = false;
    public int sideLength;
    public KnightsTour(int n){
	board = new int[n][n];
	sideLength = n;
    }
    public int[][] solve(){
	solveWork(0, 0, 1);
	return board;
    }
    public int[][] getRows(){
	return board;
    }
    public void solveWork(int row, int col, int num){
	try{
	    if (board[row][col] == 0){
		board[row][col] = num;
		if(num == Math.pow(sideLength, 2)){
		    solved = true;
		}
		if (!solved){
		    solveWork(row+1, col+2, num+1);
		}
		if (!solved){
		    solveWork(row+2, col+1, num+1);
		}
		if (!solved){
		    solveWork(row-1, col+2, num+1);
		}
		if (!solved){
		    solveWork(row-2, col+1, num+1);
		}
		if (!solved){
		    solveWork(row+1, col-2, num+1);
		}
		if (!solved){
		    solveWork(row+2, col-1, num+1);
		}
		if (!solved){
		    solveWork(row-1, col-2, num+1);
		}
		if (!solved){
		    solveWork(row-2, col-1, num+1);
		}
		if(!solved){
		    board[row][col] = 0;
		}
	    }
	}
	catch(IndexOutOfBoundsException E){
	    int x = 0;
	}
    }
}