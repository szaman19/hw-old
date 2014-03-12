import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    private int steps;
    private int sideLength;

    public CircleBug(int n) {
    	steps = 0;
        sideLength = n;
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            steps = 0;
        }
    }
}

public class SpiralBug extends Bug { 
	private int steps; 
	private int sideLength; 

	public SpiralBug(int n) { 
		steps = 0; 
		sideLength = n; 
	} 

	public void act() { 
		if (steps < sideLength && canMove()) { 
			move(); 
			steps++; 
		} else { 
			turn(); 
			turn(); 
			steps = 0; 
			sideLength = sideLength; 
		} 
	} 
}

public class ZBug extends Bug { 
	private int sideLength;
	private int steps;
	private int part; 

	public ZBug(int n) { 
		setDirection(90); 
		steps = 0; 
		part = 0; 
		sideLength = n; 
	} 

	public void act() { 
		if (part <= 2 && steps < sideLength && canMove()) 
		{ 
			move(); 
			steps++; 
		} 
		else if (part == 0){ 
			setDirection(225); 
			steps = 0; 
			part++; 
		} 
		else if (part == 1) { 
			setDirection(90); 
			steps = 0; 
			part++; 
		} 
	} 
} 

public class DancingBug extends Bug{ 
	private int[] turns; 
	private int step; 

	public DancingBug(int[] tl){ 
		turns = tl; 
		step = 0; 
	} 

	public void turn(int n) { 
		for(int i = 1; i <= n; i++)	{ 
			turn(); 
		} 
	} 

	public void act() { 
		if(step == turns.length) 
			step = 0; 
		turn(turns[step]); 
		step++; 
		super.act(); 
	} 
} 

/*
1. Add BoxBug
BoxBug bug2 = new BoxBug(1); 

2. world.add(new Location(0,0), bug2);

*/
