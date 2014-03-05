Anmolpreet Kandola
APCS Period 2
HW 04 - Mergesort2: ArrayLists

If you simple sort the arraylist, you then have a set of values which you can compare to the
value of the item you are trying to locate. Where x is the value of your item, if (x > middle value of
arraylist) or if (x < middle value of arraylist) can be used to determine the half of the arraylist in
which the item may potentially. Then simply loop through to see if it is there, or if it is not:
for (int i = starting value (may vary depending on the half of the arraylist you are in; i < value;i++){
	//compare values
	// if (equal), return arraylistname.get(i);
}