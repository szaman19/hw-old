public class Knights{
    private static int[][] board;
    private static String y = "";

    public static String setup(){
	board = new int[5][5];
	for(int i = 0; i < board.length; i++){
	    for (int n = 0; n < board[0].length; n++){
		y+= "0 ";
	    }
	    y+= "\n";
	}
	return y;
    }

    public static String run(){
	int counter = 1;
	int rows,cols;
	do {
	        if 
		    } while ( (board[rows-2][cols-1] == 0) || (board[rows-1][cols-2] == 0) || (board[rows+1][cols-2] == 0) || (board[rows+2][cols-1] == 0) || (board[rows+2][cols+1] == 0) || (board[rows+1][cols+2] == 0) || (board[rows-1][cols+2] == 0) || (board[rows-2][cols+1] == 0) );
    }

    public static void main(String[]args){
	System.out.println(setup());
    }

}
