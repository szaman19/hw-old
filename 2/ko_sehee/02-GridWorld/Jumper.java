public class Jumper extends Actor{
    boolean pos = false;
    public Jumper(){
	setColor(Color.YELLOW);
    }
    public Jumper(Color x){
	setColor(x);
    }
    public boolean canJump{
	//I don't know how to do this part so i took from the solutions manual
	Grid<Actor> gr = getGrid(); 
	if (gr == null) 
	    return false; 
	Location loc = getLocation(); 
	Location next = loc.getAdjacentLocation(getDirection()); 
	if (!gr.isValid(next)) 
	    return false; 
	Actor neighbor = gr.get(next); 
	if (!((neighbor == null) || (neighbor instanceof Flower) 
	      || (neighbor instanceof Rock))) 
	    return false; 
 
	Location twoAway = next.getAdjacentLocation(getDirection()); 
	if (!gr.isValid(twoAway)) 
	    return false; 
 
	neighbor = gr.get(twoAway); 
	return (neighbor == null) || (neighbor instanceof Flower); 

    }
    public void jump(){
	Grid<Actor> gr = getGrid(); 
	if (gr == null) 
	    return; 
	Location loc = getLocation(); 
	Location next = loc.getAdjacentLocation(getDirection()); 
	Location twoAway = next.getAdjacentLocation(getDirection()); 
	if (gr.isValid(twoAway)) 
	    moveTo(twoAway); 
	else 
	    removeSelfFromGrid();
    }
    public void turn(){
	setDirection(getDirection() + 45); 
    }
    public void act(){
	if(canJump()){
	    jump();
	}
	else{
	    turn();
	}
    }
}