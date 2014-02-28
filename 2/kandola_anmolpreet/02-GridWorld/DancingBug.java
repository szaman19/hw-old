import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] numturns;
    private int step;

    public DancingBug (int[] turns) {
	numturns = turns;
	step = 0;
    }
    
    public void turn(int nums) {
	for (int i = 1; i <= nums; i++) {
	    turn();
	}
    }
    
    public void act() {
	if (step == numturns.length) {
	    step = 0;
	    turn(numturns[step]);
	    step += 1;
	    super.act();
	}
    }


