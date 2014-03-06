One alogrithm to more effectively search for an item in a sorted list is to use math: 
	-take your search item (s), the first item in the list (f), and the last item in the list (l)
	-quantify these items mathematically, according to how the list is sorted, then begin your search at the (s - f)*(length)/(l-f) index, rounding to the nearest whole number
	-if the item at that index is greater than s, search down, otherwise search up
