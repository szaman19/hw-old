import java.util.ArrayList;

public class Person implements Comparable<Person>{
    private int age;
    private String name;
    
    public Person(){
	age = 0;
	name = "Asd";
    }

    public Person(int a, String s){
	age = a;
	name =s;
    }
    
    public int compareTo(Person p){
	return age-p.age;
    }
    
    public String toString(){
	return age + "";
    }

    public static void main(String[] args){
	ArrayList<Comparable> list = new ArrayList<Comparable>();
	list.add(new Person(10, "Adam"));
	list.add(new Person(12, "Adam"));
	list.add(new Person(14, "Adam"));
	list.add(new Person(1, "Adam"));
	list.add(new Person(0, "Adam"));
	list.add(new Person(-2, "Adam"));
	list.add(new Person(4, "Adam"));
	list.add(new Person(4, "Adam"));
	list.add(new Person(78, "Adam"));
	list.add(new Person(100, "Adam"));
	list.add(new Person(90, "Adam"));
	list.add(new Person(23, "Adam"));
	list.add(new Person(55, "Adam"));
	
	System.out.println(MergeSortC.msort(list));
	
    }
}