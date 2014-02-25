import info.gridworld.actor.Bug;

public class ZBug extends Bug {

    private int steps;
    private int sideLength;
    private int side = 0;

    public ZBug(int length) {
	steps = 0;
	sideLength = length;
	setDirection(90);
    }

    public void act() {

	if (steps < sideLength && canMove()) {
	    move();
	    steps++;
	}
	else if (side == 0) {
	    setDirection(225);
	    side++;
	    steps = 0;
	}
	else if (side == 1) {
	    setDirection(90);
	    side++;
	    steps = 0;
	}
    }

}
	