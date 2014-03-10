If the ArrayList is already sorted you can go through the list starting at the
middle object and if the object you need is lower, check the middle of the
first half of the list and if it is higher check the middle of the second half
of the list. Continue to do this until you have found your answer or you have
gone through the list. By doing this, you reduce your search time from n to 
log base 2 n.