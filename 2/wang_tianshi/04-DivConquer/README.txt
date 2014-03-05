ALGORITHM FOR FASTER SEARCH:

Binary Search

List is already sorted, so it can be split into half.
Check "endpoints" to see if value is between them -> if so, cut off other half and repeat
--> if not, cut off current half and repeat with other half.

Base case: value == GraduallySplitArrayList.get(0)
