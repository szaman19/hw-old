public class Knights{
    public int _size;
    public static final int empty= 0;
    public int _knights;
    public boolean solved=false;
    public int[][] board= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

    public Knights(int board){
	_size=board;
	_knights=0;
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
    public boolean solve(int x,int y){
	if (_knights>=_size*_size){
	    solved=true;
	    System.out.println(this);
	    return true;
	}
	else if(board[x][y] == 0){
	    _knights++;
	    board[x][y]=_knights;
	    System.out.println(this);
	    //delay(400);
	    //System.out.println(_knights);

	    if (!solved && x+2 < _size && y+1< _size)
		solve(x+2,y+1);
	    if (!solved  && x-2 > 0 && y+1<_size)
		solve(x-2,y+1);
	    if (!solved  && x+2 < _size && y-1 > 0)
		solve(x+2,y-1);
	    if (!solved  && x-2 >= 0 && y-1 >= 0)
		solve(x-2,y-1);
	    if (!solved && y+2 < _size && x+1<_size)
		solve(y+2,x+1);
	    if (!solved  && y-2 >= 0 && x+1<_size)
		solve(y-2,x+1);
	    if (!solved  && y+2 < _size && x-1 >= 0)
		solve(y+2,x-1);
	    if (!solved  && y-2 >= 0 && x-1 >= 0)
		solve(y-2,x-1);
	    //board[x][y]=0;
	    //_knights--;
	    //System.out.println(_knights);
	    return true;

	}
	return false;

    }
    public static void main (String[] args){
	Knights me=new Knights(5);
	System.out.println("[2J");
	me.solve(0,3);
    }
}