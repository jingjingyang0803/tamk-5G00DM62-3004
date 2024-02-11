## Description

This project is designed to showcase the fundamentals of unit testing using Java and its framework. It includes a main program along with multiple classes, and unit tests for all methods in each class (with three test cases per method), excluding the main class.

## Class Descriptions

1. Calculator: This class handles basic arithmetic operations such as addition, subtraction, multiplication, division and square.
2. Checker: This class handles checking if a number is even, odd, positive, prime, or a palindrome.
3. Converter: This class handles converting units such as temperature, weight and distance.
4. Sorter: This class handles sorting arrays in ascending or descending order. It also includes methods for finding the maximum and minimum values, and calculating the sum of all values in an array.
5. Randomizer: This class handles generating random numbers within a given range. It can also generate a list of random integers within a specified range, and an array of random integers within a specified range. It can also pick a random element from a given list and generate a random boolean value.

## Instructions

### Software Requirements

- Java Development Environment (JDK and JRE)
- JUnit Library
- Hamcrest Library
- CPSuite Library

### How to Run the Tests

1. Navigate to the project directory.
2. Compile the source code and tests:

   ```bash
   javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar *.java
   ```

3. Run the test suite:

   ```bash
   java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuiteAll
   ```

   To run an individual test class, such as **`CalculatorTest`**, use:

   ```bash
   java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
   ```

   **If you are on Windows, replace `:` with `;`.**
