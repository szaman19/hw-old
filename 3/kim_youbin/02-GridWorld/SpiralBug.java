import info.gridworld.actor.Bug;

public class SpiralBug extends Bug{
    private int length;
    private int moved;

    public SpiralBug(int x){
	length = x;
	moved = 0;
    }

    public void act(){
	if (moved < length && canMove()){
	    move();
	    moved++;
	}else{
	    turn();
	    turn();
	    moved = 0;
	    length--;
	}
    }

}