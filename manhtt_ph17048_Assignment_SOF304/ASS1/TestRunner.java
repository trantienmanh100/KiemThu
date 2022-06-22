package Entity;

import org.junit.runner.notification.Failure;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore ();
		Result result = runner.run (TestSuite.class);
		System.out.println ("run tests: " + result.getRunCount ());
		System.out.println ("failed tests: " + result.getFailureCount ());
		System.out.println ("ignored tests: " + result.getIgnoreCount ()) ;
		for(Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("All Test Case are:"+result.wasSuccessful());
	}
}
