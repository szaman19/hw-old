public class split{
    int[] splitArray1;
    int[] splitArray2;


    private void  splitArray(int[] givenArray){

	int givenArrayLength = givenArray.length;
	splitArray1 = new int[givenArrayLength/2];
	splitArray2 = new int[givenArrayLength - splitArray1.length];


	int arrayEntityCounter = 0;
	int splitArray1IndexCounter = 0;
	int splitArray2IndexCounter = 0;


	for (int arrayEntity : givenArray){
	    
	    if (arrayEntityCounter < splitArray1.length){
		splitArray1[splitArray1IndexCounter] = arrayEntity;
		splitArray1IndexCounter++;
	    }
	    else{
		splitArray2[splitArray2IndexCounter] = arrayEntity;
		splitArray2IndexCounter++;
	    }
	    arrayEntityCounter++;
	}
    }

    public void printArray(int[] printMe){
	for (int printEntity : printMe){
	    System.out.println(printEntity);
	}
    }

    public void printArray1(){
	printArray(splitArray1);
	System.out.println("IOUBNEIOUQWBIOFNEA");
	printArray(splitArray2);
    }

    public static void main(String[] args){
	int[] testArray = new int[9];
	testArray[0] = 5;
	testArray[8] = 5;
	split splitClass = new split();
	splitClass.splitArray(testArray);
	splitClass.printArray1();

    }
}
	

