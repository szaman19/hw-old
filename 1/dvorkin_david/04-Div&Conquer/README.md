The algorithm to do this would be a loop that goes from the start to the end of the sorted array, and stops when the input
value is found. for (int i = 0; i < array.size(); i++) is the loop, and it can stop at if (array[i] == "string"){
return string}. It can be more efficient by starting from the back if the input word starts with a letter after the first
half of the alphabet and counting backward instead of forward.
