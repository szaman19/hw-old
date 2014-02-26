import info.gridworld.actor.Bug; 
public class DancingBug extends Bug 
{ 
    private int[] turnList; 
    private int currentStep; 
    public DancingBug(int[] turns) 
    { 
	turnList = turns; 
	currentStep = 0; 
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
	if(currentStep == turnList.length) 
	    currentStep = 0; 
	turn (turnList[currentStep]); 
	currentStep++; 
	super.act(); 
    } 
} 


import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
import java.awt.Color; 
public class DancingBugRunner 
{ 
    public static void main(String[] args) 
    { 
	ActorWorld world = new ActorWorld(); 
	int[] turns = {2,2,1,3}; 
	DancingBug ballerina = new DancingBug(turns); 
	ballerina.setColor(Color.ORANGE); 
	world.add(new Location(9, 9), ballerina); 
	world.show(); 
    } 
}