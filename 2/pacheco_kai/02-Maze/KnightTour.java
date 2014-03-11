import java.io.*;
import java.util.*;

public class KnightTour{
	public int[][] board;
	public int counter;
	public int size;
	public boolean solved;
	
	public KnightTour(int size){
		this.size=size;
		board = new int[size][size];
		for(int x=0;x<size;x++){
			for(int y=0;y<size;y++){
				board[x][y]=0;
			}
		}
		counter=0;
		solved=false;
	}
	public String toString(){
		String ans="";
		for(int x=0;x<size;x++){
			for(int y=0;y<size;y++){
				ans=ans+" ["+board[x][y]+"] ";
			}
			ans+="\n\n";
		}
		return ans;
	}
	
	private void delay(int n){
		try{
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.exit(0);
		}
	}
	
	public void solve(int x, int y){
		if(counter==size*size){
			solved=true;
		}else if(x>=0 && y>=0 && x<size && y<size && board[x][y]==0){
			counter++;
			board[x][y]=counter;
			//System.out.println(this);
			//delay(500);

			solve(x+2,y+1);
			if(!solved){
				solve(x-2,y+1);
			}
			if(!solved){
			 	solve(x+2,y-1);
			}
			if(!solved){
				solve(x-2,y-1);
			}
			if(!solved){
				solve(x-1,y+2);
			}
			if(!solved){
			 	solve(x+1,y-2);
			}
			if(!solved){
				solve(x-1,y-2);}
			if(!solved){
				solve(x+1,y+2);}
			if(!solved){
			board[x][y]=0;
			counter--;}
		}
	}
	
	public static void main(String[] args){
		KnightTour a = new KnightTour(5);
		a.solve(3,3);
		System.out.println(a.toString());
	}

}