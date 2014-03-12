import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class Jumper extends Actor
{   
    // Instance Variables
    private Location _firstStep;            // First Potential Step
    private Location _secondStep;           // Second Potential Step
    
    // Constructor
    public Jumper()
    {
        this.setDirection(0);
    }
    
    // Accessor Methods
    /*
    public Color getColor()
    public int getDirection()
    public Grid<Actor> getGrid()
    public Location getLocation()
    */
    public Location getFirstStep()  { return _firstStep; }
    public Location getSecondStep() { return _secondStep; }
    
    // Inherited Methods
    /*
    public void putSelfInGrid(Grid<Actor> gr, Location loc)
    public void removeSelfFromGrid()
    public void moveTo(Location loc)
    public void setColor(Color newColor)
    public void setDirection(int newDirection)
    public void act()
    */
    
    // Act Method (Override)
    public void act()
    {
        // Sets Location for First/Second Step in Move
        _firstStep = this.getLocation().getAdjacentLocation( this.getDirection() );
        _secondStep = _firstStep.getAdjacentLocation( this.getDirection() );
        
        if ( 
               ( this.getGrid().isValid( _secondStep ) )                &&          // If Second Step is on Grid
               (
                 ( this.getGrid().get( _firstStep ) == null )           ||          // If First Step is Null, a Rock, or a Flower.
                 ( this.getGrid().get( _firstStep ) instanceof Rock )   ||
                 ( this.getGrid().get( _firstStep ) instanceof Flower )
               )                                                        &&
               ( this.getGrid().get( _secondStep ) == null )                        // If Second Step is Null
            )
            this.moveTo( _secondStep );
        else
            this.setDirection( this.getDirection() + 45 );                          // C
    }
}