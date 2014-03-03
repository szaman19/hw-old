import info.gridworld.actor.Bug;

public class DancingBug extends Bug {

    private int currentTurn;
    private int expectedTurn;
    private int n =0;
    
    public DancingBug(array turns) {
	currentTurn = 0;
	expectedTurn = turns[n];
    }
    
    if (n < turns.length - 1) {
	public void act() {
	    if  (currentTurn < expectedTurn && canMove()) {
		turn();
		currentTurn ++;
	    }
	    else {
		move();
		currentTurn = 0;
		expectedTurn = turns[n+1];
	    }
	}
    }
}
