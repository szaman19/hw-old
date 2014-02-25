public class Spiralbug extends Bug{
    
    import info.gridworld.actor.Bug;
    
    private int steps = 0;
    private additiveFactor = 2;
    private int spiralFactor = steps + additiveFactor;

    public void act(){
	if (steps < spiralFactor && canMove()){
	    move();
	    steps++;
	}
	else{
	    turn();
	    turn();
	    steps = 0;
	    additiveFactor++;
	    spiralFactor = steps + additiveFactor;
	}
    }
}

    
