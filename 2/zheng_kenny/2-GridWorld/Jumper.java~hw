/*
  CASE STUDY PART 3
  1. Specifications:
  a. the jumper will turn if the space two blocks in front is occupied.
  b. the jumper will turn if the space two blocks in front is off the grid.
  c. the jumper will turn if it is facing the edge of the grid.
  d. the jumper will turn if there is an actor two blocks in front of it.
  e. the jumper will turn if there is another jumper in its path.
  f. how much should the jumper turn by?

  2. Design:
  a. Jumper should extend the Actor class.
  b. the Bug class is similar to the Jumper class.
  c. The constructor should create the jumper in the location and set its color.
  d. the act method should be overriden.
  e. a jump method or canjump method should be added.
  f. try putting the jumper through all the specifications in part 1. 
  also try to put it through the basics with a flower and a rock in front of it.

  3. Code:
*/
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
/**
 * A <code>Jumper</code> is an actor that will jump over Rocks and Flowers
 * and turn.
 */
public class Jumper extends Actor
{
    public Jumper()
    {
	setColor(Color.GREEN);
    }
    /**
     * Constructs a Jumper of a given color.
     * @param JumperColor the color for this Jumper
     */
    public Jumper(Color JumperColor)
    {
	setColor(JumperColor);
    }
    public void act()
    {
	if (canJump())
	    jump();
	else
	    turn();
    }
    /**
     * Turns the Jumper 45 degrees to the right without changing its
     * location.
     */
    public void turn()
    {
	setDirection(getDirection() + Location.HALF_RIGHT);
    }
    /**
     * Moves the Jumper forward two locations.
     * The location two in front must be valid or the Jumper will remove
     * itself from the grid.
     */
    public void jump()
    {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (gr.isValid(twoAway))
	    moveTo(twoAway);
	else
	    removeSelfFromGrid();
    }
    /**
     * Tests whether this Jumper can move forward into a location two in
     * front that is empty or contains a flower.
     * The location one in front must be empty or contain a Rock or a
     * Flower.
     * @return true if this Jumper can move.
     */
    public boolean canJump()
    {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if (!gr.isValid(next))
	    return false;
	Actor neighbor = gr.get(next);
	if (!((neighbor == null) || (neighbor instanceof Flower)
	      || (neighbor instanceof Rock)))
	    return false;
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(twoAway))
	    return false;
	neighbor = gr.get(twoAway);
	return (neighbor == null) || (neighbor instanceof Flower);
    }
}
