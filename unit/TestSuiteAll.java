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

@RunWith(Suite.class)

@SuiteClasses({
		CalculatorTest.class,
		CheckerTest.class,
		ConverterTest.class,
		SorterTest.class,
		RandomizerTest.class
})

public class TestSuiteAll {
	// the class remains empty,
	// used only as a holder for the above annotations
}