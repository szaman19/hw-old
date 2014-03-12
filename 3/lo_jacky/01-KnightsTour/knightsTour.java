public class knightsTour{
    static int[][] board;
    int steps;

    public knightsTour(int side){
	board = new int[side][side];
	steps = 1;
    }

    public boolean filled(){
	for (int i = 0; i < board.length; i++)
	    for (int j = 0; j < board.length; j++)
		if (board[i][j] == 0)
		    return false;
	return true;
    }

    public void delay(int ms){
	try{
	    Thread.sleep(ms);
	    System.out.println();
	    System.out.println(this);
	    System.out.println();
	}catch(Exception e){
	}
    }

    public void tour(int x, int y){
	if (filled())
	    return;
	else if (x >= board.length || y >= board.length || x < 0 || y < 0)
	    return;
	else if (board[x][y] == 0){
	    board[x][y] = steps;
	    steps++;
	    //delay(500);
	    tour(x+1,y+2);
	    tour(x+1,y-2);
	    tour(x+2,y+1);
	    tour(x+2,y-1);
	    tour(x-1,y+2);
	    tour(x-1,y-2);
	    tour(x-2,y+1);
	    tour(x-2,y-1);
	    if (!filled()){
		board[x][y] = 0;
		steps--;
	    }
	}
    }

    public void clear(){
	for (int i = 0; i < board.length; i++)
	    for (int j = 0; j < board.length; j++)
		board[j][i] = 0;
	steps = 1;
    }

    public String toString(){
	//if (filled()){
	    String boardString = "";
	    for (int i = 0; i < board.length; i++){
		for (int j = 0; j < board.length; j++)
		    boardString += board[j][i] + "  ";
		boardString += "\n";
	    }
	    return boardString;
	    //}
	    //return "Position cannot make tour possible";
    }
	    
    public static void main(String[] args){
	knightsTour a = new knightsTour(5);
	/*
	for (int i = 0; i < a.board.length; i++)
	    for (int j = 0; j < a.board.length; j++){
		System.out.println(i + ", " + j + "\n");
		a.tour(i,j);
		System.out.println(a.toString() + "\n");
		a.clear();
	    }
	*/
	a.tour(3,1);
	System.out.println(a.toString());
    }
}
