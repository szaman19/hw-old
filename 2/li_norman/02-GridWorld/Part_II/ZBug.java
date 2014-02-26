import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    // Instance Variables
    private int _steps;
    private int _length;
    private int _side;
    
    // Constructor
    public ZBug(int length)
    {
        _steps = 0;
        _length = length;
        _side = 1;
        setDirection(90);
    }
    
    // Accessor Methods
    public int getSteps() {return _steps;}
    public int getLength() {return _length;}
    
    // Methods
    public void act()
    {
        if ( canMove() && (_side != 4) && (_steps < _length) )
        {
            move();
            _steps++;
        }
        else if ( _side == 1 )
        {
            setDirection(225);
            _steps = 0;
            _side = 2;
        }
        else if ( _side == 2 )
        {
            setDirection(90);
            _steps = 0;
            _side = 3;
        }
        else
            return;
    }
}