### How to Run the Tests

1. Navigate to the project directory.

2. Compile the source code and tests:
        javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar *.java

3. Run the test suite:
        java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuiteAll

    To run an individual test class, such as **`CalculatorTest`**, use:
        java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest

    **If you are on Windows, replace `:` with `;`.**
