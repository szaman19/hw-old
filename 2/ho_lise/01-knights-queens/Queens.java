public class Queens{
    private char[][] board;
    private boolean solved = false;
    final private char queen= 'Q';
    final private char invalid = 'X';
    final private char valid = '_';
    public int timer = 0;
    private int count =0;
   
    public Queens(){
	int n = 5;
	board = new char[n][n];
	for (int a = 0; a<n; a++){
	    for (int b=0;b<n; b++){
		board[a][b] = valid;
	    }
	}
    }
    public Queens(int n){
	board = new char[n][n];
	for (int a = 0; a<n; a++){
	    for (int b=0;b<n; b++){
		board[a][b] = valid;
	    }
	}
    }
    
    private void delay (int d){
	try{
	    Thread.sleep(d);
	}
	catch(InterruptedException e){
	    System.exit(0);
	}
    }
    public String toString(){
	String str = "[0;0H";

	int row, col;
	for (row = 0; row < board.length; row++){
	    for (col = 0; col< board[0].length;col++){
		str= str + "" + board[row][col];
	    }
	    str= str +"\n";
	}
	return str;
    }

    public void adjust(int x, int y, char z){
	left(x,y,z);
	right(x,y,z);
	diagonal(x,y,z);
	top(x,y,z);
	bottom(x,y,z);
	
    }
    public void left(int x, int y, char z){
	if (x-1>=0){
	    board [x-1][y] = z;
	    left(x-1, y, z);
	}
    }
    public void right(int x, int y, char z){
	if (x+1<board.length){
	    board [x+1][y] = z;
	    right(x+1, y, z);
	}
    }
    public void top(int x, int y, char z){
	if (y+1< board.length){
	    board [x][y+1] = z;
	    top(x, y+1, z);
	}
    }
    public void bottom(int x, int y, char z){
	if (y-1>=0){
	    board [x][y-1] = z;
	    bottom(x, y-1, z);
	}
    }
    public void diagonal(int x, int y, char z){
	topright(x,y,z);
	bottomright(x,y,z);
	topleft(x,y,z);
	bottomleft(x,y,z);
    }   
    public void topright(int x, int y, char z){
	if (y+1<board.length && x+1 < board.length){
	    board[x+1][y+1] = z;
	    topright(x+1, y+1, z);
	}
    }

    public void	bottomright(int x, int y, char z){
	if (y-1>=0 && x+1< board.length){
	    board[x+1][y-1] = z;
	    bottomright(x+1, y-1, z); 
	}
    }
    public void topleft(int x, int y, char z){
	if (y+1< board.length && x-1>=0){
	    board[x-1][y+1]=z;
	    topleft(x-1,y+1,z);
	}
    }
    public void bottomleft(int x, int y, char z){
	if (y-1>=0 && x-1>=0){
	    board[x-1][y-1] = z;
	    bottomleft(x-1,y-1,z);
	   
	}
    }
    private boolean filled(){
	return countvalid()<=0;
    }

    private int countvalid(){
	int total = 0;
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j<board.length;j++){
		if (board[i][j] ==valid){
		    total++;
		}
	    }
	}
	return total;
    }
    public void solve(){
	solve(0,0);
	
    }
    public void solve (int x, int y){
	if (count >= board.length){
	    solved = true;
	    System.out.println(this);
	}
	else if (board[x][y] == valid && !filled()){
	    char[][] temp = new char[board.length][board.length];
	    for (int i = 0; i< board.length; i++){
		for (int j=0; j<board.length; j++){
		    temp[i][j] = board[i][j];
		}
	    }
	    /*
	    System.out.println("TEMP");
	    for (char[] X:temp){
		for (char Y: X){
		    System.out.print(Y);
		}
		System.out.println();
	       }
	    */
	    delay(1000);
	    board[x][y] = queen;
	    // invalidate diagonals and top/bottom/left/right
	    adjust(x,y,invalid);
	    System.out.println(this);
	    timer++;
	    count++;
	  
	    if (x+2<board.length && y+1<board[0].length){
		solve(x+2, y+1);
	    }
	    
	    if (!solved){
		if (x+2<board.length && y-1>=0){
		    solve(x+2, y-1);
		}
	    }
	    if (!solved){
		if (x-2 >=0 && y-1 >=0){
		    solve(x-2, y-1);
		}
	    }
	    if (!solved){
		if (x-2 >= 0 && y+1<board[0].length){
		    solve(x-2, y+1);
		}
	    }
	    if (!solved){
		if (x+1<board.length && y-2 >= 0){
		    solve(x+1, y-2);
		}
	    }
	    if (!solved){
	        if (x-1 >= 0 && y-2 >= 0){
		    solve(x-1, y-2);
		}
	    }
	    if (!solved){
		if (x+1<board.length && y+2<board[0].length){
		    solve(x+1, y+2);
		}
	    }
	    if (!solved){
		if (x-1 >= 0 && y+2<board[0].length){
		    solve(x-1, y+2);
		}
	    }
	    for (int i = 0; i< board.length; i++){
		for (int j=0; j<board.length; j++){
		    board[i][j] = temp[i][j];
		}
	    }
	    if (!solved){
	
		count--;
	    }
	}
	else{}
	    
    }
    public static void main (String[]args){
	Queens A = new Queens(5);

	System.out.println("[2J");
	System.out.println(A);
	A.solve();

	

    }
}