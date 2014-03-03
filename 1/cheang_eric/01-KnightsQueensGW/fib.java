public class fib{
    
    int prevFIB = 0;
    
    public int fib(int givenNumber){
	if (givenNumber < 2){
	    return 1;  
// if givenNumber is less than two it turns into 1, the abse case
	}
	else{
	    return fib(givenNumber-1) + fib(givenNumber - 2);
	}

    }

    public int fibLoop(int placeNumber){
	    int firstInt = 1;
	    int secondInt = 1;
	    placeNumber--;
	while (placeNumber >= 0){
	    if (firstInt <= secondInt){
		firstInt = firstInt + secondInt;
	    }
	    else{
		secondInt = firstInt + secondInt;
	    }
	    placeNumber--;
	}
	if (firstInt < secondInt){
	    return firstInt;
	}
	return secondInt;
    }
	

	    
	    
	    
    public static void main(String[] args){
	fib fibo = new fib();
	int comparitor = 45;
	System.out.println(fibo.fibLoop(comparitor));
	System.out.println(fibo.fib(comparitor));
    }
}
