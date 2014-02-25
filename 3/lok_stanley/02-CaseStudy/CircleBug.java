import info.gridworld.actor.Bug;

public class CircleBug extends Bug{

    private int steps, sideLength;

    public CircleBug(int size){
	steps = 0;
	sideLength = size;
    }

    public void act(){
	
	if (steps < sideLength && canMove()){
	    move();
	    steps++;
	}
	else{
	    turn();
	    steps = 0;
	}
    }
} 