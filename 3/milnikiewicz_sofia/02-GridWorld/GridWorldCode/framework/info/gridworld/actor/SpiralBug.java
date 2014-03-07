import info.gridworld.actor.Bug;
/**
 * A BoxBug traces out a square “box” of a given size.
 * The implementation of this class is testable on the AP CS A and AB Exams. */
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;
    /**
     * Constructs a box bug that traces a square of a given side length * @param length the side length
     */
    public SpiralBug(int length)
    {
	steps = 0;
	sideLength = length;
    }
    public void act()
    {
	if (steps < sideLength && canMove())
	    {
		move();
		steps++; }
	else {
	    turn();
	    sideLenth--;
	    turn();
	    steps = 0;
	} }
}
