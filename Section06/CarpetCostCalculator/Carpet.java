package Section06.CarpetCostCalculator;

public class Carpet {
    private final double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
