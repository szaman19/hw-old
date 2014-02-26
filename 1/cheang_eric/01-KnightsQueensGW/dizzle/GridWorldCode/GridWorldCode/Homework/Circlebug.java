public class Circlebug extends Bug{
    public void act(){
	if (super.canMove()){
	    super.move();
	}
	else{
	    super.turn();
	    super.turn();
	}
    }
}

//This will