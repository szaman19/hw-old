import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    //Instance Variables
    private int _steps;
    private int _radius;
    
    // Constructor
    public CircleBug(int radius)
    {
        _steps = 0;
        _radius = radius;
    }
    
    // Accessor Methods
    public int getSteps() {return _steps;}
    public int getRadius() {return _radius;}
    
    // Methods
    public void act()
    {
        if ( (_steps < _radius) && canMove() )
        {
            move();
            _steps++;
        }
        else
        {
            turn();
            _steps = 0;
        }
    }
}