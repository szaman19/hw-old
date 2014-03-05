import java.util.*;
public class Queen{

    public static void solve(int[][] board,int count){
	if(count < 8){
	    for(int x = 0; x < board.length; x++){
		for(int y = 0; y < board[x].length; y++){
		    if(check(board,x,y)){
			board[x][y] = 1;
			solve(board,count+1);
			board[x][y] = 0;
		    }
		}
		System.out.println();
	    }

	}else{
	    for(int x = 0; x < board.length; x++){
		for(int y = 0; y < board[x].length; y++){
		    System.out.print(board[x][y] + " ");
		}
		System.out.println();
	    }
	    System.exit(0);
	}
    }
    
    public static boolean check(int[][] board, int x, int y){
	for(int z = 0; z < board.length;z++){
	    if(board[z][y] == 1){
		return false;
	    }
	}
	for(int z = 0; z < board[x].length;z++){
	    if(board[x][z] == 1){
		return false;
	    }
	}
	
	int min = 0;
	int max = 0;
	if(x<y){
	    min = x;
	    max = board.length - y;
	}else{
	    min = y;
	    max = board.length - x;
	}
	if(min<=max){

	for(int z = 0; z < min ;z++){
	    if(board[x-z][y-z] == 1){
		return false;
	    }
	    if(board[x-z][y+z] == 1){
		return false;
	    }
	}
	for(int z = 0; z < max;z++){
	    if(board[x+z][y+z] == 1){
		return false;
	    }
	    if(board[x+z][y-z] == 1){
		return false;
	    }
	}
	}else{
	    for(int z = 0; z < min ;z++){
	    if(board[x-z][y-z] == 1){
		return false;
	    }
	    if(board[x+z][y-z] == 1){
		return false;
	    }
	    }
	    for(int z = 0; z < max;z++){
		if(board[x+z][y+z] == 1){
		    return false;
		}
		if(board[x-z][y+z] == 1){
		    return false;
		}
	    }
	}
	return true;

    }


    public static void main(String[] args){
	int[][] board = new int[8][8];
	for(int x = 0; x < board.length; x++){
	    for(int y = 0; y > board[y].length; y++){
		board[x][y] = 0;
	    }
	}
	solve(board,0);
    }


}
