public class Queens{
    public int _size;
    public static final int empty= 0;
    public int _Queens;
    public int[][] board= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

    public Queens(int board){
	_size=board;
	_Queens=0;
    }

    public void eliminate(int x,int y,int[][]board){
	for(int i=0;i<board[x].length;i++){
	    if (board[x][i]!=1)
		board[x][i]=9;
	    delay(200);
	    System.out.println(this);
	}
	for(int i=0;i<board[x].length;i++){
	    if (board[i][y]!=1)
		board[i][y]=9;
	    delay(200);
	    System.out.println(this);
	}
	int tx=x;int ty=y;
	while((tx<5) && (ty>=0)){
	    if (board[tx][ty]!=1)
		board[tx][ty]= 9;
	    tx++;ty--;
	    delay(200);
	    System.out.println(this);
	}
	tx=x;ty=y;
	while((tx>=0) && (ty<5)){
	    if (board[tx][ty]!=1)
		board[tx][ty]=9;
	    tx--;ty++;
	    delay(200);
	    System.out.println(this);
	}
	tx=x; ty=y;
	while((tx>=0) && (ty>=0)){
	    if (board[tx][ty]!=1)
		board[tx][ty]=9;
	    tx--;ty--;
	    delay(200);
	    System.out.println(this);
	}
	tx=x;ty=y;
	while((tx<5) && (ty<5)){
	    if (board[tx][ty]!=1)
		board[tx][ty]=9;
	    tx++;ty++;
	    delay(200);
	    System.out.println(this);
	}
    }
    public String toString(){
	String ret= "[0;0H";
	for (int[] x:board){
	    for(int y:x)
		ret+=y+" ";
	    ret+="\n";
	}
	return ret;
    }
    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    

    public Queens solve(int x,int y){
	if (board[x][y]==0 || board[x][y]==9){
	    int temp=board[x][y];
	    board[x][y]=5;
	    delay(200);
	    System.out.println(this);
	    if(temp==0){
		board[x][y]=1;
		temp=1;
		delay(300);
		System.out.println(this);
		eliminate(x,y,board);
		_Queens++;
	    }

	    if (_Queens<_size && x+2 < _size && y+1< _size && board[x+2][y+1]!=5)
		solve(x+2,y+1);
	    if (_Queens<_size  && x-2 > 0 && y+1<_size&& board[x-2][y+1]!=5)
		solve(x-2,y+1);
	    if (_Queens<_size  && x+2 < _size && y-1 > 0&& board[x+2][y-1]!=5)
		solve(x+2,y-1);
	    if (_Queens<_size  && x-2 >= 0 && y-1 >= 0&& board[x-2][y-1]!=5)
		solve(x-2,y-1);
	    if (_Queens<_size  && y+2 < _size && x+1<_size&& board[y+2][x+1]!=5)
		solve(y+2,x+1);
	    if (_Queens<_size  && y-2 >= 0 && x+1<_size&& board[y-2][x+1]!=5)
		solve(y-2,x+1);
	    if (_Queens<_size  && y+2 < _size && x-1 >= 0&& board[y+2][x-1]!=5)
		solve(y+2,x-1);
	    if (_Queens<_size  && y-2 >= 0 && x-1 >= 0 && board[y-2][x-1]!=5)
		solve(y-2,x-1);
	
	
	    board[x][y]=temp;

	}
	delay(300);
	System.out.println(this);
	return this;
    }

    public static void main (String[] args){
	Queens me=new Queens(5);
	System.out.println("[2J");
	System.out.println(me.solve(3,2));
    }
}
	