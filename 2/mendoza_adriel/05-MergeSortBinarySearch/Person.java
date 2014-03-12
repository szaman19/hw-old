public class Person implements Comparable{
    
    private int age;
    private String name;

    public Person(){
	age = 21;
	name = "John Doe";
    }

    public Person(int i, String s){
	age = i;
	name = s;
    }

    public int getAge(){
	return age;
    }

    public String getName(){
	return name;
    }

    //based on age
    public int compareTo(Object o){
	if(o == null){
	    throw(new NullPointerException("\nNull"));
	}else if(!(o instanceof Person)){
	    throw(new ClassCastException("\nDoes not exist."));
	}else if(age > ((Person)o).getAge()){
	    return 1;
	}else if(age == ((Person)o).getAge()){
	    return 0;
	}else{
	    return -1;
	}
    }

    //based on name
    /*
    public int compareTo(Object o){
	if(o == null){
	    throw(new NullPointerException("\nNull"));
	}else if(!(o instanceof Person)){
	    throw(new ClassCastException("\nDoes not exist."));
	}
	return name.compareTo(((Person)o).getName());
    }
    */

    public String toString(){
	return name + "-" + age;
    } 
}
	
