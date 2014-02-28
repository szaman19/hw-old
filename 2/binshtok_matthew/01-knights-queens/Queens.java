//Matthew Binshtok
//Queens

public class Queens{

    private int[][] board;
    private int d;
    private boolean done;

    public Queens( int dimension ){
	d = dimension;
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

    public boolean attacksPossible(){
	int[] takencols = new int[d];
	int[] takenrows = new int[d];
	int[][] locations = new int[2][d];
	int queens = 0;
	// Rows and Columns
	for (int row = 0; row < d; row++){
	    for (int col = 0; col < d; col++){
		System.out.println(board[row][col]);
		if (board[row][col] != 0){
		    queens++;
		    locations[0][queens] = row;
		    locations[1][queens] = col;
		    takencols[col]++;
		    takenrows[row]++;
		}
	    }
	}
	for (int i = 0; i < d; i++){
	    if( takencols[i] > 1 || takenrows[i] > 1 ){
		return true;
	    }
	}
	
	// Diagonals
	for (int i = 0; i < d-1; i++){
	    for (int j = i+1; j < d; j++){
		System.out.println(locations[0][i]);
	        System.out.println(locations[0][j]);
		return (locations[0][i]-locations[0][j]) == (locations[1][i]-locations[1][j]) && (locations[0][i] != locations[0][j]);
	    }
	}
	return false;
    }

    public void solve( int row, int col, int queen ){


	//Base Cases 

	//1 Done
	if (queen > d){
	    done = true;
	    System.out.println("Solution found.");	    
	    return;
	}

	//2 Already Queen Here
	if (board[row][col] != 0){
	    return;
	}

	//3 Attacks Possible
	System.out.println(attacksPossible());
	if (attacksPossible()){
	    return;
	}

	// Assume you're on the right track...
	board[row][col] = queen;


	//Testing Instrument
	System.out.println(this);

	// Recursively solve...
	if (!done && onBoard(row+1,col+1)){
	    solve(row+1,col+1,queen+1);
	}
	if (!done && onBoard(row-1,col+1)){
	    solve(row-1,col+1,queen+1);
	}
	if (!done && onBoard(row+1,col-1)){
	    solve(row+1,col-1,queen+1);
	}
	if (!done && onBoard(row-1,col-1)){
	    solve(row-1,col-1,queen+1);
	}
	if (!done && onBoard(row,col+1)){
	    solve(row,col+1,queen+1);
	}
	if (!done && onBoard(row,col-1)){
	    solve(row,col-1,queen+1);
	}
	if (!done && onBoard(row+1,col)){
	    solve(row+1,col,queen+1);
	}
	if (!done && onBoard(row-1,col)){
	    solve(row-1,col,queen+1);
	}

	if (!done){
	    board[row][col] = 0;
	}

    }

    public static void main( String[] args ){
	
	Queens q = new Queens(4);
	q.solve(0,0,1);
	System.out.println(q);

    }
}
