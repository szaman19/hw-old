public class Person implements Comparable
{
    // Instance Variables
    private String _name;
    private int _age;
    
    // Constructors
    public Person()
    {
        _name = new String("John Doe");
        _age = 20;
    }
    
    public Person(String name, int age)
    {
        _name = name;
        _age = age;
    }
    
    // Accessor Methods
    public String getName() { return _name; }
    public int getAge() { return _age; }
    
    // CompareTo Method
    public int compareTo(Object input)
    {
        if (input == null)
            throw( new NullPointerException("\nParameter is null. Please rectify") );
        else if (! (input instanceof Person) )
            throw( new ClassCastException("\nParameter must be of class Person.") );
        
        return ( ( this.getName().compareTo( ((Person) input).getName()) ) +
                 ( this.getAge() - ((Person) input).getAge())
                );
    }
    
    // Equals Method
    @Override
    public boolean equals(Object input)
    {
        if (input == null)
            throw( new NullPointerException("\nParameter is null. Please rectify") );
        
        return ( (input instanceof Person) ||
                 (
                    ( this.getName().compareTo( ((Person) input).getName() ) == 0 ) &&
                    ( this.getAge() == ((Person) input).getAge() )
                  )
                );
    }
}