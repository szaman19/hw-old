public class Queen {
	private String[][] grid;
	private int size;
	private boolean solved;
	public Queen (int s){
		size = s;
		grid = new String[s][s];
		for (int a = 0; a < s; a++){
			for (int b = 0; b < s; b++){
				grid[a][b] = ".";
			}
		}
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
    
    public boolean safe(int x, int y){
    	boolean out = true;
    	for (int a = 0; a < size; a++){
    		for (int b = 0; b < size; b++){
    			out = out && (grid[a][b].equals(".") || (a != x && b != y &&( Math.abs(y-b)-Math.abs(x-a)!=0 ) ));
    		}
    	}	
    	return out;
    }
    
    public void solve(int x, int y, int queens) {
    	delay(25);
    	if (queens == size){
			solved = true;
	    	return;
		} else if (x >= 0 && x < size && y >= 0 && y < size && grid[x][y].equals(".")){
	    	if (safe(x,y)){
	    		grid[x][y] = "q";
	    		System.out.println(this);
	    		queens++;
	    		
	    		for (int a = 0; a < size; a++){
	    			solve(a,y+1,queens);
	    		}
	    	}	
	    		
	    	if (!solved) grid[x][y] = ".";
		}
		return;
    }
	
	public String toString(){
		String out = "[0;0H";
		//String out = "";
		for (int a = 0; a < size; a++){
			for (int b = 0; b < size; b++){
				out += grid[a][b];
			}
			out+="\n";
		}
		return out;
	}
	
	public static void main(String[]args){
		Queen q;
		int s;
		if (args.length == 1){
			s = Integer.parseInt(args[0]);
			q = new Queen(s);
		} else {
			s = 10;
			q = new Queen(s);
		}
		System.out.println("[2J");
		System.out.println(q);
		q.solve(1, 0, 0);
		System.out.println(q);

	}
}