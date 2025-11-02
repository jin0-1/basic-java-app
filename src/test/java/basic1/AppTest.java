package basic1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App class.
 */
public class AppTest extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test if App.main runs without error
     */
    public void testAppMainRuns() {
        try {
            App.main(new String[] {});
            assertTrue(true);  // If no exception, test passes
        } catch (Exception ex) {
            fail("App.main threw an exception: " + ex.getMessage());
        }
    }
}
