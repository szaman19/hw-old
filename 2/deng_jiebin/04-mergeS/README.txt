If the array is already sorted, then it can be searched in a way similar to the merge sort.
The array can be split in the middle. If the middle value is the same as the search value,
then you are done. Otherwise, recursively call the method with either the values on the left
or the right of the middle value, depending on if the middle value was greater than or less
than the search value.
