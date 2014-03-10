import info.gridworld.actor.Bug; 
/** 
 * A BoxBug traces out a square “box” of a given size. 
 * The implementation of this class is testable on the AP CS A and AB Exams. 
 */ 
public class BoxBug extends Bug 
{ 
    private int steps; 
    private int sideLength; 
    
    /** 
     * Constructs a box bug that traces a square of a given side length. 
     * @param length the side length 
     */ 
    public BoxBug(int length) 
    { 
	steps = 0; 
	sideLength = length; 
    } 
    
    
    /** 
     * Moves to the next location of the square. 
     */ 
    public void act() 
    { 
	if (steps < sideLength && canMove()) 
	    { 
		move(); 
		steps++; 
	    } 
	else 
	    { 
		
		turn(); 
		steps = 0; 
	    } 
    } 
} 

/** 
    1. Write a class CircleBug that is identical to BoxBug, except that in the act method the turn 
    method is called once instead of twice. How is its behavior different from a BoxBug? 
    This makes an octagon instead of a square.
    
*/ 
public class CircleBug extends Bug 
{ 
    private int steps; 
    private int sideLength; 
    
    public CircleBug(int x) 
    { 
	steps = 0
	    sideLength = x; 
    } 
    
    public void act() 
    { 
	if (steps < sideLength && canMove()) 
	    { 
		move(); 
		steps++; 
	    } 
	else 
	    { 
		
		turn(); 
		steps = 0; 
	    } 
    } 
} 

/** 
    2. Write a class SpiralBug that drops flowers in a spiral pattern. Hint: Imitate BoxBug, but adjust the side 
    length when the bug turns. You may want to change the world to an UnboundedGrid to see the spiral 
    pattern more clearly. 
    
    
*/ 
public class SpiralBug extends Bug 
{ 
    private int steps; 
    private int sideLength; 
    
    public SpiralBug(int x) 
    { 
	steps = 0; 
	sideLength = x; 
    } 
    
    public void act() 
    { 
	if (steps < sideLength && canMove()) 
	    { 
		move(); 
		steps++; 
	    } 
	else 
	    { 
		turn(); 
		turn();
		steps = 0;
		sideLength = sideLength + 2;
	    } 
    } 
} 

/** 
    3. Write a class ZBug to implement bugs that move in a “Z” pattern, starting in the top left corner. After 
    completing one “Z” pattern, a ZBug should stop moving. In any step, if a ZBug can’t move and is still 
    attempting to complete its “Z” pattern, the ZBug does not move and should not turn to start a new side. 
    Supply the length of the “Z” as a parameter in the constructor. The following image shows a “Z” pattern of 
    length 4. Hint: Notice that a ZBug needs to be facing east before beginning its “Z” pattern. 
    
    
    
*/ 
public class ZBug  extends Bug
{
    private int steps;
    private int sideLength;
    private int sides;
    
    
    public ZBug(int length)
    {
        setDirection(Location.EAST);
        steps = 0;
        sideLength = length;
        sides=1;
    }
    
    public void act() 
    {
	
        if(sides<=3 && steps<sideLength){
	    if(canMove())
		{
		    move();
		    steps++;
		    
		}
	}
        else if(sides==1){
	    setDirection(Location.SOUTHWEST);
	    steps = 0;
	    sides++;
        }
	else if(sides==2){
	    setDirection(Location.EAST);
	    steps = 0;
	    sides++;
        }
    }    
}

/** 
    4. Write a class DancingBug that “dances” by making different turns before each move. The DancingBug 
    constructor has an integer array as parameter. The integer entries in the array represent how many times the 
    bug turns before it moves. For example, an array entry of 5 represents a turn of 225 degrees (recall one turn is 
    45 degrees). When a dancing bug acts, it should turn the number of times given by the current array entry, 
    then act like a Bug. In the next move, it should use the next entry in the array. After carrying out the last 
    turn in the array, it should start again with the initial array value so that the dancing bug continually repeats 
    the same turning pattern. 
    The DancingBugRunner class should create an array and pass it as a parameter to the DancingBug 
    constructor.
    
    
    
*/ 
public class DancingBug extends Bug 
{ 
    private int[] dancingBugArray; 
    private int hold; 
    
    public DancingBug(int[] turns) 
    { 
	dancingBugArray = turns; 
	hold = 0; 
    } 
    
    public void turn(int times) 
    { 
	for(int j = 1; j <= times; j++) 
	    { 
		turn(); 
	    } 
    } 
    
    public void act() 
    { 
	if(hold == dancingBugArray.length) 
	    hold = 0; 
	turn (dancingBugArray[hold]); 
	hold++; 
	super.act();//because it said, act like a bug
	//super can be anywhere here, but if it is a constructor, it HAS to be the first line
	
    } 
} 


