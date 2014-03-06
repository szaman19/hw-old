import java.util.*;
public class ComparableSort{
    
    public static ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b){
		ArrayList<Comparable> butt = new ArrayList<Comparable>();
		int Acount = 0;
		int Bcount = 0;
		System.out.println(b.size());
		System.out.println(a.size());
		System.out.println(butt.size());
		for(int i = 0; /*i< butt.size()*/ i < a.size() + b.size(); i++){
	    
	    
	    
			if(a.get(Acount).compareTo( b.get(Bcount)) < 0){
				//butt.set(i, a.get(Acount));
				System.out.println("Added a");
				butt.add(a.get(Acount));
				
				Acount++;
				if(Acount >= a.size()){
					for(int j = Bcount; j < b.size(); j++){
						i++;
						//butt.set(i, b.get(j));
						butt.add(b.get(j));
					}
				break;
				}	
			}
	    
			else{
				//butt.set(i,b.get(Bcount));
				System.out.println("Added a");
				butt.add(b.get(Bcount));
				Bcount++;
					if(Bcount>= b.size()){
						for(int k = Acount; k < a.size(); k++){
						i++;
						//butt.set(i,a.get(k));
						butt.add(a.get(k));
					}
				break;
				}
			}
		}
		
		System.out.println("We are merging: ");
	
		for(int i=0; i< a.size(); i++){
			System.out.print(a.get(i) + " - ");
		}

		System.out.println();
		for(int i=0; i< b.size(); i++){
			System.out.print(b.get(i) + " - ");
		}
		System.out.println();

		for(int i=0; i< butt.size(); i++){
			System.out.print(butt.get(i) + " - ");
		}
		System.out.println();


		return butt;
    }

		
 
    public static ArrayList<Comparable> msort(ArrayList<Comparable> L){
	if(L.size() <= 1 ){
	    return L;
	}
	else{
	    ArrayList<Comparable> a = new ArrayList<Comparable>();
	    ArrayList<Comparable> b = new ArrayList<Comparable>();

	    int i;
		
	    for(i = 0; i<L.size()/2; i++){
			//a.set(i,L.get(i));
			a.add(L.get(i));
			
	    }

	    for(i = i; i<L.size(); i++){
			//b.set(L.size() -i -1 ,   L.get(i));
			b.add(L.get(i));
			}
			
	    a = msort(a);
	    b = msort(b);

		ArrayList<Comparable> result = merge(a, b);
	    
	    System.out.print("The result for this branch is: " );

	    for(i = 0; i< result.size(); i++){
	   
			System.out.print(result.get(i) + " - ");
	    }
	    return result;
		}
    }


    public static void main(String[] args){

		
		ArrayList<Comparable> c = new ArrayList<Comparable>(10);
		c.add("butt");
		
		c.add("poop");
		
		c.add("pee");
		
		c.add("zebra");
		
		c.add("kitten");
		for(int i = 0; i< c.size(); i++){
		
			System.out.print(c.get(i) + " ");
			
			
		}
		System.out.print("\n");
		msort(c);
	
		
	}
}	
