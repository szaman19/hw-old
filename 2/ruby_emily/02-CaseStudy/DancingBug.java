import info.gridworld.actor.Bug;
import java.io.*;
import java.util.*;

public class DancingBug extends Bug{
    private int steps, sideLength;
    private int[] dance;

    public DancingBug(int[] a){
	Random r= new Random();
	int k=r.nextInt(10);
	sideLength = k;
	steps = 0;
	dance = a;
    }
    
    public void act(){
	for (int i=0; i<dance.length;i++){
	    if (steps < sideLength && canMove()){
		move();
		steps++;
	    }
	    if (i==(dance.length-1))
		i=0;
	    else{
		setDirection(45*i);
		steps=0;
	    }
	}
    }
}
