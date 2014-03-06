
public class KnightsTour {
    private int[][] board;
    private int count;
    private int iterations;
    private int n;
    private boolean solved;
   
    public KnightsTour(int length) {
	iterations = 0;
	n = length;
	board = new int[n+4][n+4];
	count = 0;
	solved = false;
	//Makes all square -1
	for (int r = 0; r < n + 4; r++) {
	    for (int c = 0; c < n+4; c++)
		board[r][c] = -1;
	}
    	for (int r = 2; r < n + 2; r++) {
	    for (int c = 2; c < n+2; c++)
		board[r][c] = 0;
	}
    }
    public String getIterations() {
	return "" + iterations;
    }
    public String toString() {
	String str = "[0;0H";
	for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board[0].length; c++) {
		str += String.format("%3d", board[r][c]);
	    }
	    str += "\n";
	}
	return str; 
    } 

    private void delay(int t)
    {
	try{
	    Thread.sleep(t);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public void solve(int x, int y) {
	iterations++;
	if (count == (n * n)) {
	    solved = true;
	    System.out.println(this);
	}
	else if ((board[x][y] == 0)) {
	    
	    count++;
	    board[x][y] = count;   

	    //System.out.println(this);
	    if (!solved)
		solve(x+2, y+1);
	    if (!solved)
		solve(x+1, y+2);
	    if (!solved)
		solve(x+2, y-1);
	    if (!solved)
		solve(x+1, y-2);
	    if (!solved)
		solve(x-2, y+1);
	    if (!solved)
		solve(x-1, y+2);
	    if (!solved)
		solve(x-2, y-1);
	    if (!solved)
		solve(x-1, y-2);

	    if (!solved) {
		board[x][y] = 0;
		count--;
	    }

	}
    }
}
