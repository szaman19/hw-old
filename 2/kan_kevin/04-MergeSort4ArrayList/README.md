Search a Sorted ArrayList
=========================
(a plausible algorithm by Kevin Kan)

If you start with a sorted arraylist, then instead of searching through every element in a list (which would work at the same speed as an unsorted arraylist), you should compare the item you are searching for with the item in the middle of the arraylist. Then determine which side of the middle it is on, and recursively search it the same way with half the size of the list.

This is the same method to finding a name in one of those huge books of names. (Learned from Mr. Brooks in the few days I was in Math Intel Research). You would flip to somewhere in the middle of the book. see which side it's on, and rip off the other side. Then you repeat the search the same way on the size you have left. 
