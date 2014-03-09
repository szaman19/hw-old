public class BinarySort{
    public static int rbsearch(int n, int[] L){
	int place = L.length/2;
	int CButt = L[place];
	boolean found = false;
	int foundP = -1;
	
	// if(!found){
	    
		if(CButt == n){
			System.out.println("if this shows we win");	  
			
			System.out.println(n);
			
			found = true;
			
			return place;
		}

		else if(L.length <= 1){
			System.out.println("We are returning -1");
			return -1;
		}
		
		else if(CButt > n){
			int[] poopoo = new int[place];
			
			for(int i = 0; i< place; i++){
				poopoo[i] = L[i];
			}
			
			for(int i = 0; i< poopoo.length; i++){
				System.out.print(poopoo[i] + " , ");
			}
			
			System.out.println("if this shows we are seaching to the left");
		
			System.out.println(foundP);

			if(rbsearch(n, poopoo) == -1){
				return -1;
			}
			
			foundP = rbsearch(n, poopoo);
	 
		}

		else if( CButt < n){
			int[] peepee = new int[L.length - place];
			
			for(int i = place; i< L.length; i++){
				peepee[i - place] = L[i];
			}
			
			for(int i = 0; i< peepee.length; i++){
				System.out.print(peepee[i] + " , ");
			}
			
			System.out.println("if this shows we are searching to the right");
			
			System.out.println(foundP);
			
			if(rbsearch(n, peepee) == -1){
				return -1;
			}
			
			foundP = place + rbsearch(n,peepee);
		
			
		}			
	
		
		
		System.out.println("if this shows i dunno something should have shown before it " );
      	
		
	
		return foundP;
	}
	/*
	else(
	     return place;
	     }
    */
	
	
	public static int forbsearch(int n, int[] L){
	
		int start = 0;
		int end = L.length;
		int placeNow = (start + end)/2;
		boolean found = false;
		
		while(!found && (end - start) > 1){
			if(L[placeNow] == n){
				found = true;
				
				}
			else if(L[placeNow] > n){
				start = start;
				end = placeNow;
				//System.out.println(end - start);
				placeNow = (start + end)/2;
				
				if(placeNow == 1){
					placeNow = 0;
				}
			
			}
			else {
				start = placeNow;
				end = end;
				//System.out.println(end - start);
				placeNow = (start + end)/2;
				}
		}
		
		if(!found){
			placeNow = -1;
			}
		
		
		return placeNow;
		
		}
		
		
	
	

    public static void main(String[] args){
	
	int[] butt = {1 ,3, 4, 5, 6, 7, 8, 9, 13, 24, 45, 46 ,48, 51, 54 ,67};

	System.out.println(forbsearch(51123, butt) + "\n"); 
    System.out.println(forbsearch(1, butt)+ "\n");
	System.out.println(forbsearch(67, butt)+ "\n");
	System.out.println(forbsearch(6, butt)+ "\n");
	System.out.println(forbsearch(48, butt)+ "\n");
	System.out.println(forbsearch(49, butt)+ "\n");
	
	System.out.println(rbsearch(51123, butt) + "\n"); 
    System.out.println(rbsearch(1, butt)+ "\n");
	System.out.println(rbsearch(67, butt)+ "\n");
	System.out.println(rbsearch(6, butt)+ "\n");
	System.out.println(rbsearch(48, butt)+ "\n");
	System.out.println(rbsearch(49, butt)+ "\n");
	}
}