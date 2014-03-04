import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int length;
    private int moved;
    private int counter;

    public ZBug(int x){
	length = x;
	moved = 0;
	counter = 0;
	setDirection(90);
    }

    public void act(){
	
	if (moved < length && canMove() && counter < 3){
	    move();
	    moved++;
	}else{
	    if (counter = 0){
		turn();
		turn();
		turn();
	    }else if(counter = 1){
		turn();
		turn();
		turn();
		turn();
		turn();
	    }
	    moved = 0;
	    counter++;
	}
    }
}