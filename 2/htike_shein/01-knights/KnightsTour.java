public class KnightsTour{
	private int[][] grid;
	private int steps;
	private int size;
	private boolean solved = false;
	public KnightsTour(int x){
		grid = new int[x][x];
		for(int[] row : grid){
			for(int n : row){
				n = 0;
			}
		}
		size = x;
	}
	private int[] knight(){
		//Returns the ordered coordinates of the knight.
		int[] ret = new int[]{0,0};
		for(int[] row : grid){
			for(int n : row){
				if(n == steps){
					return ret;
				}
				ret[0]++;
			}
			ret[0] = 0;
			ret[1]++;
		}
		return ret;
	}
	private void undo(){
		grid[knight()[1]][knight()[0]] = 0;
		steps--;
	}
	private void move(int x){
		int xm = 1;
		int ym = -1;
		if(x >= 5 && x <= 8){
			xm = -xm;
		}
		if(x >= 3 && x <= 6){
			ym = -ym;
		}
		if (x == 1 || x == 4 || x == 5 || x == 8){
			ym *= 2;

		}
		else{
			xm *= 2;
		}
		int xcor = xm + knight()[0];
		int ycor = ym + knight()[1];
		steps++;
		grid[ycor][xcor] = steps;
	}
	private boolean canMove(int x){
		if(!(x >= 1 && x <= 8)){
			return false;
		}
		int xm = 1;
		int ym = -1;
		if(x >= 5 && x <= 8){
			xm = -xm;
		}
		if(x >= 3 && x <= 6){
			ym = -ym;
		}
		if (x == 1 || x == 4 || x == 5 || x == 8){
			ym *= 2;

		}
		else{
			xm *= 2;
		}
		int xcor = xm + knight()[0];
		int ycor = ym + knight()[1];
		if (!(xcor >= 0 && xcor < size && ycor >= 0 && ycor < size)){
			return false;
		}
		else if(grid[ycor][xcor] > 0){
			return false;
		}
		else{
			return true;
		}
	}
	public String toString(){
		String ret = new String();
		for(int[] row : grid){
			for(int n : row){
				if(n < 10){
					ret += " ";
				}
				ret += n + " ";
			}
			ret += "\n\n";
		}
		return ret;
	}
	private void delay(int n)
	{
		try{
			Thread.sleep(n);
		}catch (InterruptedException e) {
			System.exit(0);
		}
	}
	private void solve(int x) {
		if(canMove(x)){
			move(x);
			if (steps == 25) {
				solved = true;
				System.out.println(this);
				return;
			}
			else{
				System.out.println(this);
				for(int s = 1;s < 8;s++){
					solve(s);
					if(solved){
						break;
					}
				}
				if(!solved)
					undo();
			}
		}
	}
	public void solve(){
		grid[0][0] = 1;
		steps = 1;
		for(int i = 1;i < 8;i++){
			solve(i);
		}
	}
	public static void main(String[] args){
		KnightsTour a = new KnightsTour(5);
		a.solve();
	}
}