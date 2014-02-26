public class KnightsTour {
    private int[][] board;
    private int count;
    private int n;
    private boolean solved;
   
    public KnightsTour(int length) {
	n = length;
	board = new int[n][n];
	count = 0;
	solved = false;
    }

    public String toString() {
	String str = "[0;0H";
	for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board[0].length; c++) {
		str += board[r][c] + " ";
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
	if (count == (n * n)) {
	    solved = true;
	    System.out.println(this);
	}
	else if ( (x < n) && (y < n) 
		  && (x > -1) && (y > -1) 
		  && (board[x][y] == 0)) {


	    count++;
	    board[x][y] = count;   

	    System.out.println(this);

	    if (!solved) {
		solve(x+2, y+1); }
	    if (!solved) {
		solve(x+1, y+2); }
	    if (!solved) {
		solve(x+2, y-1); }
	    if (!solved) {
		solve(x+1, y-2); }
	    if (!solved) {
		solve(x-2, y+1); }
	    if (!solved) {
		solve(x-1, y+2); }
	    if (!solved) {
		solve(x-2, y-1); }
	    if (!solved) {
		solve(x-1, y-2); }

	    if (count == board[x][y]) {
		board[x][y] = 0;
		count--;
		return;
	    }

	}
    }
}
