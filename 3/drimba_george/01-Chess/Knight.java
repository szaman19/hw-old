import java.io.*;
import java.util.*;

public class Knight{

    private int[][] board;
    private int size;
    private int move;
    private boolean solved = false;

    public Knight(int n){
    size = n;
    move = 1;
    board = new int[n][n];
    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
        board[i][j] = 0;
        }
    }
    }

    public String toString(){
    String ans = "[0;0H";
    for(int i =0 ; i < size; i++){
        for(int j = 0; j < size; j++){
        ans += board[i][j] + " ";
        }
        ans += "\n";
    }
    return ans;
    }
    
    public void delay(int n){
    try{
        Thread.sleep(n);
    }
    catch(InterruptedException e){
        System.exit(0);
    }
    }
    
    public void solve(int x, int y){
    if(move >= size*size && !solved){
        solved = true;
        System.out.println(this);
            System.out.println("Solution");
        return;
    }
    if (x >= size || y >= size || x < 0 || y<0){
        return;
    }
    else if(board[x][y] == 0){
        board[x][y] = move;
        move++;
               solve(x+2, y+1);
        if(!solved){
        solve(x+2,y-1);
        }
        if(!solved){
        solve(x+1,y+2);
        }
        if(!solved){
        solve(x-1,y+2);
        }
        if(!solved){
        solve(x-2,y+1);
        }
        if(!solved){
        solve(x-2,y-1);
        }
        if(!solved){
        solve(x-1,y-2);
        }
        if(!solved){
        solve(x+1,y-2);
        }
        if(!solved){
        board[x][y] = 0;
        move--;
        }
    }
    }
}