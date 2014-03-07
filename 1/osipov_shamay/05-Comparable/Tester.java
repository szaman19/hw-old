import java.util.*;
import java.io.*;

public class Tester{

    public static void main(String[]args){
	Random rand = new Random();	
	ArrayList<Person> abc = new ArrayList<Person>();
	for(int x = 0; x < 10; x++){
		abc.get(x) = new Person("lala", rand.nextInt(100));
	}
	MergeSortUniversal sorter = new MergeSortUniversal();
	abc = sorter.split(abc);
	System.out.print(abc);	
    }

}
