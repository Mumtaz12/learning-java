package Section07.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {
//        return "Car " + name + " is starting";
        return getClass().getSimpleName() + " -> startEngine()";
    }


    public String accelerate() {
//        return "Car " + name + " is accelerating";
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
//        return "Car " + name + " is braking";
        return getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
