If the ArrayList is sorted, you are allowed to use a binary search to find the target.


Take the middle element of the ArrayList and compareTo(target).
if it returns 0, return the index
if it returns -1, recusively call the search method on the sub-ArrayList to the left or 		right of middle element. which ever has the higher-valued Strings. 
if it returns 1, do the same, but with the sub-Array with the lower-valued Strings.