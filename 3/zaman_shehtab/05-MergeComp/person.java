import java.util.*;

public class person implements Comparable<person>{
	int age;
	String name;
	public person (String x , int y ){
		name = x; 
		age = y; 
	}

	public int getAge(){
		return age;
	}
	public String getName(){
		return name;  
	}

	public int compareTo(person x){
		//add class cast exception 
		//add null pointer exception 
		if (x.getAge() > age) {
			return -1;
		}
		else if(x.getAge() == age){
			return 0;
		}
		else{
			return 1;
		}
	}

}