public class PersonName implements Comparable<PersonName>{

    private String name;
    private int age;
    private final String letters = "abcdefghijklmnopqrstuvwxyz";

    public PersonName(){
	name = "";
	for (int i = 0; i < 4; i++){
	    int rand = (int)(Math.random() * 26);
	    name += letters.substring(rand,rand+1);
	}
	age = (int)((Math.random() * 32) + 18);
    }

    public String toString(){
	String out = "";
	out += name;
	out += ": ";
	out += age;
	return out;
    }

    public int getAge(){
	return age;
    }
    
    public String getName(){
	return name;
    }

    // public int compareTo( PersonName b ){
    //     return this.getAge() - b.getAge();
    // }

    public int compareTo( PersonName b ){
        return this.getName().compareTo(b.getName());
    }

}
