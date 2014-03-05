If the array is sorted, you can use divide and conquer to easily find the index of what you want.

1. Split the array in half
2. Check the first and last object in the array
3. If either one of the two is what you want, return that index
4. Else, if what you want is between them split that half and keep doing it until it ends up as the first or last object