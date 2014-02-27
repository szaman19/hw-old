import java.io.*;
import java.util.*;

public class KnightTour{

	int[][] board = new int[5][5];
	boolean solved = false;
	int x, y = 0;
	int counter = 1;
	int secondCount = 0;
	public KnightTour(){
		for(int i = 0; i < board[0].length; i++){
			for(int j = 0; j<board.length; j++){
				board[i][j] = 0;
				}
			}
		
			
	}
		public void printBoard(){
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try{
				Thread.sleep(0);
			}
				catch (InterruptedException e) {
				System.exit(0);
			}
			for(int i = 0; i < board[0].length; i++){
				for(int j = 0; j<board.length; j++){
					System.out.print(board[i][j] + "   ");
				}
			System.out.println();
			System.out.println();
			}
	}
		public static void main(String[] args){
			KnightTour butt = new KnightTour();
			butt.recurse(0,0);
		}
		
		public void recurse(int x, int y){
			if(counter > 25){
				solved = true;
				return;
			}
			else if(x>4 || y>4){
				
				return;
			}
			else if(x<0 || y<0){
				
				return;
			}
			else if(board[x][y] !=0){
				//counter--;
				return;
			}
			else{
				
				
				board[x][y] = counter;
				counter++;
				
				printBoard();
			
				if(!solved)
					recurse(x+1, y+2); 
				if(!solved)
					recurse(x-1, y-2); 
				if(!solved)
					recurse(x-1, y+2); 
				if(!solved)
					recurse(x+1, y-2); 
				if(!solved)
					recurse(x+2, y+1); 
				if(!solved)	
					recurse(x-2, y-1); 
				if(!solved)
					recurse(x+2, y-1); 
				if(!solved)
					recurse(x-2, y+1); 				
				board[x][y] = 0;
				counter--;
			}
		}

}