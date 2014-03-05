import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumpter extends Actor{
  public Jumper(){
    setColor(Color.BLUE);
  }
  
  public Jumper(Color c){
    setColor(c);
  }
  
  public void act(){
    if (canJump()){
      jump();
    }
    else{
      turn();
    }
  }
  
  public void turn(){
    setDirection(getDirection() + Location.HALF_RIGHT);
  }
  
  public boolean canJump(){
    Grid<Actor> g = getGrid();
    if (g == null){
      return false;
    }
    Location L = getLocation();
    Location n = loc.getAdjacentLocation(getDirection());
    if (!g.isValid(n)){
      return false;
    }
    Actor neighbor = g.get(n);
    if (!((neighbor == null)) || (neighbor instanceof Flower) || (neighbor instanceof Rock))){
      return false;
    }
    Location y = n.getAdjacentLocation(getDirection());
    if (!g.isValid(y)){
      return false;
    }
    neighbor = g.get(y);
    return (neighbor == null) || (neighbor instanceof Flower);
  }
  
  public void jump(){
    Grid<Actor> g = getGrid();
    if (g == null){
      return;
    }
    Location L = getLocation();
    Location x = loc.getAdjacentLocation(getDirection());
    Location y = next.getAdjacentLocation(getDirection());
    if (g.isValid(y)){
      moveTo(y);
    }
    else{
      removeSelfFromGrid();
    }
  }
}
    
