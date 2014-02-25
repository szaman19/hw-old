import info.gridworld.actor.Bug;
public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    private int phase;
	public ZBug(int x){
		steps = 0;
		sideLength = x;
		phase = 0;
		turn();
		turn();
	}
    public void act(){
        if (steps < sideLength && canMove() && phase <= 2){
            move();
            steps++;
        }
        else{
        	if(phase == 0){
        		for(int x = 0;x < 3;x++){
        			turn();
        		}
        	}
        	else if(phase == 1){
        		for(int x = 0;x < 5;x++){
        			turn();
        		}
        	}
        	steps = 0;
        	phase++;
        }
    }
}