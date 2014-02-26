import info.gridworld.actor.Bug;
public class DancingBug extends Bug{
	int[] pattern;
	int phase;
	public DancingBug(int[] x){
		pattern = x;
		phase = 0;
	}
	public void act(){
		for(int x = 0;x < pattern[phase];x++){
			turn();
		}
		if(canMove()){
			move();
		}
		else{
			turn();
		}
		phase++;
		if(phase >= pattern.length){
			phase = 0;
		}
	}
}