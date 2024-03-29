/*
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" \
    TestSuiteAll.java

java -cp ".:hamcrest-core-1.3.jar:junit-4.13.2.jar" \
    org.junit.runner.JUnitCore \
    TestSuiteAll

If you are on Windows, replace : with ;.
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.JUnitCore;

@RunWith(Suite.class)

@SuiteClasses({
		CalculatorTest.class, // includes 1 tests dealing with exceptions
		CheckerTest.class,
		ConverterTest.class,
		ArraySorterTest.class,
		RandomizerTest.class, // includes 1 tests dealing with exceptions
		BoardTest.class,
		PlayerProfileTest.class,
		PatternDrawerTest.class,
		SequenceGeneratorTest.class,
		BankAccountTest.class // includes 3 tests dealing with exceptions
})

public class TestSuiteAll {
	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TestListener());
		junit.run(TestSuiteAll.class);
	}
}