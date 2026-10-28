# Java Daily Projects - Placement Prep

Daily Java coding - 1 project per day.

### Day 1: Calculator
- Add, Subtract, Multiply, Divide
- GCD calculation
- File: Calculator.java

- # Day 2 - Student Grade Calculator

Java program that takes 5 subject marks and gives total, percentage and grade.

### What I learned
- Why `total / 500` gives 0% and `total / 500.0` gives correct 80% (int vs double division)
- Using while loop to take 5 inputs
- if-else for grading

### Grade Logic
90+ = A
75+ = B
60+ = C
Below 60 = Fail

### How to Run
javac studentGrade.java
java studentGrade

### Test Case
Input: 80 70 90 85 75
Output: Total: 400, Percentage: 80.0%, Grade: B

# Day 03 - Number Guessing Game

## What I Built
A Java console game where user guesses a secret number (1-100) with hints

## Concepts Used
- `Random` class - to generate secret number
- `Scanner` - user input
- `while(true)` + `break` - infinite loop until correct guess
- `if-else` - high/low hints
-  Counter - attempt tracking

## How to Run
```bash
javac NumberGame.java
java NumberGame

Guess (1-100): 50
Too low!
Guess (1-100): 75
Too high!
Guess (1-100): 63
Correct! Attempts: 3
Secret number 63 is not Prime

## What I Learned
- Used Random to get number 1 to 100
- Used Scanner to take user guess
- Used while loop with break to keep guessing
- Used if-else for high/low hints
- Counted attempts

### Goal
30 projects before 25th Nov
