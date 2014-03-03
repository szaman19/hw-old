import info.gridworld.actor.Bug;
public class CircleBug extends Bug {
    public int steps;
    public int sideLength;
    public CircleBug(int length){
	super();
	steps = 0;
	sideLength = length;
    }

    public void act(){
	if (steps<sideLength && canMove()) {
	    move();
	    steps++;
	}
	else{
	    turn();
	    steps=0;
	}
    }



}