import info.gridworld.actor.Bug;

public class CircleBug extends Bug{
    private int length;
    private int moved;

    public CircleBug(int x){
	length = x;
	moved = 0;
    }

    public void act(){
	if (moved < length && canMove()){
	    move();
	    moved++;
	}else{
	    turn();
	    moved = 0;
	}
    }

}