import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] turnList;
    private int steps;

    public DancingBug(int[] turns){
	turnList = turns;
	steps = 0;
    }

    public void turn(int n){
	for (int i = 0;i<n;i++){
	    turn();
	}
    }

    public void act(){
	if (steps == turnList.length){
	    steps = 0;
	}
	turn(turnList[steps]);
	steps++;
	super.act();
    }
}
