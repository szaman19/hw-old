public class Knight {
	private int[][] grid;
	private int rows, cols;
	private boolean solved;
	public Knight (int size){
		rows = size;
		cols = size;
		grid = new int[rows][cols];
		solved = false;
	}
	
	private void delay(int n) {
		try{
			Thread.sleep(n);
		}
		catch (InterruptedException e) {
		    System.exit(0);
		}
    }
    
    public void solve(int x, int y, int move) {
    	//delay(10);
		if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] <= 0){
			if (move == rows * cols){
				solved = true;
	    		return;
			}
	    	System.out.println(this);
	    		grid[x][y] = move;
	    		move++;
	    		solve(x+2,y-1, move);
	    		if (!solved ) solve(x+2,y+1,move);
	    		if (!solved ) solve(x-2,y-1,move);
	    		if (!solved ) solve(x+2,y+1,move);
	    		if (!solved ) solve(x-1,y+2,move);
	    		if (!solved ) solve(x+1,y+2,move);
	    		if (!solved ) solve(x-1,y-2,move);
	    		if (!solved ) solve(x+1,y-2,move);
	    		
	    		
	    		grid[x][y] = 0;
		}
    }
	
	public String toString(){
		//String out = "[0;0H";
		String out = "";
		for (int a = 0; a < rows; a++){
			for (int b = 0; b < cols; b++){
				out += grid[a][b] + "\t";
			}
			out+="\n";
		}
		return out;
	}
	
	public static void main(String[]args){
		Knight k;
		int size;
		if (args.length == 1){
			size = Integer.parseInt(args[0]);
			k = new Knight(size);
		} else {
			size = 10;
			k = new Knight(size);
		}
		System.out.println("[2J");
		System.out.println(k);
		k.solve((int)(Math.random() * size), (int)(Math.random() * size), 1);
		System.out.println(k);
	}
}