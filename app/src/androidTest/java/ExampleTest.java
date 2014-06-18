import android.test.InstrumentationTestCase;

public class ExampleTest extends InstrumentationTestCase {

    public void testBasic() throws Exception {
        assertNull(null);
    }

    public void testFailedOnPurpose() throws Exception {
        assertEquals(1, 2);
    }

    public void testTrueEqualsTrue() throws Exception {
        assertEquals(true, true);
    }
}