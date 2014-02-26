public class Tour{
		
	private int[][]board;
	private int current = 1;
	//private int x, y;
	private boolean solved = false;


	public Tour(){
		board = new int[5][5];
	} 

    public void wait(int millis){
		try {
		    Thread.sleep(millis);
		}	
		catch (InterruptedException e) {
		}
    }

	public boolean check(){
		for (int rows = 0; rows < 5; rows++){
			for (int col = 0; col < 5; col++){
				if (board[rows][col] == 0){
					solved = false;
					return false;
				}
			}
		}	
		solved = true;
		return true;
	}

	public String toString(){
		for (int rows = 0; rows < 5; rows++){
			for (int col = 0; col < 5; col++){
				System.out.print(board[rows][col]);
				System.out.print(" ");
			}System.out.println("\n");
		}return "";
	}

	public boolean inBounds(int nx, int ny){
		return (nx < 5 && nx >= 0 && ny < 5 && ny >= 0);
	}

	public void solve(int x, int y){
		//wait(500);
		System.out.println(this.toString());
		//System.out.println(board[2][0]);
		if (current == 25)
			return;
		if (!solved && board[x][y] == 0){ 
			board[x][y] = current;
			current +=1;
			if (!solved){
				if (inBounds(x-2, y-1) && board[x-2][y-1] == 0){
					//System.out.println("check1");
					solve(x-2, y-1);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x-1, y+2) && board[x-1][y+2] == 0){
					//System.out.println("check2");
					solve(x-1, y+2);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x-2, y+1) && board[x-2][y+1] == 0){
					//System.out.println("check3");
					solve(x-2, y+1);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x+1, y+2) && board[x+1][y+2] == 0){
					//System.out.println("check4");
					solve(x+1, y+2);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x+2, y+1) && board[x+2][y+1] == 0){
					//System.out.println("check5");
					solve(x+2, y+1);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x-1, y-2) && board[x-1][y-2] == 0){
					//System.out.println("check6");
					solve(x-1, y-2);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x+2, y-1) && board[x+2][y-1] == 0){
					//System.out.println("check7");
					solve(x+2, y-1);
					//current += 1;
				}
			}if (!solved){
				if (inBounds(x+1, y-2) && board[x+1][y-2] == 0){
					//Sys	tem.out.println("check8");
					solve(x+1, y-2);
					//current += 1;
				}
			}board[x][y] = 0;
			current -= 1;
		}
		
	}	
	public static void main(String[] args){
		Tour k = new Tour();
		//System.out.println(k.toString());
		//System.out.println(k.check());
		k.solve(0,0);
		System.out.println(k.toString());
	}

}