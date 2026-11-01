# KNUST Student Grade System

A beginner-friendly Java console application developed by **Saviour Fafali Ankugah** while learning Java at Kwame Nkrumah University of Science and Technology (KNUST).

## Overview

The program takes a student's name, age, ID and scores in three courses, calculates the average score, and lets the user choose which result to display.

## Features

- Capture student name, age and ID
- Enter scores for Java, Database Systems and Linear Algebra
- Calculate the arithmetic mean of the three scores
- Display student information or academic results using a numbered menu
- Assign letter grades based on the average
- Report pass/fail status using a 50% average threshold

## Grading rules

| Average score | Grade |
| --- | --- |
| 70 and above | A |
| 60–69.99 | B |
| 50–59.99 | C |
| 40–49.99 | D |
| Below 40 | F |

**Pass:** average >= 50. **Fail:** average < 50.

> These thresholds are the rules implemented in this practice project, not a claim about KNUST's official grading policy.

## Requirements

- Java Development Kit (JDK)
- Terminal or an IDE such as Visual Studio Code

## Run locally

Clone the repository and navigate into it:

```bash
git clone https://github.com/Fafali1234557/KNUST-Student-Grade-System.git
cd KNUST-Student-Grade-System
```

Compile and run:

```bash
javac StudentGradeSystem.java
java StudentGradeSystem
```

Enter the requested information and choose **1**, **2**, or **3** from the menu.

## Java concepts practiced

- Variables and primitive data types
- Console input with `Scanner`
- Arithmetic and floating-point division
- Conditional logic with `if`, `else if`, and `else`
- `switch` statements
- Formatted console output

## Current limitations

- Data is stored only during a single program run.
- Only one menu selection can be made per run.
- Scores and other numeric inputs are not validated.
- The program does not yet store multiple student records.

## Possible improvements

Add input validation, a repeating menu, support for multiple students, and persistent storage.

## Author

**Saviour Fafali Ankugah**  
Computer Science Student, KNUST  
GitHub: [@Fafali1234557](https://github.com/Fafali1234557)

## License

No license has been assigned yet. All rights reserved by default.
