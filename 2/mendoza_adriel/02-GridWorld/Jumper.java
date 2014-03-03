import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

//A Jumper is an actor that jumps over rocks and flowers and turns.

public class Jumper extends Actor{

    public Jumper(){
	super();
    }

    public void act(){
	if(canJump()){
	    jump();
	}else{
	    turn();
	}
    }

    public void turn(){
	setDirection(getDirection() + 45);
    }


    public void jump()
    {
	Grid<Actor> g = getGrid();
	if(g == null){
	    return;
	}
	Location now = getLocation();
	Location front = front.getAdjacentLocation(getDirection());
	Location twofront = twofront.getAdjacentLocation(getDirection());
	if(g.isValid(twofront)){
	    moveTo(twofront);
	}
	else{
	    removeSelfFromGrid();
	}
    }


    public boolean canJump(){
	Grid<Actor> g = getGrid();
	if(g == null){
	    return false;
	}
	Location now = getLocation();
	Location front = loc.getAdjacentLocation(getDirection());
	if(!g.isValid(next)){
	    return false;
	}
	Actor a = g.get(front);
	if(!((a == null) || (a instanceof Flower) || (a instanceof Rock))){
	    return false;
	}
	Location twofront = front.getAdjacentLocation(getDirection());
	if(!g.isValid(twofront)){
	    return false;
	}
	a = g.get(twofront);
	return (a == null) || (a instanceof Flower) || (a instanceof Rock);
    }
}
