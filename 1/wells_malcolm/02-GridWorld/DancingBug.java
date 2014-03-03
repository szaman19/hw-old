import info.gridworld.actor.Bug;

/**                                                                                      
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />               
 * The implementation of this class is testable on the AP CS A and AB exams.             
 */
public class DancingBug extends Bug
{
    private int step;
    private int[] turns;

    /**                                                                                  
     * Constructs a box bug that traces a square of a given side length                  
     * @param length the side length                                                     
     */
    public DancingBug(int[] turns)
    {
        step = 0;
	this.turns = turns;
    }

    /**                                                                                  
     * Moves to the next location of the square.                                         
     */
    public void act()
    {
	for(int x = 0;x<turns[step];x++){
	    turn();
	}
	if(canMove()){
                move();
		step = (step+1)%turns.length;
            }
        else
            {
                turn();
                steps = 0;
            }
    }
}
