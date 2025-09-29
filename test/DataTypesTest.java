import org.junit.Test;
import static org.junit.Assert.*;

public class DataTypesTest {

    /**
     * Test that DataTypes.sum returns the correct value
     * for the sum from 1 to 1 million.
     */
    @Test
    public void largeSumTest() {
        // Expected sum from 1 to 1,000,000
        long x = 500_000_500_000L;

        // Build the array of numbers 1..1,000,000
        int[] numbers = new int[1_000_000];
        for (int i = 1; i <= 1_000_000; i++) {
            numbers[i - 1] = i;
        }

        // Check result
        assertEquals("sum from 1 to 1 million should be " + x,
                x, DataTypes.sum(numbers));
    }
}