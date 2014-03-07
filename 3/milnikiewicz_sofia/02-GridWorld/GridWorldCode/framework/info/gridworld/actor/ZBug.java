//idk
import info.gridworld.actor.Bug;
/**
* A BoxBug traces out a square “box” of a given size.
* The implementation of this class is testable on the AP CS A and AB Exams. */
public class ZBug extends Bug
{
/**
* Constructs a box bug that traces a square of a given side length * @param length the side length
*/
  public ZBug(int length)
  {
    steps = 0;
}
    public void act()
    {
	if (steps < sideLength && canMove())
	    {
		move();
		steps++; }
	else {
	    turn();
	    turn();
	    steps = 0;
	} }
}
