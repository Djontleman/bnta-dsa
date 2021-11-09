# Day 2, Third task
From: Rossnkama / DSA / Day 2 - Task 3.md

## Complexity normalization - 15 mins!

Let's analyse and discuss the complexities of the code blocks below:

### 1.
``` java
int n = 100;
int[] initialiseArray(int size = n);
```
Space Complexity = ?

Time Complexity = O(1)
as the computer will assign space in the RAM for the array and this will be one action.
No matter how big the array is, this will be one action.

---

### 2.
``` java
for (int i=0; i < 9; i++) {
	System.out.println(i);
}
```
Space Complexity = ?

Time Complexity = O(1)
as the number of actions will always be the same.
This code has a complexity of O(9) as there are 9 steps, which normalizes to O(1).

---
### 3.
``` java
int[array] = {1, 2, 3};
for (int number : array) {
	System.out.println(number)
}
```
Space Complexity = ?

Time Complexity = O(N) as one action is taken for each element in the array.
As the length of the array increases, the number of actions increases by the same amount.


---
### 4.
``` java
int[array] = {1, 2, 3};
for (int i=0; i < 100; i++) {
	for (int number : array) {
		System.out.println(number)
	}
}
```
Space Complexity = ?

Time Complexity = O(N) as for each new element, 100 actions are added.
This gives a complexity of O(100N), which normalizes to O(N).

---

### 5.
``` java
for (int i=0; i < 100; i++) {
	int a = 1;
	int b = 3;
	int c = 44;
	System.out.println(a + b);
	System.out.println(c + a);
	System.out.println(a + c);
	System.out.println(r + b);
}
```
Space Complexity = ?

Time Complexity = O(1) as the number of actions is constant.
There are 100 * (3 + 4) steps, giving a complexity of O(700),
which normalizes to O(1).

---

### 6.
``` java
String greeting = "Hello world!";
String upperString = "";

for (char character : greeting) {
    upperstring += character.toUpper();
}
```
Space Complexity = ?

Time Complexity = ?

## Homework
Research and implement the bubble sort algorithm with the optimal space-time complexity in Java for tomorrows lesson.

This time try completing the engineering your solution without class outlines or function signatures from me.

It's time to practice architecting what your code will look like by yourself with flow charts, pseudo-code or whatever works for you. I'll leave you with this starting point:
[Bubble sort in 2 minutes - YouTube](https://www.youtube.com/watch?v=xli_FI7CuzA)

Feel free to work in groups.
