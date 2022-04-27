package Section06.CarpetCostCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloorTest {
    @Test
    public void TestSimpleFloorPrice1() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        double price = calculator.getTotalCost();
        assertEquals(38.5, price, 0.1);
    }

    @Test
    public void TestSimpleFloorPrice2() {
        Carpet carpet = new Carpet(1.5);
        Floor floor = new Floor(5.4, 4.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        double price = calculator.getTotalCost();
        assertEquals(36.45, price, 0.01);
    }
}
