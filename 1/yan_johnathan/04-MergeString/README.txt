If the array or ArrayList is already sorted, we can divide the group in two and find the group in which
it cannot be in and eliminate those index values, therefore already dividing your possible results by half.
You can continuously do this until the halves intersect, and if they do not pass eachother the intersection
point is the index value of the wanted value.