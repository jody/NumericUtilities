/* UtilitiesTest.java */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Tests for the Utilities class.
 * 
 * <h2>Reflection:</h2>
 * Personal learning and insights gained as
 * a result of reflecting back on this assignment.
 * @author Your Name Here
 * 
 * @author Copyright &copy; 2024 Dr. Jody Paul (GPLv3)
 * @version 1.1.2
 */
public class UtilitiesTest {
    /** No-parameter constructor for test class UtilitiesTest. */
    public UtilitiesTest() {
    }

    /** Set up the test fixture before every test case method is invoked. */
    @BeforeEach
    public void setUp() {
    }

    /** Tear down the test fixture after every test case method exits. */
    @AfterEach
    public void tearDown() {
    }

    /** Test numberOfConnections with single-digit positive values. */
    @Test
    public void numberOfConnectionsTestSmallValidParams() {
        assertEquals(0, Utilities.numberOfConnections(0));
        assertEquals(0, Utilities.numberOfConnections(1));
        assertEquals(1, Utilities.numberOfConnections(2));
        assertEquals(3, Utilities.numberOfConnections(3));
        assertEquals(6, Utilities.numberOfConnections(4));
        assertEquals(10, Utilities.numberOfConnections(5));
    }

    /** Test numberOfConnections with a range of positive values. */
    @Test
    public void numberOfConnectionsTestLargerValidParams() {
        assertEquals(4950L, Utilities.numberOfConnections(100));
        assertEquals(499500L, Utilities.numberOfConnections(1000));
        assertEquals(49995000L, Utilities.numberOfConnections(10000));
    }
}
