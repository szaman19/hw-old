import java.io.*;
import java.util.*;

public class Knight {

    public int[][] board;
    public int size=6;
    public boolean solved = false;
    public int count=0;

    public Knight() {
	board = new int[size][size];

	for (int i=0;i<size;i++) {
	    for (int j=0;j<size;j++) {
		board[i][j] = 0;
	    }
	}
    }

    public void solve(int x, int y) {
	if (count == size*size) {
	    board[x][y] = count;
	    solved = true;
	    System.out.println(this);
	}
	else if (board[x][y] == 0) {
	    //System.out.println(this);
	    int temp = count;
	    count++;
	    board[x][y] = count;

	    try {
		if (!solved)
		    solve(x+2,y+1);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x+2,y-1);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x-2,y+1);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x-2,y-1);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x+1,y+2);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x+1,y-2);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x-1,y+2);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    try {
		if (!solved)
		    solve(x-1,y-2);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    }
	    board[x][y]=0;
	    count = temp;
	}
    }


    public String toString() {
	String s="";
	int i,j;
	for (i=0;i<size;i++) {
	    for (j=0;j<size;j++) {
		s = s + board[i][j] + "\t";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	Knight k = new Knight();
	k.solve(0,0);
    }
}
