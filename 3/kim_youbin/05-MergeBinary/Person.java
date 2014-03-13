public class Person implements Comparable<Person>{
    private String name;
    private int age;
    
   

    public Person(String s, int a){
	name = s;
	age = a;
    }

    public Integer getage(){
	return age;
    }
    
    public String getname(){
	return name;
    }

    public String toString(){
	String ans = "";
	ans += (name + ", " + age + ";");
	return ans;
    }


    public int compareTo(Person other){
	return name.compareToIgnoreCase(other.getname());
	
	//return getage().compareTo(other.getage());

    }
    
}