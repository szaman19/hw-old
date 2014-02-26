import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
    private int sideLength;
    private int steps;

    public SpiralBug (int a) {
	sideLength = a;
	steps = 0;
    }
    
    public void act() {
	if (steps < sideLength && canMove()) {
	    move();
	    steps += 1;
	} else {
	    turn();
	    turn();
	    steps = 0;
	    sideLength += 1;
	}
    }
}
