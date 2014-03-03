import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    // Instance Variables
    private int[] _twirls; 
    
    // Constructor
    public DancingBug()
    {
        _twirls = new int[] {45, 225, 135};
    }
    
    public DancingBug(int[] twirls)
    {
        _twirls = twirls;
    }
    
    // Accessor Methods
    public int[] getTwirls() {return _twirls;}
    
    // Methods
    public void act()
    {
        for (int i : _twirls)
        {
            for (int j = 0; j < (i / 45); j++)
                turn();
            
            super.act();
        }
    }
}