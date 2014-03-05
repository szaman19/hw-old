//package game;

import java.io.*;

public class Ktour {
static int board[][]=new int[4][4];
static int value=1;
public static void zero()
{
    for(int i=0;i<4;i++)
        for(int j=0;j<4;j++)
            board[i][j]=0;
}

public static void knightpos(int x,int y)throws IOException
{
    if(value==15)
    {   System.out.println();
    for(int i=0;i<4;i++)
    {
        System.out.println();
        System.out.println();
        for(int j=0;j<4;j++)
        System.out.print("    "+board[i][j]);
    }

        System.exit(0);
    }


    if(x+1<=3 && y+2<=3)
    {
        if(board[x+1][y+2]==0)
        {  board[x+1][y+2]=value++;
           knightpos(x+1,y+2);
        }
    }

    if(x+2<=3 &&y+1<=3)
    {
         if(board[x+2][y+1]==0)
        {
           board[x+2][y+1]=value++;
           knightpos(x+2,y+1);
        }
    }

    if(x-2>=0 &&y-1>=0 )
    {
        if(board[x-2][y-1]==0)
        {board[x-2][y-1]=value++;
           knightpos(x-2,y-1);
        }
    }

    if(x+2<=3 &&y-1>=0)
    {
          if(board[x+2][y-1]==0)
        {board[x+2][y-1]=value++;
           knightpos(x+2,y-1);
        }
    }

    if(x+1<=3 &&y-2>=0)
    {
        if(board[x+1][y-2]==0)
        {board[x+1][y-2]=value++;
           knightpos(x+1,y-2);}
    }

    if(x-1>=0&&y-2>=0)
    {
          if(board[x-1][y-2]==0)
        {board[x-1][y-2]=value++;
           knightpos(x-1,y-2);}
    }

    if(x-2>=0 && y+1<=3)
    {
          if(board[x-2][y+1]==0)
        {board[x-2][y+1]=value++;
           knightpos(x-2,y+1);}
    }

    if(x-1>=0 && y+2<=3)
    {
          if(board[x-1][y+2]==0)
        {board[x-1][y+2]=value++;
           knightpos(x-1,y+2);}
    }
    board[x][y]=0;
    value--;
    return;
}

public static boolean complete() {

    for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            if(board[i][j]==0)
                return false;

    return true;

}


public static void main(String args[])throws IOException
{
    
{
    if(!complete())
            {   
                zero();
                value=1;
                knightpos(-1,-1);
            }

}           
}
}
