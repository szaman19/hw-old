import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    private int count;

    public ZBug(int length){
	steps = 0;
	count = 0;
	sideLength = length;
	setDirection(90);
    }

    public void act(){
	if (count < 3 && steps < sideLength){
	    if (canMove()){
		move();
		steps++;
	    }
	}
	else if (count == 0){
	    setDirection(225);
	    steps = 0;
	    count++;
	}
	else if (count == 1){
	    setDirection(90);
	    steps = 0;
	    count++;
	}
    }
}

