import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location;
import java.awt.Color;


public class Jumper extends Actor {
    
    public Jumper (){
	setColor (Color.PINK);
    }
    
    public void act() {
    	if (canJump()){
	    jump(); 
	}else{ 
	    turn();
	} 
    }
    
    public void turn(){ 
    	setDirection(getDirection() + 45); 
    } 

    public boolean canJump() {
    	Grid<Actor> grid = getGrid(); 
	if (grid == null){ 
	    return false; 
	}
	Location loc = getLocation(); 
	Location next = loc.getAdjacentLocation(getDirection()); 
	if (!grid.isValid(next)){
	    return false;
	}
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (!grid.isValid(twoAway)){
	    return false;
	}
	if ((!(grid.get(twoAway) ==null)) && (!(grid.get(twoAway) instanceof Flower))){
	    return false;
	}
	return true;
    }

    public void jump() { 
	Grid<Actor> grid = getGrid(); 
	if (grid == null) 
	    return; 
	Location loc = getLocation(); 
	Location next = loc.getAdjacentLocation(getDirection());
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (grid.isValid(twoAway)){
	    moveTo(twoAway); 
	}
    }
}
