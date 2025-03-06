import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TripCostCalculatorTest {

    @Test
    public void testCalculateCost() {
        assertEquals(15.0, TripCostCalculator.calculateCost(100, 5, 3));

        assertEquals(20.0, TripCostCalculator.calculateCost(200, 5, 2));

        assertEquals(10.0, TripCostCalculator.calculateCost(50, 5, 4));

        assertEquals(0.0, TripCostCalculator.calculateCost(0, 5, 3));

        assertEquals(0.0, TripCostCalculator.calculateCost(-100, 5, 3));

        assertEquals(0.0, TripCostCalculator.calculateCost(100, 5, -3));
    }
}
