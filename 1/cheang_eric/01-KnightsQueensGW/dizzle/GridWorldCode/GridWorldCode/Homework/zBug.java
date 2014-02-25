import info.gridworld.actor.Bug; 
import info.gridworld.grid.Location; 

public class zBug extends Bug{ 
    
    private int steps; 
    private int sideLength; 
    private int count; 
    
    public zBug(int length) 
    { 
	/* 
	 * superclass' default constructor is being called 
	 */ 
	steps = 0; 
	sideLength = length; 
	count = 0; 
	setDirection(Location.EAST); 
    } 
    
    public void act() 
    { 
	if ( count != 3){ 
	    if ( canMove() == false){ 
		count = 3; 
	    } 
	    else if (steps < sideLength && canMove()) 
		{ 
		    move(); 
		    steps++; 
		} 
	    else 
		{ 
		    steps = 0; 
		    count ++; 
		    if (count ==1) 
			setDirection(Location.SOUTHWEST); 
		    else if (count ==2) 
			setDirection(Location.EAST); 
		} 
	} 
    } 
} 
