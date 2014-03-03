public class BreakHWDriver{
    public static void main(String[]args){
	for(int t = 3;t<10;t++){
	    NQueens x = new NQueens(t);
	    x.solve();
	    x.printBoard();
	}
    }
}