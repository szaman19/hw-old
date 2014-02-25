/*
	Solution to classic Knight's Tour problem
	"A knight's tour is a sequence of moves of a knight on a chessboard such that the knight visits every square only once. 
	For an N*N board, find a Knight's Tour."

	I'm using a simple DFS traversal for this one.
*/

/*its broken and i dont know why! 
It makes moves it's not allowed to make ...
example :

 1 28 36 21  7 27
35 22  8 26 12 20
29  2 13  4 15  6
25 33 23  9 18 11
31 30  3 14  5 16
34 24 32 17 10 19
From 19->20, wtf is it doing?

I suspect the program borked, went back to 18 and THEN to 20 (which is perfectly legal) but for some reason forgot that it already went over
18 while at the same time recording that it went over 18...wtf?
I tried changing it so you have to pass 'board' as a parameter to dfs() ... to no avail. Same result
*/
public class Knight {
    private int[][] board;
    private int n;
    private int counter;
    private boolean solved;
    public static void main(String[] args) throws NumberFormatException {
		int setNum = 8;
		if (args.length == 0) 
			System.out.println("You can pass a board-size as a parameter if you want. Just run 'java Knight $int'. I'll use 8 for now.");
		else
			setNum = Integer.parseInt(args[0]);
		Knight newKnight = new Knight(setNum);
		System.out.println("The board, with each number N on the grid being the Nth spot the Knight goes to");
		newKnight.dfs(0,0);
	}

    public Knight(int n) {
    	board = new int[n][n];
		this.n = n;
    }

    public void dfs(int x, int y) {
		if (!solved) {
			boolean inBounds = x >= 0 && x < n && y >= 0 && y < n;
		if (!inBounds || board[x][y] != 0) 
	    	return;
	    this.board[x][y] = counter++;
	    if (counter == n*n) {
	    	solved = true;
	    	System.out.println(this.toString());
	    	return;
	    }
	    int[][] pairs = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
	    //instead of wall-of-tail-recursive-calls, i put them in a loop
	   	for (int i = 0; i < pairs.length && !solved; i ++)  
	    	dfs(x + pairs[i][0],y + pairs[i][1]);
		counter--;
		board[x][y] = 0;
		}
 	}


    public String toString() {
		String answer = new String();
		for (int x = 0; x < n; x++) {
	 	   for (int y = 0; y < n; y++)
			answer += equalSize(board[x][y] + 1) + " ";
		answer += "\n";
		}
		return answer;
    }

    public String equalSize(int num) {
		/*so that each N on the grid gets equal size when printed,I'll insert spaces such that '  1' can take up just as much space as '555' instead of
		unaligned '1' and '555'' */
		String answer = new String();
		int extraSpace = (int) Math.log10(this.n * this.n) - (int) Math.log10(num);
		for (int i = 0; i < extraSpace; i++)
			answer += ' ';
		return answer + num;
	}
    
}
	