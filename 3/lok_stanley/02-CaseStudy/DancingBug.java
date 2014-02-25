import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
    private int[] instructions;

    public DancingBug(int[] ins){
	instructions = ins;
    }

    public void act(){
	for(int i = 0; i < instructions.length; i++){
	    for(int j = 0; j < i; j++){
		turn();
	    }
	    if(canMove()){
		move();
	    }
	}
    }
}

