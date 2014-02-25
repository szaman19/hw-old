import java.util.Scanner;

public class Tour{
    private int[][] board;
    private boolean solved;
    private int size;
    private int moves;
    

    public Tour(int n){
	board = new int[n][n];
	this.size = n;
	this.solved = false;
	this.moves = 1;
	for(int y = 0; y < n; y++){
	    for(int x = 0; x < n; x++){
		board[y][x] = 0;
	    }
	}
    }

    public void solve(int x, int y){
	int area = size * size;
	boolean inBounds = (x  >= 0) && (x  < size) && (y  >= 0) && (y  < size);
	if(moves - 1 == area){
	    solved = true;
	    System.out.println("Solved");
	    System.out.println(this);
	    return;
	}else if(inBounds && board[x][y] == 0){
	    board[x][y] = moves;
	    moves ++;
	    if(!solved){
		solve(x+2, y+1);
	    }
	    if(!solved){
		solve(x+2, y-1);
	    }
	    if(!solved){
		solve(x-2, y-1);
	    }
	    if(!solved){
		solve(x-2, y+1);
	    }
	    if(!solved){
		solve(x+1, y+1);
	    }
	    if(!solved){
		solve(x+1, y+2);
	    }
	    if(!solved){
		solve(x-1, y+2);
	    }
	    if(!solved){
		solve(x-1, y-2);
	    }
	    if(!solved){
		board[x][y] = 0;
		moves--;
	    }
	}
    }


    public String toString(){
	String info = "";
	for(int y = 0; y < size; y++){
	    for(int x = 0; x < size; x++){
		info += board[y][x] + " ";
	    }
	    info += "\n";
	}
	return info;
    }
    
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("What should the size of the board be?");
	int bsize = sc.nextInt();
	System.out.println("Starting x coordinate?");
	int xc = sc.nextInt();
	System.out.println("Starting y coordinate?");
	int yc = sc.nextInt();
	Tour game = new Tour(bsize);
	game.solve(xc - 1, yc - 1);
    }
}
	
