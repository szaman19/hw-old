import java.util.*;


public class KTour{

    public static void KTourHelper(int length){
	int[][] board = new int[length][length];

	for(int x = 0; x < board.length;x++){
	    for(int y = 0;y < board[x].length;y++){
		board[x][y] = 0;
	    }
	}
	Random rand =  new Random();
	int num1 = rand.nextInt(5);
	int num2 = rand.nextInt(5);
	board[num1][num2] = 1;
	KTour(board,1,length*length,num1,num2);

    }
    
    public static void printB(int[][] board){
	for(int x = 0; x < board.length;x++){
	    for(int y = 0;y < board[x].length;y++){
		System.out.print(board[x][y] + " ");
	    }
	    System.out.println();
	}
	System.out.println();
	
    }

    public static void KTour(int[][] board, int move, int maxMove,int x, int y){
	if(move < maxMove){
		if(x+2 < board.length && y+1 < board[x].length && board[x+2][y+1] == 0){
		    board[x+2][y+1] = move+1;
		    KTour(board,move+1,maxMove,x+2,y+1);
		    board[x+2][y+1] = 0;
		}
		if(x+2 < board.length && y-1 >= 0 && board[x+2][y-1] == 0){
		    board[x+2][y-1] = move+1;
		   
		    KTour(board,move+1,maxMove,x+2,y-1);
		    board[x+2][y-1] = 0;
		}
		if(x-2 >= 0 && y+1 < board[x].length && board[x-2][y+1] == 0){
		    board[x-2][y+1] = move+1;
		   
		    KTour(board,move+1,maxMove,x-2,y+1);
		    board[x-2][y+1] = 0;
		}
		if(x-2 >= 0 && y-1 >= 0 && board[x-2][y-1] == 0){
		    board[x-2][y-1] = move+1;
		 
		    KTour(board,move+1,maxMove,x-2,y-1);
		    board[x-2][y-1] = 0;
		}
		if(x+1 < board.length && y+2 < board[x].length && board[x+1][y+2] == 0){
		    board[x+1][y+2] = move+1;
		 
		    KTour(board,move+1,maxMove,x+1,y+2);
		    board[x+1][y+2] = 0;
		}
		if(x+1 < board.length && y-2 >= 0 && board[x+1][y-2] == 0){
		    board[x+1][y-2] = move+1;
		   
		    KTour(board,move+1,maxMove,x+1,y-2);
		    board[x+1][y-2] = 0;
		}
		if(x-1 >= 0 && y+2 < board[x].length && board[x-1][y+2] == 0){
		    board[x-1][y+2] = move+1;
		 
		    KTour(board,move+1,maxMove,x-1,y+2);
		    board[x-1][y+2] = 0;
		}
		if(x-1 >= 0 && y-2 >= 0 && board[x-1][y-2] == 0){
		    board[x-1][y-2] = move+1;
		  
		    KTour(board,move+1,maxMove,x-1,y-2);
		    board[x-1][y-2] = 0;
		}
	}else{
	      printB(board);
	      System.exit(0);
	}
    }

    public static void main(String[] args){
	KTourHelper(8);
    }

    

}
