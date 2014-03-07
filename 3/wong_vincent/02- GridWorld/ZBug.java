import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    
    private int steps;
    private int sideLength;
    private int sideNumber=1;
    private int throwaway;
    
    public ZBug(int length) {
	steps = 0;
	sideLength = length;
    }
    
    public void act() {
	if (steps == sideLength && sideNumber == 3) {
	    throwaway++;
	}	
	
	if  (steps < sideLength && canMove()) {
	    move();
	    steps++;
	}
	else {
	    if (sideNumber == 1) {
		setDirection (225);
		steps = 0;
		sideNumber ++;
	    }
	    if (sideNumber == 2) {
		setDirection (90);
		steps = 0;
		sideNumber ++;
	    }
	}
    }
}
