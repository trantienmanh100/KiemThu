package OnTap;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import OnTap.TestSuite;

public class testRun {
	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestSuite.class);
		for(Failure f:result.getFailures() ) {
			System.out.println(f.toString());
		}
		System.out.println("Test Case: "+result.getRunCount());
		System.out.println("Failured Test Case: "+result.getFailureCount());
		System.out.println("Ignore Test Case: "+result.getIgnoreCount());
		System.out.println("Result: "+result.wasSuccessful());
	}
}
