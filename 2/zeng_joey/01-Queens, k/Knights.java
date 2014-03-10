

public class Knights{
    private int[][] board;
    private int high;
    private boolean solved;

    public Knights(){
	board = new int[5][5];
	high = 0;
    }

    public String toString(){
	String s = "";
	for(int r = 0; r < 5; r++){
	    for(int c = 0; c < 5; c++){
		s += " ";
		if (board[r][c] < 10)
		    s += " ";
		s += board[r][c];
	    }
	    s += "\n";
	}
	return s + "\n";
    }
    
    private void delay(int n){
	try{
	    Thread.sleep(n);
	}
	catch(InterruptedException e){
	    System.exit(0);
	}
    }
    
    public void solve(int x, int y){
	System.out.println(this);
	if (high == 25){
	    solved = true;
	    System.out.println(this);
	}
	else if (x < 5 && y < 5 && x >= 0 && y >=0 &&
		 board[x][y] == 0){
	    //	    delay(100);
	    board[x][y] = ++high;
	    solve(x+1,y+2);
	    if (!solved)
		solve(x+1,y-2);
	    if (!solved)
		solve(x+2,y+1);
	    if (!solved)
		solve(x+2,y-1);
	    if (!solved)
		solve(x-1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    if (!solved)
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	    board[x][y] = 0;
	    high --;
	}
    }
    
    public static void main(String[] args){
	Knights k = new Knights();
	
	System.out.println("[23");
	k.solve(0,0);
    }
}
	    
