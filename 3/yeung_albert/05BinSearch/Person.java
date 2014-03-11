public class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(String name, int age){
	this.age=age;
	this.name=name;
    }

    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
    
    public int compareTo(Person a){	
	if (age!=a.getAge()){
	    return age - a.getAge();
	}else{
	    return name.compareTo(a.getName());
	}
    }

    public static void main(String[]args){
	Person a = new Person("Bob",10);
	Person b = new Person("Bob",20);
	Person c = new Person("Rob",10);
	System.out.println(a.compareTo(b));
	System.out.println(a.compareTo(c));
	System.out.println(b.compareTo(c));
    }

}