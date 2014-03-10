 import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Grid;
import info.gridworld.actor.Location;
import java.awt.Color;


public class Jumper extends Actor
{
  

    public Jumper () {
	setColor (Color.RED);
    }


    /**
     *Jump moves Jumper two spaces forward
     */
    public void jump () {
	Grid<Actor> grid = getGrid();
	if (grid == null)
	    return ;
	Location a = getLocation ();
	Location b = loc.getAdjacentLocation(getDirection()); //Get one step
	Location c = b.getAdjacentLocation (getDirection()); //Get two steps
	if (grid.isValid(c))
	    moveTo (c);
	else 
	    removeSelfFromGrid();
    }


    public boolean canJump() {
	Grid<Actor> grid = getGrid();
	if (grid == null)
	    reutnr false;
	Location a = getLocation ();
	Location b = loc.getAdjacentLocation(getDirection()); //Get one step
	Location c = b.getAdjacentLocation (getDirection()); //Get two steps
	if (!grid.isValid(b))
	    return false;
	Actor next = grid.get(b);
	if (!((next == null) || (next instanceof Flower) || (next instanceof Rock)))
	    return false;
	if (!grid.isValid(c))
	    return false;
	next = grid.get(c);
	return (next == null) || (next instanceof Flower);
    }



    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
	if (canJump())
	    jump();
	else
	    setDirection(getDirection() + Location.HALF_RIGHT);
      
    }
}