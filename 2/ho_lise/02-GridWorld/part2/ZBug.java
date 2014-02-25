import info.gridworld.actor.Bug;
public class ZBug extends Bug{
    private int len;
    private int steps;
    private int turns;
    

    public ZBug(int length){
	super();
	len = length;
	steps = -1;
	turns =0;
    }

    public void act(){
	if (steps == -1){
	    turn();
	    turn();
	    steps = 0;
	}	
	if (!(canMove()) || (turns == 2 && steps == len)){
	    len = 0;
	    steps = 0;
	}
	else if (canMove() && steps<len){
	    move();
	    steps++;
	} 
	else{
	    turn();
	    turn();
	    turn();
	    if (turns==1){
		turn();
		turn();
	    }
	    steps = 0;
	    turns++;
	}
    }

}