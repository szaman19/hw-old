public class myFind{

	// DA SLOWEST SEARCH IN DA WORLD. Iterates through array, if found, return index
	//desInt = Desired Interger
	//givenA = Given Array, which will be searched for desInt
	//gaInd = givenA index. Will count where program is in givenA for food.
	//currant = a tasty dried berry


	public int sSearch(int desInt, int[] givenA){ 
		int gaInd = 0;
		for (int currant : givenA) {
			if (currant == desInt){
				return currant;
			}
		}
		return -1;
	}

	/*Recursive Binary Search: Assuming list is sorted, will start at middle and
	  recursively cut array in half until length is 1 or you find the number.*/ 

	/*reArray = returnArray, the array that will be recursed and is filled 
	 dependant on whether L[L.length - 1/ 2] is greater than n or not. 
	 if > n, it'll contain the lowerbound and vice versa.
	 Note that L.length-1 in order to account for the array counting method*/

	 //LIndex = FOR LOOP COUNTER to create reArray
	 //cutIndex = Index of the greater half of the array. 

	 //MAJOR PROBLEM MAJOR PROBLEM
	 //THINK OF A WAY FOR THE INDEX OF THE CORRECT ANSWER STILL HOLDS EVEN AFTER 
	 //SPLITS
	 //IE FIND 5 [1,2,3,4,5] SPLIT UP AT END WILL BE [3.4.5] AND ANSWER WILL THEN BE 
	 //2 NOT 4 AHHHHHHHHHHHHHH

	public int rbsearch(int n,int[] L){
		if (L.length != 1){
			if (L[(L.length - 1) / 2 == n]){
				return L.length/2;
			}
			else{
				if (L[(L.length - 1)/ 2] > n){
					int[] reArray = new int[(L.length - 1) / 2];
					for (int LIndex = 0; LIndex < (L.length - 1) / 2;  LIndex++;){
						reArray[LIndex] = L[LIndex];
					}
					rbsearch(n,reArray);
				}
				else{
					int[] reArray = new int[(L.length - 1) - ((L.length-1)/2)];
					int cutIndex = (L.length - 1) / 2;
					for (int LIndex = 0; cutIndex <= L.length - 1; cutIndex++){
						reArray[LIndex] = L[cutIndex];
						LIndex++;
					}
					rbsearch(n,reArray);
				}
			}
		}
		else{
			if (L[0] == n){
				return 
			}
		}
	}