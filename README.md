# Java Daily Projects - Placement Prep

Daily Java coding - 1 project per day.

### 🎯 Goal
Complete 30 Projects before 25th Nov 2026

---

### Day 01: Calculator
Simple calculator using methods.
- Features: Add, Subtract, Multiply, Divide, GCD
- File: `Calculator.java`

### How to Run
javac Calculator.java
java Calculator

---

### Day 02: Student Grade Calculator
Java program that takes 5 subject marks and gives total, percentage and grade.

#### What I Learned
- Why `total / 500` gives 0% and `total / 500.0` gives correct 80% (int vs double division)
- Using while loop to take 5 inputs
- if-else for grading

#### Grade Logic
- 90+ = A
- 75+ = B
- 60+ = C
- Below 60 = Fail

#### How to Run
javac StudentGrade.java
java StudentGrade

#### Test Case
Input: 80 70 90 85 75
Output: Total: 400, Percentage: 80.0%, Grade: B

---

### Day 03: Number Guessing Game

#### What I Built
A Java console game where user guesses a secret number (1-100) with hints.

#### Concepts Used
- `Random` class - to generate secret number
- `Scanner` - user input
- `while(true)` + `break` - infinite loop until correct guess
- `if-else` - high/low hints
- Counter - attempt tracking

#### How to Run
javac NumberGame.java
java NumberGame

#### Sample Output
Guess (1-100): 50
Too low!
Guess (1-100): 75
Too high!
Guess (1-100): 63
Correct! Attempts: 3

#### What I Learned
- Used Random to get number 1 to 100
- Used Scanner to take user guess
- Used while loop with break to keep guessing
- Used if-else for high/low hints
- Counted attempts

---

### Day 04: ATM Simulation System
#### JAVA CONSOLE PROJECT

#### About Project
Simple console-based ATM Simulation. Performs basic ATM operations like Check Balance, Deposit and Withdraw. Made for learning Core Java basics.

#### Features
* Check Balance
* Deposit Money
* Withdraw Money with Balance Validation
* Exit Option

#### Technology Used
* Language: Java
* Concepts: Scanner, if-else, while loop, Methods, static keyword

#### How to Run
javac ATM.java
java ATM

#### Why Static Used?
Because main() is static in Java. Static method can only access static data directly. So balance and Scanner are made static to use without creating object.

#### Future Scope
* Add PIN Verification
* Make OOP version without static
* Add Transaction History

---

## 👨‍💻 Author
Placement Preparation | Learning Core Java Daily
