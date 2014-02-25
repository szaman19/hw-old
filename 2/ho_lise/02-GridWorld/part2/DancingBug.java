import info.gridworld.actor.Bug;
import java.util.*;
public class DancingBug extends Bug{
    private int[] turns;
    private int index;
    public DancingBug(int L){
	super();
	turns = new int[L];
	for (int x= 0; x<turns.length;x++){
	    turns[x] = (int)(Math.random()*(L-1)) + 1;
	}
	index=0;
    }

    public void act(){
	if (index == turns.length){
	    index = 0;
	}
	int times = turns[index];
	for (int i = 0; i<times; i++){
	    turn();
	}
	
    	if (canMove()){
	    move();
	}
	else{
	    turn();
	}

	index++;
    }
}