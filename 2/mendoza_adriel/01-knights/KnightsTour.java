public class KnightsTour{
    private int[][] board;
    private boolean solved;
    private int moves;
    private int bsize;    

    public KnightsTour(int n){
	board = new int[n][n];
	this.bsize = n;
	this.solved = false;
	this.moves = 1;
	for(int y = 0; y < n; y++){
	    for(int x = 0; x < n; x++){
		board[y][x] = 0;
	    }
	}
    }

    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public void solve(int x, int y){
	int field = bsize * bsize;
	boolean inBounds = (x >= 0) && (x < bsize) && (y >= 0) && (y < bsize);
	if(moves - 1 == field){
	    solved = true;
	    System.out.println(this);
	    return;
	}else if(inBounds && board[x][y] == 0){
	    delay(80);
	    board[x][y] = moves;
	    moves += 1;
	    System.out.println(this);
	    if(!solved){
		solve(x+1, y+1);
	    }
	    if(!solved){
		solve(x+1, y+2);
	    }
	    if(!solved){
		solve(x+2, y+1);
	    }
	    if(!solved){
		solve(x+2, y-1);
	    }
	    if(!solved){
		solve(x-1, y+2);
	    }
	    if(!solved){
		solve(x-1, y-2);
	    }
	    if(!solved){
		solve(x-2, y-1);
	    }
	    if(!solved){
		solve(x-2, y+1);
	    }
	}
    }

    public String toString(){
	String info = "[0;0H";
	for(int y = 0; y < bsize; y++){
	    for(int x = 0; x < bsize; x++){
		info += board[y][x] + " ";
	    }
	    info += "\n";
	}
	return info;
    }
    
    public static void main(String[]args){
	KnightsTour t = new KnightsTour(5);
	System.out.println("[2J");
	t.solve(3,3);
    }
}
