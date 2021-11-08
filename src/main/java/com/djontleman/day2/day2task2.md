# Day 2, Second task
From: Rossnkama / DSA / Day 2 - Task 2.md

## Don't forget about RAM! - 30 mins!
We've had a little deep dive into the memory view in C++ to see what the basic fundamental operations are (INSERT, COMPARE, INITIALISE, STORE).

You might be beginning to form an intuitive understanding about how to CPU writes to RAM, executing your algorithms and manipulating data to spit out the solution to the problem.

O(1) just means a constant number one or more fundamental operations.

O(N) A linearly growing number of constant time fundamental operations

O(N^2) An exponentially growing number of constant fundamental operations.

### Work out the complexities for the Array methods below in Java
```[]int array = {1, 2, 3, 4, 5}``` or ArrayList

One person from each group gives their explanation and we can discuss it together.

#### 1. Getting the value at the index of array (We did this one already)
```>>> System.out.println(array[0]);```

O(1) - Explanation:
We know that the next int is a set number of bytes away, so we just have to do simple maths to work out which memory block is the index that holds the value we want to manipulate.

---
#### 2. Update value at a given index
```>>> array[0] = 6;```

O(1) - Explanation:
We are simply reassigning the value at that memory location.
No matter the length of the array or the new number, there will only be one action.

---
#### 3. Insert value at beginning of array
```>>> array.add(0, yourInteger);```

O(N) - Explanation:
In order to add a new element to the start of the array, 
the rest of the elements will need to be (conceptually) shifted to the right.
For an array, this will be done by making a new array and populating it with the elements from the old array,
adding the new element to the front.
This will scale linearly with the length of the array.
With an arraylist the same process is done, but it is done by the CPU.

---
#### 4. Insert value in middle of array
```>>> arrayList.add(middleOfArray, yourInteger);```

O(N) - Explanation:
The same process as for adding to the start of an array applies to adding to the middle.
A new copy will need to made even though only half of the elements are being (conceptually) shifted.

---
#### 5. Insert value at end of array
```Watch out: ArrayList and Array have different complexities```

O(N) for Array - Explanation:
The same process as for adding to the start or middle. As an array has a fixed length.

Amortized O(1) for ArrayList - Explanation:
For an arraylist as when an arraylist is initialised, additional space is reserved.
When adding to the end of the list, this reserved space is utilised.
This means that a copy does not have to be made. 

However, when this reserved space is full and a new element is to be added, the complexity becomes O(N). 
As at this point, a copy is made with more reserved space.
The complexity is amortized as O(N) is a rare case.

---
#### 6. Remove value from the beginning of the array
```>>> arrayList.remove(beginningOfArray, yourInteger);```

O(N) - Explanation:
The same process as for adding. A new copy is made without the first element.

---
#### 7. Remove value from the middle of the array
```>>> arrayList.remove(middleOfArray, yourInteger);```

O(N) - Explanation:
The same process as for removing from the start of an array.

---
#### 8. Remove value from the end of the array
```>>> arrayList.remove(endOfArray, yourInteger);```

O(1) for ArrayList - Explanation:
To remove from the end, the last element in memory is de-initialised.
This does not require the rest of the array to be copied, as none of the other elements are (conceptually) shifted.

O(N) - for Array - Explanation
(This is for removing the last element and so shortening the length of the array):
The same process as for adding to an array.
The array has a fixed length, so a new array has to be made and populated with the element from the old array.

---
#### 10. Copy an array
There are many methods that secretly do this:
``````java
e.g. Arrays.asList(array).subList(index, array.length);
``````

O(N) - Explanation:
When copying an array, a new array is made and then populated with the elements from the old array.
This scales with the length of the array to be copied.