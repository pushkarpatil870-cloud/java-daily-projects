# Java Daily Projects - Placement Prep

Daily Java coding - 1 project per day.

### 🎯 Goal
Complete 30 Projects before 25th Nov 2026

---

### Day 01: Calculator

#### About
Simple calculator using methods for basic operations.

#### Working
1. Takes two numbers from user
2. Shows menu for Add/Sub/Mul/Div/GCD
3. Calls respective method
4. Returns result

#### How to Run
javac Calculator.java
java Calculator

#### Test Example
Input: a=10 b=5, Choice=Add
Output: Result = 15

---

### Day 02: Student Grade Calculator

#### About
Takes 5 subject marks and gives total, percentage and grade.

#### Working
1. Loop 5 times to take marks using Scanner
2. Calculate total = sum of all 5
3. Calculate percentage = (total / 500.0) * 100
4. Use if-else to assign grade

#### What I Learned
- total / 500 = 0 (int division), total / 500.0 = 80.0 (double division)

#### Grade Logic
- 90+ = A, 75+ = B, 60+ = C, Below 60 = Fail

#### How to Run
javac StudentGrade.java
java StudentGrade

#### Test Example
Input: 80 70 90 85 75
Output: Total: 400, Percentage: 80.0%, Grade: B

---

### Day 03: Number Guessing Game

#### About
Console game where user guesses secret number 1-100.

#### Working
1. Generate random number using Random class
2. Start while(true) loop
3. Take user guess
4. If guess < secret -> print Too low
5. If guess > secret -> print Too high
6. If guess == secret -> print Correct and break loop

#### How to Run
javac NumberGame.java
java NumberGame

#### Test Example
Secret: 63
Guess: 50 -> Too low!
Guess: 75 -> Too high!
Guess: 63 -> Correct! Attempts: 3

---

### Day 04: ATM Simulation System

#### About
Simple ATM with Check Balance, Deposit, Withdraw.

#### Working
1. Initial balance = 1000.0 (static variable)
2. while(true) loop shows menu
3. Choice 1 -> checkBalance() method shows balance
4. Choice 2 -> deposite() adds amount to balance (balance += amt)
5. Choice 3 -> Withdraw() subtracts if amt <= balance else Insufficient
6. Choice 4 -> break loop and exit

#### How to Run
javac ATM.java
java ATM

#### Test Example
Choose: 1
Output: Your Balance: 1000.0

Choose: 2, Enter: 500
Output: Deposited: 500.0

Choose: 1
Output: Your Balance: 1500.0

Choose: 3, Enter: 300
Output: Withdrawn: 300.0

Choose: 1
Output: Your Balance: 1200.0

Choose: 4
Output: Bye!

---

## 👨‍💻 Author
Placement Preparation | Learning Core Java Daily
