import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
    // Instance Variables
    private int _steps;
    private int _length;
    
    // Constructor
    public SpiralBug(int length)
    {
        _steps = 0;
        _length = length;
    }
    
    // Accessor Methods
    public int getSteps() {return _steps;}
    public int getLength() {return _length;}
    
    // Methods
    public void act()
    {
        if ( (_steps < _length) && canMove() )
        {
            move();
            _steps++;
        }
        else
        {
            turn();
            turn();
            _length += 1;
            _steps = 0;
        }
    }
}