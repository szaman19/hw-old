import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug {
    private int segmentLength;
    private int segment;
    private int steps;
    
    public ZBug(int a) {
	setDirection(Location.EAST);
	steps = 0;
	segment = 1;
	segmentLength = a;
    }

    public void act() {
	if (segment <= 3 && steps < segmentLength) {
	    if (canMove()) {
		move();
		steps += 1;
	    } else if (segment == 1) {
		setDirection(Location.SOUTHWEST);
		steps = 0;
		segment += 1;
	    } else if (segment == 2) {
		setDirection(Location.EAST);
		steps = 0;
		segment += 1;
	    }
	}
    }
}
