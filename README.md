#  Day01 Practicals with Output

This repository contains a collection of Java programs demonstrating various programming concepts, from basic operations to object-oriented programming. Each program's expected output is included.

## Programs Included

### 1. Basic Operations (`one.java`)
## Descriptions


This program demonstrates basic Java functionality, including printing a message, iterating through numbers, and handling odd numbers and number reversal using loops and conditions.

## Features
```
Print a message
Print numbers from 1 to 10
Print numbers in reverse from 10 to 1
Print odd numbers between 1 to 20
Reverse the left and right numbers with only a loop
```
**Output:**
```
Hello World...
--------------------------------------------------
1
2
3
4
5
6
7
8
9
10
--------------------------------------------------
10
9
8
7
6
5
4
3
2
1
--------------------------------------------------
1
3
5
7
9
11
13
15
17
19
--------------------------------------------------
Enter a Number: 9
4 3 2 1 5 9 8 7 6
```

### 2. Student Management (`Student.java` & `StudentMain.java`)
## Descriptions

This program creates a Student class with attributes like name and marks. It calculates the average marks of students.

## Features
```
Create a Student class with getters and setters
Calculate and display the average marks
```

**Output:**
```
Average marks: 86.00
```

### 3. Book Hierarchy (`LibraryDemo.java`)
## Descriptions

This program demonstrates inheritance in Java with different types of books: PrintedBook, EBook, and AudioBook.

## Features
```
Base Book class
Subclasses for different types of books
Display book information
```

**Output:**
```
The Great Gatsby by F. Scott Fitzgerald, 218 pages
1984 by George Orwell, Format: PDF
To Kill a Mockingbird by Harper Lee, Duration: 12.5 hours
```

### 4. Retail Store (`Main.java` with `Product` and `RetailStore` classes)
## Descriptions

A simple retail store management system that allows adding products and displaying available products.

## Features
```
Add products to the store
Display available products
```

**Output:**
```
Available Products:
Apple - $1.0 - 100 in stock
Carrot - $0.5 - 200 in stock
Rice - $2.0 - 50 in stock
```

## How to Compile and Run

1. Compile individual programs:
   ```
   javac one.java
   javac Student.java StudentMain.java
   javac LibraryDemo.java
   javac Main.java
   ```

2. Run the compiled programs:
   ```
   java one
   java StudentMain
   java LibraryDemo
   java Main
   ```

## Notes
- The programs demonstrate progressively more complex Java concepts
- Each program can be run independently
- Some programs may require input from the user
