import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private boolean isComplete = false;
    private boolean turned = false;
    private int sideLength, steps;
    
    public ZBug(int length){
	sideLength = length;
	steps = 0;
	this.setDirection(90);
    }

    public void act(){
	if (steps < sideLength && canMove()){
		move();
		steps++;
	    }
	    else if (getDirection()==90 && !turned) {
	        setDirection(225);
		steps = 0;
	    }
	   
	    else if (getDirection()==225){
		setDirection(90);
		steps = 0;
		turned = true;
	    }
	  
       
    }
}
