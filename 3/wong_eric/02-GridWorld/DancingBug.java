import info.gridworld.actor.Bug;

public class DancingBug extends Bug {

    private int[] turns;
    private int times = 0;

    public DancingBug(int[] bams) {
	turns = bams;
    }

    public void act() {
 
	if (canMove()) {
	    super.act();
	}
	else {
	    int place = times % turns.length;
	    setDirection(turns[place] * 45);
	    times++;
	}
    }
}
