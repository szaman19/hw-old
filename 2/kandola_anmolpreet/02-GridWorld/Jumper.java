//GridWorld Case Study Part 3 Group Activity
// 1a. Jumper would turn 45 degrees
// 1b. Jumper would turn 45 degrees
// 1c. Jumper would turn 45 degrees
// 1d. Jumper would remove Actor from Grid
// 1e. Jumper would remove Actor from Grid
// 1f. Can the Jumper jump over actors? I'll say no.
// 2a. Jumper should extend Actor. It says it is an actor in the description.
// 2b. Bug is an actor with similar capabilities of Jumper (canMove/move).
// 2c. No need. Only thing you could add is color, and I don't want to.
// 2d. Act: is different.
// 2e. canJump, Jump, turn
// 2f. To test: create Jumper and JumperRunner. Place one, and test it: make it jump across actors/flowers/rocks, onto actor/flowers/rocks. Set it next to an edge and in a position where two ahead is out of the grid. 

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Actor {
    
    public Jumper() {
	super();
    }

    public void act() {
	if (canJump()) {
	    jump();
	}
	else {
	    turn();
	}
    }

    public void turn() {
	setDirection(getDirection() + Location.HALF_RIGHT);//HALF_RIGHT = 45 deg
    }

    public void jump() {
	Grid<Actor> a = getGrid();
	if (a == null) {
	    return;
	}
	Location b = getLocation();
	Location c = b.getAdjacentLocation(getDirection());
	Location d = c.getAdjacentLocation(getDirection());
	if(b.isValid(d)) {
	    moveTo(d);
	}
	else {
	    removeSelfFromGrid();
	    //setDirection(getDirection() + Location.HALF_RIGHT);
	}
    }

    public boolean canJump() {
	Grid<Actor> a = getGrid();
	if (a == null) {
	    return false;
	    Location b = getLocation();
	    Location c = b.getAdjacent Location(getDirection());
	}
	if (!a.isValid(next)) { // if the next space isn't valid...
	    return false;
	    Actor neighbor = a.get(next);
	}
	if (!((neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Rock))) {
	    return false;
	}
	Location d = next.getAdjacentLocation(getDirection());
	if (!a.isValid(d)) {
	    return false;
	    neighbor = a.get(d);
	    return (neighbor == null || (neighbor instanceof Flower));
	}
    }
