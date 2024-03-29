import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;
import org.junit.Test;
import org.junit.runner.notification.Failure;


public class TestListener extends RunListener {

	private int exceptionTestCount = 0;

	@Override
	public void testRunStarted(Description description) throws Exception {
		System.out.println("================Test run started=======================\n");
	}

	@Override
	public void testStarted(Description description) throws Exception {
		System.out.println("Started: " + description.getDisplayName());

		Test testAnnotation = description.getAnnotation(Test.class);
		if (testAnnotation != null && testAnnotation.expected() != Test.None.class) {
			exceptionTestCount++;
		}
	}

	public void testFailure(Failure description) {
		System.out.println("Failed: " + description.getDescription().getDisplayName());
		System.out.println("Exception: " + description.getException());
	}

	public void testFinished(Description description) {
		System.out.println("Finished: " + description.getDisplayName());
		System.out.println("---------------------------------------------------");
	}

	@Override
	public void testRunFinished(org.junit.runner.Result result) throws Exception {
		System.out.println("\n================Test run finished======================\n");
		System.out.println("Number of tests dealing with exceptions: " + exceptionTestCount);
	}
}
