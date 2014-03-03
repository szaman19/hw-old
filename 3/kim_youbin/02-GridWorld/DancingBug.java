import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
    private int[] limit ;
    private int turned;
    private int counter;

    public DancingBug(int[] x){
	limit = x;
	turned = 0;
	counter = 0;
    }

    public void act(){
	int turns = limit[counter];
	while (turned < turns){
	    turn();
	}
	turned = 0;
	counter++;
	if (counter = limit.length){
	    counter = 0;
	}
	if (canMove()){
	    move();
	}
    }
}