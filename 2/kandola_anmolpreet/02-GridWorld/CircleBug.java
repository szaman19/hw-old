import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    private int sideLength = 0;
    private int steps = 0;

    public CircleBug(int a) {
	sideLength = a;
    }

    public void act() {
	if (steps < sideLength && canMove()) {
	    move();
	    steps += 1;
	} else {
	    turn();
	    steps = 0;
	}
    }
}

// The CircleBug doesn't move in a square path, because instead of turning 90 degrees, at every sideLength, it turns at a 45 degree angle, meaning it moves in the path of an Octagon. 
