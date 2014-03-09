public class Person implements Comparable{
    private int age;
    private String name;
    
    public Person(int a, String S){
	age=a;
	name=S;
    }
    
    public int getAge(){return age;}
    public String getName(){return name;}

    public int compareTo(Object a){
	return (name.compareTo(((Person)a).getName()));

    }

    public String toString(){
	return "Name: "+name+" Age: "+age;
    }
}