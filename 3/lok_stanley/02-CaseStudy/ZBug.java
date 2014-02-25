import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    

    public ZBug(int length){
	steps = 0;
	sideLength = length;
	setDirection(90);
    }
    
    
    public void act(){
	int count = 0; 
	if (steps < sideLength){
	    if(canMove()){
		move();
	    }
	    steps++;
	}
	else if(count == 0){
	    turn();
	    turn();
	    turn();
	    steps = 0;
	    count++;
	}
	else if(count == 1){
	    setDirection(90);
	    steps = 0;
	}
    }
} 