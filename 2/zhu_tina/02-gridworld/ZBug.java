import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    private int count;

    public ZBug(int x){
	setDirection(Location.EAST);
	steps = 0;
        count = 1;
	sideLength = x;
    }

    public void act(){
	if (count <= 3 && count < sideLength) 
	    { 
		if (canMove()) 
		    { 
			move(); 
			steps++; 
		    } 
	    } 
	else if (count == 1) 
	    { 
		setDirection(Location.SOUTHWEST); 
		steps = 0; 
		count++; 
	    } 
	else if (count == 2) 
	    { 
		setDirection(Location.EAST); 
		steps = 0; 
		count++;
	    }
    }
}
