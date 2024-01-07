    package edu.estu;

    import org.junit.Test;

    import static org.junit.Assert.fail;

    public class FailingTest {

        @Test(timeout = 100) // Fail the test if it takes longer than 100 milliseconds
        public void testInfiniteLoop() {
        App.infiniteLoop(Double.POSITIVE_INFINITY); // Trigger the infinite loop
        fail("Expected an infinite loop, but the test completed successfully.");
        }
    }


