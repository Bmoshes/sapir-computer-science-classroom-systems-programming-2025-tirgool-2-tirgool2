public class Truck extends Vehicle implements Driveable {
    public Truck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the truck...");
    }
}
