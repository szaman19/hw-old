import java.io.*;
import java.util.*;

public class Chessboard{

    public String[][] board;    
    public int size, wid;

    public Chessboard(int n){
	board = new String[n][n];
	size = n*n;
	wid = n;

	for (int i = 0; i<n; i++){
	    for (int j = 0; j<n; j++){
		board[i][j] = "-";
	    }
	}
    }

    public String toString(){
	String result = "";

	for (int row = 0; row<wid; row++){
	    for (int col = 0; col<wid; col++){
		result = result + "  " + board[row][col] + " ";
	    }
	    result = result + "\n";
	}

	return result;
    }
}