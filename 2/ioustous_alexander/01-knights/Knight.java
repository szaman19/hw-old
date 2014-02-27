public class Knight {
    
    private static int[][] board;
    private static int x, y;
    private static int tempnum = 1;
    private static boolean solved = false;
    
    
    public static void makeboard (int x1,int y1){
	x = x1;
	y =y1;
	board = new int[x][y];
    }

   
    public static void solve (int xlocation, int ylocation){
	if (solved == true){
	    return;
	}
	if (xlocation < 0){
	    return;
	}
	if (ylocation < 0){
	    return;
	}
	if (xlocation > x-1){
	    return;
	}
	if (ylocation > y-1){
	    return;
	}
       
	
	if (board[xlocation][ylocation] == 0){
	    board[xlocation][ylocation] = tempnum;
	    if (tempnum == 25){
		
		solved= true;
		return;
	    }
	    tempnum+=1;	       
	    
	    solve (xlocation -1, ylocation +2);
	    solve (xlocation +1, ylocation +2);
	    solve (xlocation -1, ylocation -2);
	    solve (xlocation +1, ylocation -2);

	    solve (xlocation -2, ylocation +1);
	    solve (xlocation +2, ylocation +1);
	    solve (xlocation -2, ylocation -1);
	    solve (xlocation +2, ylocation -1);
	    
	}
        
    }

    public static void print(int [][] stuff){
	String returnval = "";
	for (int i = 0; i < x; i++){
	    for (int h = 0; h < y; h++){
		if (stuff[i][h] < 10){
		    returnval += " ";
		}
		returnval += stuff[i][h];
		returnval += " ";
	    }
	    returnval += "\n";
	}
	System.out.println (returnval);
    }


    public static void main (String [] args){
	makeboard(5,5);
	solve(0,0);
	print(board);
    }
}
    
