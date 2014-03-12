/*
Group Activity
1.
 a. If the location two cells in front contains a rock, the jumper will turn but if it contains a flower, the jumper will move onto the flower.
 b. If the Jumper reaches the edge of the bounded grid, it will make a turn.
 c. The Jumper would turn 40 degrees twice to avoid the edge.
 d. Since the object is not a flower, the Jumper will turn.
 e. The other Jumper is in the path so the first Jumper would turn.
 f. Can the Jumper move if there is a rock right in front of it?
2.
 a. Jumper extends Actor.
 b. Jumper should be based on Bug.
 c. No constructor is needed.
 d. The act() method needs overriding.
 e. We need to add methods for jumping and for turning.
 f. The Jumper should be placed both on the edge, facing the edge, away from edge, as well as in the center of the grid. Then other actors like flowers and rocks can be arranged around the Jumper.
*/

public class Jumper extends Bug {

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (canMove())
	    {
		move();
	    }
        else
	    {
		turn();
	    }
    }
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
	Location final = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(final))
            return false;
        Actor neighbor = gr.get(final);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
}
