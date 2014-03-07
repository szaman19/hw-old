public class person implements Comparable<person>{
    private int age;
    private String name;
    public person (String d,int z){
	name = d;
	age = z;
    }
    public int getAge(){
	return age;
    }
    public String toString(){
        return name;
    }
    public String getName(){
	return name;}
    public int compareTo(person p){
	
	return ((age - p.getAge()) + name.compareTo(p.getName()));
	
    }
}
   	