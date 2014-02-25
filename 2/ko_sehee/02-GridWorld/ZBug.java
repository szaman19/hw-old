public class ZBug extends Bug{
    public ZBug(int n) 
    { 
	steps = 0; 
	segment = 1; 
	length = n; 
    } 
 
    public void act() 
    { 

	for (int i=0; i<length; i++){
		move();
		steps++;
	}
	setdirection(225);
	steps = 0;
	for (int i=0; i<length; i++){
	    move();
	    steps++;
	}
	setdirection(90);
	steps = 0;
	for (int i=0; i<length; i++){
	    move();
	}
    }
}

    /* public void act()
    {
	if (segment <= 3 && steps < segmentLength)
	    {
		if (canMove())
		    {
			move();
			steps++;
		    }
	    }
	else if (segment == 1)
	    {
		setDirection(Location.SOUTHWEST);
		steps = 0;
		segment++;
	    }
	else if (segment == 2)
	    {
		setDirection(Location.EAST);
		steps = 0;
		segment++;
	    }
    } */