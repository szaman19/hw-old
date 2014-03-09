import java.io.*;
import java.util.*;

<<<<<<< HEAD
public class Maze{
=======
<<<<<<< HEAD
public class Maze{
=======
public class Knights{
>>>>>>> ab38575d5c0fae84586636c3f1f6395986f076f1
>>>>>>> FETCH_HEAD
    public String[][] board;
    public int xcor,ycor;
    public boolean solved = false;
    public int counter;
    final public char knight ='K';
    final public String space = "-";
    final public char ESC = 27;
    
    public Maze(int i,int j){
	board = new String[i][j];
	for (int k = 0;k < i;k++){
	    for (int l = 0;l < j;l++){
		board[k][l] = space;
	    }
	}
	xcor = j;
	ycor = i;
	counter = 1;
	
    }

    public String toString(){
	//test this
	String s = ""; //(char)27 + "0;0H";
	int i,j;
	for (i=0;i<xcor;i++){
		for (j=0;j<ycor;j++){
			s = s + board[j][i];
		    }

		s = s + "\n";
	    }
	return s;
    }
    
    private void delay(int n){
	try{
		Thread.sleep(n);
	}
	catch (InterruptedException e){
	    System.exit(0);
	}
    }
    
    public void solve(int x,int y){
	
	if(x > xcor - 1 || x < 0 || y > ycor - 1 || y < 0)
<<<<<<< HEAD
	    
	    return;
	
=======
<<<<<<< HEAD
	    
	    return;
	
=======
	    return;
>>>>>>> ab38575d5c0fae84586636c3f1f6395986f076f1
>>>>>>> FETCH_HEAD
	if(counter == (xcor * ycor) + 1){
	    System.out.println(this);
	    solved = true;
	}else if(board[x][y]==space){
	    delay(100);
	    //System.out.print((char)27 + "[2J");
	    System.out.println(this);
	    board[x][y] = "" + (counter % 10);
	    counter = counter + 1;
	    if (!solved){
		solve(x+1,y-2);
	    }
	    if (!solved){
		solve(x+2,y-1);
	    }
	    if (!solved){
		solve(x+2,y+1);
	    }
	    if (!solved){
		solve(x+1,y+2);
	    }
	    if (!solved){
		solve(x-1,y+2);
	    }
	    if (!solved){
		solve(x-2,y+1);
	    }
	    if (!solved){
		solve(x-2,y-1);
	    }
	    if (!solved){
		solve(x-1,y-2);
	    }
	    if (!solved){
		delay(100);
		System.out.println(this);
		counter = counter - 1;
		board[x][y] = space;
	    }
	}
    }
    
    public static void main(String[] args){
	
	Maze m = new Maze(5,5);
	
	
	
	m.solve(0,0);
    }

}
