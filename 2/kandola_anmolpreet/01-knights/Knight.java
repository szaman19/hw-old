import java.io.*;
import java.util.*;

public class Knight {
    private int counter;
    private int[][] chessboard;
    private int h,w;
    private boolean solved;
    final private int havebeen = '.';
    final private int path = 0;
    final private int me = counter;
    

    public Knight(int newh, int neww) {
    h = newh;
    w = neww;
	chessboard = new int[h][w];
    solved = false;
	for (int i=0;i<h;i++) {
	    for (int j=0;j<w;j++) {
		chessboard[i][j] = path;
	    }
	}
    }
	
	public String toString() {
	    String s = new String("");
	    for (int i=0;i<h;i++) {
		for (int j=0;j<w;j++) {
		    s = s + chessboard[i][j];
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

    public void solve(int x, int y) {
	counter = 1;
	for (int i=0;i<h;h++) {
	    for (int j = 0;j<w;j++) {
		if (chessboard[i][j] != 0) {
		    solved = true;
		    counter += 1;
		    System.out.println(this);
		    System.out.println("l54");
		}
	    
	
	else if (chessboard[x][y] == 0) {
	    delay(120);
	    chessboard[x][y] = counter;
	    counter += 1;
	    System.out.println(this);
	    System.out.println("l62");
	    if (x+1 <= h) {
		if (y+2 <= w) {
		    if(chessboard[x+1][y+2] == path) {
			solve((x+1),(y+2));
			System.out.println("l67");
		    }
		}
		if (!solved) {
		    if (y-2 > 0) {
			if(chessboard[x+1][y-2] == path) {
			    solve((x+1),(y-2));
			}
		    }
		}
	    }
	    if (!solved) {
		if (x-1 > 0) {
		    if (y+2 <= w) {
			if(chessboard[x-1][y+2] == path) {
			    solve((x-1),(y+2));
			    System.out.println("l83");
			}
		    }
		    if (!solved) {
			if (y-2 > 0) {
			    if(chessboard[x-1][y-2] == path) {
				solve((x-1),(y-2));
				System.out.println("l90");
			    }
			}
		    }
		}
	    }
	    if (!solved) {
		if (x+2 <= h) {
		    if (y+1 <= w) {
			if (chessboard[x+2][y+1] == path) {
			    solve((x+2),(y+1));
			    System.out.println("l101");
			}
		    }
		    if (!solved) {
			if (y-1 > 0) {
			    if (chessboard[x+2][y-1] == path) {
				solve((x+2),(y-1));
				System.out.println("l108");
			    }
			}
		    }
		}
	    }
	    if (!solved) {
		if (x-2 > 0) {
		    if (y+1 <= w) {
			if (chessboard[x-2][y+1] == path) {
			    solve((x-2),(y+1));
			    System.out.println("l119");
			}
		    }
		    if (!solved) {
			if (y-1 <= 0) {
			    if (chessboard[x-2][y-1] == path) {
				solve((x-2),(y-1));
				chessboard[x][y] = havebeen;
				System.out.println("l127");
			    }
			}
		    }
		}
	    }
	}
    }
	}
    }

    public static void main(String[] args) {
	Knight x = new Knight(5,5);
	System.out.println(x);
	x.solve(1,0);
	System.out.println(x);
    }
}
	
	
