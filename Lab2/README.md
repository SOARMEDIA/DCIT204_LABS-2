# DCIT 204 – Lab 2: Interactive Array Algorithms

This project contains two interactive Java console programs that demonstrate
fundamental array algorithms using user input collected via `Scanner`.

## Files

| File | Description |
|------|-------------|
| `FindMax.java` | Reads an array from the user and finds the maximum value and its index using a **linear search**. |
| `PairSum.java` | Reads an array and a target sum from the user, then uses a **brute-force nested loop** to find a pair of values that add up to the target. |

## How to Compile and Run

Open a terminal in the `Lab2` folder and run:

```bash
# Compile
javac FindMax.java
javac PairSum.java

# Run
java FindMax
java PairSum
```

## Task 1: Find Maximum (Linear Search)

**Algorithm Steps**
1. Prompt the user for the array size `n`.
2. Create an `int[]` array of size `n`.
3. Read `n` integers from the user, one at a time.
4. Loop through the array once, tracking the largest value seen so far and
   its index.
5. Print the maximum value and the index at which it was found.

**Time Complexity:** `O(n)` — the array is scanned exactly once.

**Sample Run**
```
Enter the number of elements in the array: 5
Enter 5 integer value(s):
Element [0]: 3
Element [1]: 9
Element [2]: 1
Element [3]: 7
Element [4]: 4

----- RESULTS -----
Array entered : [3, 9, 1, 7, 4]
Maximum value : 9
Found at index: 1
--------------------
```

## Task 2: Pair Sum (Brute Force)

**Algorithm Steps**
1. Prompt the user for the array size `n`.
2. Create an `int[]` array of size `n`.
3. Read `n` integers from the user.
4. Prompt the user for a target sum.
5. Use two nested loops (`i` from `0` to `n-1`, `j` from `i+1` to `n-1`) to
   check every possible pair exactly once.
6. As soon as a pair `numbers[i] + numbers[j] == target` is found, print the
   indices, values, and the equation, then stop searching.
7. If the loops finish with no match, print a "no pair found" message.

**Time Complexity:** `O(n^2)` — every unique pair `(i, j)` with `i < j` is
checked in the worst case.

**Sample Run (pair found)**
```
Enter the number of elements in the array: 5
Enter 5 integer value(s):
Element [0]: 2
Element [1]: 7
Element [2]: 11
Element [3]: 15
Element [4]: 4
Enter the Target Sum: 9

----- RESULT -----
Pair found!
Index 0 -> Value: 2
Index 1 -> Value: 7
Equation: 2 + 7 = 9
-------------------
```

**Sample Run (no pair found)**
```
Enter the number of elements in the array: 3
Enter 3 integer value(s):
Element [0]: 1
Element [1]: 2
Element [2]: 3
Enter the Target Sum: 100

No pair of numbers in the array sums up to 100.
```

## Learning Outcomes

- Reading user input with `Scanner`.
- Working with arrays in Java.
- Implementing linear search.
- Implementing brute-force pair search.
- Analyzing time complexity (`O(n)` vs `O(n^2)`).
- Writing clean, readable Java code.
- Using Git/GitHub for version control.
