public class KnightTour{
    private boolean solved;

    public KnightTour(){
	solved = false;
    }

    public void print(int[][] b){
	for (int x = 0; x < b.length; x ++){
	    for (int y = 0; y < b[0].length; y ++){
		System.out.print(b[x][y] + "  ");
	    }
	    System.out.print("\n");
	}
    }

    public int[][] tour(int l, int w){
	int[][] board = new int[l][w];
	for (int x = 0; x < l; x ++){
	    for (int y = 0; y < w; y ++){
		tourDo(x, y, board, 1);
		if (solved){
		    print(board);
		    return board;
		}
	    }
	}
	
	System.out.println("No solution");
	print(board);
	return board;
    
    }

    public int[][] tourDo(int x, int y, int[][] board, int num){
	if(board[x][y] == 0){
	    board[x][y] = num;
	    if (num == board.length * board[0].length){
		solved = true;
		return board;
	    }
	    num ++;
	    if(!solved){
		if(x + 2 < board.length && y + 1 < board[0].length
		   && x + 2 >= 0 && y + 1 >= 0)
		    tourDo(x + 2, y + 1, board, num);
	    }
	    if(!solved){
		if(x + 2 < board.length && y - 1 < board[0].length
		   && x + 2 >= 0 && y - 1 >= 0)
		    tourDo(x + 2, y - 1, board, num);
	    }
	    if(!solved){
		if(x - 2 < board.length && y + 1 < board[0].length
		   && x - 2 >= 0 && y + 1 >= 0)
		    tourDo(x - 2, y + 1, board, num);
		
	    }
	    if(!solved){
		if(x - 2 < board.length && y - 1 < board[0].length
		   && x - 2 >= 0 && y - 1 >= 0)
		    tourDo(x - 2, y - 1, board, num);
	    }
	    if(!solved){
		if(x + 1 < board.length && y + 2 < board[0].length
		   && x + 1 >= 0 && y + 2 >= 0)
		    tourDo(x + 1, y + 2, board, num);
	    }
	    if(!solved){
		if(x + 1 < board.length && y - 2 < board[0].length
		   && x + 1 >= 0 && y - 2 >= 0)
		    tourDo(x + 1, y - 2, board, num);
	    }
	    if(!solved){
		if(x - 1 < board.length && y + 2 < board[0].length
		   && x - 1 >= 0 && y + 2 >= 0)
		    tourDo(x - 1, y + 2, board, num);
	    }
	    if(!solved){
		if(x - 1 < board.length && y - 2 < board[0].length
		   && x - 1 >= 0 && y - 2 >= 0)
		    tourDo(x - 1, y - 2, board, num);
	    }
	    if(!solved){
		board[x][y] = 0;
		num --;
	    }
	    return board;
	}
	return board;
    }
}
