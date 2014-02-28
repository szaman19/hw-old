public class Board {
    private int[][] board;
    
    public Board(int length, int width) {
	board = new int[length][width];
    }

    public String toString() {
	String str = "";
	for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board[0].length; c++) {
		str += board[r][c] + " ";
	    }
	    str += "\n";
	}
	return str;    
    }
}
