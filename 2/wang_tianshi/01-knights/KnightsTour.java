import java.io.*;
import java.util.*;

//creds to Andrew Sikowitz for helping me debug my code :D

public class KnightsTour{
    public int size;
    public int[][] board;
    public int move=0;
    public boolean solved=false;
    public int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    public int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public KnightsTour(int s){
        size=s;
        board=new int[size][size];
        for (int z=0;z<board.length;z++){
            for (int y=0;y<board.length;y++){
                board[z][y]=-1;
            }
        }
    }

    public String toString(){
        int a,b;
        String s="";
        for (a=0;a<size;a++){
            for (b=0;b<size;b++){
                s = s + "\t"+ board[a][b];
            }
            s = s + "\n";
        }
        return s;
    }

    private void delay(int n){
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public void solve(int x, int y){
        if (move==size*size){
            solved=true;
	    System.out.println(this);
        }
        else if (!solved && x>=0 && x<size && y>=0 && y<size){
	    if (board[x][y]==-1){
		//delay(75);
		board[x][y]=move+1;
		move++;
		//System.out.println(this);
		for (int i=0;i<8;i++){
		    solve(x+dx[i],y+dy[i]);
		}
		if (!solved){
		    move --;
		    board[x][y]=-1;
		}
	    }
	}
    }

    public static void main(String[] args){
        KnightsTour knight=new KnightsTour(8);
        knight.solve(0,0);
    }
}
