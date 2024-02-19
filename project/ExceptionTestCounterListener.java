import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;
import org.junit.Test;

public class ExceptionTestCounterListener extends RunListener {

	private int exceptionTestCount = 0;

	@Override
	public void testRunStarted(Description description) throws Exception {
		System.out.println("Test run started");
	}

	@Override
	public void testStarted(Description description) throws Exception {
		Test testAnnotation = description.getAnnotation(Test.class);
		if (testAnnotation != null && testAnnotation.expected() != Test.None.class) {
			exceptionTestCount++;
		}
	}

	@Override
	public void testRunFinished(org.junit.runner.Result result) throws Exception {
		System.out.println("Test run finished");
		System.out.println("Number of tests dealing with exceptions: " + exceptionTestCount);
	}
}
