import java.util.ArrayList;

public class Person implements Comparable {
    private String name;
    private int age;

    public Person(int d, String k) {
	age = d;
	name = k;
    }

    public String getname() {
	return name;
    }
    public int getage() {
	return age;
    }

    public String toString() {
	return name + " " + age;
    }

    public static String print(ArrayList<Comparable> x) {
	String ans = "";
	for (Comparable y:x) {
	    ans += y + ", ";
	}
	ans = ans.substring(0, ans.length()-2);
	return ans;
    }

    // I couldn't make it work without implementing the toString and print functions below from Chris. My compareTo changes and mergesort all works. It kept returning Person@485e2... <- (basically person followed by various characters. I tried to implement a for loop to print the array, but it still didn't work.

    //   public int compareTo(Object x) {
    //	return (age - ((Person)x).age);
    // }
    //this function overrides compareTo and compares ages of People (Objects of the Person class)
    public int compareTo(Object x) {
	return (name.compareTo(((Person)x).name));
    }




 public static ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList <Comparable> b) {
	
        ArrayList<Comparable> ans = new ArrayList<Comparable>();
	
	while ((a.size() > 0) && (b.size() > 0)) {
	    if ((a.get(0).compareTo(b.get(0))) <= 0) {
		    ans.add(a.get(0));
		    a.remove(0);
		}
		else {
		    ans.add(b.get(0));
		    b.remove(0);
		}
	}
        
        while (a.size() > 0) {
	    ans.add(a.get(0));
	    a.remove(0);
	}
        while (b.size() > 0) {
	    ans.add( b.get(0));
	    b.remove(0);
	}
        
        return ans;
	
    }
    
    public static ArrayList<Comparable> sort(ArrayList<Comparable> x) {
	if (x.size() > 1) {
	    ArrayList<Comparable> y = new ArrayList<Comparable>();
	    ArrayList<Comparable> z = new ArrayList<Comparable>();
	    int divide = x.size()/2;
	    for (int i = 0; i < divide; i++) {
                y.add(x.get(i));
	    }
            for (int j = divide; j < x.size(); j++) {
                z.add(x.get(j));
	    }
            y = sort(y);
            z = sort(z);
            x = merge(y,z); //now that lists are in half, merge them (accounting for values and putting them in order).
            
            return x;
        }
        else
            return x;
    }

    public static void main(String[]args) {
	ArrayList<Comparable> people = new ArrayList<Comparable>();
	    Person a = new Person(24, "Kik");
	    Person b = new Person(43, "Ade");
	    Person c = new Person(12,"Canes");
	    people.add(a);
	    people.add(b);
	    people.add(c);
	    //  sort(people);
	    // for (int i = 0; i < people.size(); i++) {
	    //	System.out.print(people.get(i) + ", "); 
	    // }
	    // This is how I tried to print before. It didn't work.
	    System.out.println("Original List: " + print(people));
	    System.out.println("Sorted: " + print(sort(people)));
		
	    
    }
}
