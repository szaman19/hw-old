//Matthew Binshtok
//Knights Tour

public class Knights{

    private int[][] board;
    private int d;
    private boolean done;

    public Knights( int dimension ){
	this.d = dimension;
	board = new int[d][d];
	for (int i = 0; i < d; i++){
	    for (int j = 0; j < d; j++){
		board[i][j] = 0;
	    }
	}
    }

    public String toString(){
	String ret = "";
	for (int i = 0; i < d; i++){
	    for (int j = 0; j < d; j++){
		String square = "";
		int val = board[i][j];
		if (val > 9){
		    square = val + "";
		}
		else if (val <= 9){
		    square = "0" + val;
		}
		ret += square;
		ret += " ";
	    }
	    ret += "\n";
	}
	return ret;
    }

    public boolean onBoard( int row, int col ){
	if (row < 0 || row >= d || col < 0 || col >= d){
	    return false;
	}
	return true;
    }

    public void solve( int row, int col, int turn ){

	//Base Cases 

	//1 Done
	if (turn > d*d){
	    done = true;
	    System.out.println("Solution found.");	    
	    return;
	}

	//2 Already Been Here
	if (board[row][col] != 0){
	    return;
	}

	// Assume you're on the right track...
	board[row][col] = turn;

	// Recursively solve...
	if (!done && onBoard(row+1,col+2)){
	    solve(row+1,col+2,turn+1);
	}
	if (!done && onBoard(row-1,col+2)){
	    solve(row-1,col+2,turn+1);
	}
	if (!done && onBoard(row+1,col-2)){
	    solve(row+1,col-2,turn+1);
	}
	if (!done && onBoard(row-1,col-2)){
	    solve(row-1,col-2,turn+1);
	}
	if (!done && onBoard(row+2,col+1)){
	    solve(row+2,col+1,turn+1);
	}
	if (!done && onBoard(row-2,col+1)){
	    solve(row-2,col+1,turn+1);
	}
	if (!done && onBoard(row+2,col-1)){
	    solve(row+2,col-1,turn+1);
	}
	if (!done && onBoard(row-2,col-1)){
	    solve(row-2,col-1,turn+1);
	}

	if (!done){
	    board[row][col] = 0;
	}

    }

    public static void main( String[] args ){
	
	// 5 Solved
	//Knights k = new Knights(5);
	//k.solve(0,0,1);
	//System.out.println(k);

	// 6 Solved
	// Knights k = new Knights(6);
	// k.solve(0,0,1);
	// System.out.println(k);

	// 7 Solved
	// Knights k = new Knights(7);
	// k.solve(0,0,1);
	// System.out.println(k);

	// 8
	Knights k = new Knights(8);
	k.solve(0,5,1);
	System.out.println(k);

    }
}
