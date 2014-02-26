import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
public class Jumper extends Bug{
    public void act(){
        if (canMove()){
            move();
            if (canMove()){
                move();
            }
        }else if (getDirection()==WEST){
            if (getCol()>=2){
                moveTo(new Location (getRow(),getCol()-2));
            }
        }else if (getDirectio()==NORTHEAST){
            if (getCol()>=2&&getRow()<=getNumRowss()-2){
                moveTo(new Location (getRow()-2,getCol()+2));
            }
        }else if (getDirection()==SOUTH){
            if (getRow()<=getNumRows()-2){
                moveTo(new Location (getRow()+2,getCol()));
            }
        }else if (getDirection()==SOUTHEAST){
            if (getRow()<=getNumRows()-2&&getCol()<=getNumCols()-2){
                moveTo(new Location (getRow()+2,getCol()+2));
            }
        }else if (getDirection()==EAST){
            if (getCol()<=getNumCols()-2){
                moveTo(new Location (getRow(),getCol()+2));
            }
        }else if (getDirection()==NORTH){
            if (getRow()>=2){
                moveTo(new Location (getRow()-2,getCol()));
            }
        }else if (getDirection()==NORTHWEST){
            if (getRow()>=2&&getCol()>=2){
                moveTo(new Location (getRow()-2,getCol()-2));
            }
        }else if (getDirection()==SOUTHWEST){
            if (getRow()<=getNumRows()-2&&getCol()>=2){
                moveTo(new Location (getRow()+2,getCol()-2));
            }
        }else{
            move();
        }
    }
}
                   
                   
