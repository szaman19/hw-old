import java.io.*;
import java.util.*;

//The reason I had so much difficulty was I tried to do it with characters first but then it didn't work for making the numbers. When I tried to make an int board, the resulting if statements and board creation didn't work as planned. You can find this version in revisions probably.
// I still wanted to have the right code for future reference, so the solution below is based on the one from class.

public class Knight {
   
    private int[][] chessboard;
    private int n;
    private boolean solved;
    // final private int havebeen = '.';
    // final private int path = 0;
    // final private int me = counter;
    

    public Knight(int n) {
	this.n = n;
	chessboard = new int[n+4][n+4];
	for (int i=0;i<n+4;i++) {
	    for (int j=0;j<n+4;j++) {
		chessboard[i][j] = -1;
	    }
	}
	for (int i=2;i<n+2;i++) {
	    for (int j=2;j<n+2;j++) {
		chessboard[i][j]=0;
	    }
	}
    }
	
	public String toString() {
	    
	    String s = new String("");
	    for (int i=0;i<n+4;i++) {
		for (int j=0;j<n;j++) {
		    s = s + String.format("%3d", chessboard[j][i]);;
		}
		s = s + "\n";
	    }
	    return s;
	}

    public void delay(int n) {
	try {
	    Thread.sleep(n);
		}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    // There's a lot of if statements, nested, but the point was to cover every case. It may have been part of the reason my code doesn't work. The excpetion error occurs during the 'else if.." part of the solve. I spent a long time trying to fix it but it hasn't worked yet. I'm thinking about scrapping the idea, and making a solution that is close to the one in class.
    // public void solve(int x, int y) {
    //	counter = 1;
    //	for (int i=0;i<h;h++) {
    //	    for (int j = 0;j<w;j++) {
    //		if (chessboard[i][j] != 0) {
    //		    solved = true;
    //		    counter += 1;
    //		    System.out.println(this);
    //		    System.out.println("l54");
    //		}
    //	
    //	else if (chessboard[x][y] == 0) {
    //	    delay(120);
    //	    chessboard[x][y] = counter;
    //	    counter += 1;
    //	    System.out.println(this);
    //	    System.out.println("l62");
    //	    if (x+1 <= h) {
    //		if (y+2 <= w) {
    //		    if(chessboard[x+1][y+2] == path) {
    //			solve((x+1),(y+2));
    //			System.out.println("l67");
    //		    }
    //		}
    //		if (!solved) {
    //		    if (y-2 > 0) {
    //			if(chessboard[x+1][y-2] == path) {
    //			    solve((x+1),(y-2));
    //			}
    //		    }
    //		}
    //	    }
    //	    if (!solved) {
    //		if (x-1 > 0) {
    //		    if (y+2 <= w) {
    //			if(chessboard[x-1][y+2] == path) {
    //			    solve((x-1),(y+2));
    //			    System.out.println("l83");
    //			}
    //		    }
    //		    if (!solved) {
    //			if (y-2 > 0) {
    //			    if(chessboard[x-1][y-2] == path) {
    //				solve((x-1),(y-2));
    //				System.out.println("l90");
    //			    }
    //			}
    //		    }
    //		}
    //	    }
    //	    if (!solved) {
    //		if (x+2 <= h) {
    //		    if (y+1 <= w) {
    //			if (chessboard[x+2][y+1] == path) {
    //			    solve((x+2),(y+1));
    //			    System.out.println("l101");
    //			}
    //		    }
    //		    if (!solved) {
    //			if (y-1 > 0) {
    //			    if (chessboard[x+2][y-1] == path) {
    //				solve((x+2),(y-1));
    //				System.out.println("l108");
    //			    }
    //			}
    //		    }
    //		}
    //	    }
    //	    if (!solved) {
    //		if (x-2 > 0) {
    //		    if (y+1 <= w) {
    //			if (chessboard[x-2][y+1] == path) {
    //			    solve((x-2),(y+1));
    //			    System.out.println("l119");
    //			}
    //		    }
    //		    if (!solved) {
    //			if (y-1 <= 0) {
    //			    if (chessboard[x-2][y-1] == path) {
    //				solve((x-2),(y-1));
    //				chessboard[x][y] = havebeen;
    //				System.out.println("l127");
    //			    }
    //			}
    //		    }
    //		}
    //	    }
    //	}
    // }
    //	}
    // }

    public void solve(int x, int y, int n) {
       
	if (n>this.n*this.n) { // aka counter of n is at n^2
	    solved = true;
	    System.out.println(this);
	    System.out.println("SOLVED");
	    return;
	    }

	if (chessboard[x][y]!=0) {
	    return;
	}
	chessboard[x][y]=n;
	if (!solved)
	    solve(x+1,y+2,n+1);
	if (!solved)
	    solve(x+1,y-2,n+1);
	if (!solved)
	    solve(x-1,y+2,n+1);
	if (!solved)
	    solve(x-1,y-2,n+1);

	if (!solved)
	    solve(x+2,y+1,n+1);
	if (!solved)
	    solve(x+2,y-1,n+1);
	if (!solved)
	    solve(x-2,y+1,n+1);
	if (!solved)
	    solve(x-2,y-1,n+1);
	if (!solved)
	    chessboard[x][y]=0;
    }
    public static void main(String[] args) {
	Knight x = new Knight(5);
	System.out.println(x);
	x.solve(2,4,1);
	System.out.println(x);
    }
}
	
	
