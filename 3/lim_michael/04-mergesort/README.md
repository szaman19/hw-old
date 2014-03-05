How to search an already sorted array/arraylist
===============================================

Binary search
-------------

One best example I can think of is the binary search, which will search for the key value by dividing the given array or arraylist into halves everytime.

We will first compare the desired key value with the key value of the middle element of the list. Then if it's bigger, repeat the process with the right half of the list; if not, then repeat with left half. By using recursion, we get an *O(log n)* time.