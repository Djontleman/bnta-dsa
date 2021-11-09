# Day 3, Second task
From: Rossnkama / DSA / Day 3 - Task 4.md

## Complexity analysis of linked lists - 30 mins!

## Linked Lists
Let's analyse and discuss the complexities of the code blocks below.

I know each add operation etc is hardcoded but let's analyse the general complexity of an N sized linked list for each example.

> Each scenario has a space complexity of O(1) as the linked list doesn't need to be copied.

### 1. Accessing head node
``` java
LinkedList<String> list=new LinkedList<String>();

//Adding elements to the Linked list
list.add("Steve");
list.add("Carl");
list.add("Raj");
//Adding an element to the first position
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the 3rd position
list.add(2, "Glenn");

// Time and space complexity of this operation?
firstVar = list.getFirst();
```
**Complexity = O(1) Time - O(1) Space**
> Because the head is exposed to us.

---
### 2. Accessing tail node
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the middle position
list.add(1, "Glenn");

// Time and space complexity of this operation?
firstVar = list.getLast();
```
Complexity = O(N) Time, - O(1) Space
> We have to traverse the linked list to find an nth node as it's not a contiguous datatype.

---
### 3. Accessing the middle node
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the middle position
list.add(1, "Glenn");

// Time complexity of this operation?
list.get(1)
```
Complexity = O(N) Time
> The same as for access the last node. Only half the list is traversed, 
> but this normalises to O(N).

---
### 4. Inserting, Modifying or removing head node
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the middle position
list.add(1, "Glenn");

// Time complexity of this operation?
list.addFirst("John");
```
Complexity = O(1) Time
> The head is exposed to us, and as linked lists use pointers, the other elements aren't modified.

---
### 5. Inserting, Modifying or removing tail node
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the middle position
list.add(1, "Glenn");

// Time complexity of this operation?
list.addLast("John");
```
Complexity = O(N) Time
> The process of getting to the last node is linear, and just like for the first node,
> modifying this node is O(1) as nothing else is affected.

---
### 6. Inserting, Modifying or removing middle node
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");

// Time complexity of this operation?
list.add(1, "Warren");
```
Complexity = O(N) Time
> The same process as for the last node.

---
### 7. Searching for a value in the linked list
``` java
list.addFirst("Negan");
//Adding an element to the last position
list.addLast("Rick");
//Adding an element to the middle position
list.add(1, "Glenn");

// Time complexity of this operation?
int firstIndex = linkedlist.indexOf("insert_name");
```
Complexity = O(N) Time
> The same process as for accessing, as the list needs to be traversed.

---
## Doubly linked Lists
Let's analyse and discuss the complexities of the code blocks below:

Here's some documentation for a Linked List Library:
- In your own time, play around with it and implement your own linked list class.

https://jgrapht.org/javadoc/org.jgrapht.core/org/jgrapht/util/DoublyLinkedList.html

### 1. Accessing head node
**Complexity = O(1) Time - O(1) Space**
> Because the head is exposed to us.

---
### 2. Accessing tail node
Complexity = O(1) Time, - O(1) Space
> Because the tail is exposed to us.

---
### 3. Accessing the middle node
Complexity = O(N)
> The same as for a singly-linked list.

---
### 4. Inserting, Modifying or removing head node
Complexity = O(1)
> The same as for a singly-linked list.

---
### 5. Inserting, Modifying or removing tail node
Complexity = O(1)
> As the tail is exposed to us, this is the same as for the head node.

---
### 6. Inserting, Modifying or removing middle node
Complexity = O(N)
> The same as for a singly-linked list

---
### 7. Searching for a value in the linked list
Complexity = O(N)
> The same as for a singly-linked list.