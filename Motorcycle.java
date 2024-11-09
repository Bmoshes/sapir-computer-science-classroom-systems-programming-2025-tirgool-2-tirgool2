public class Motorcycle extends Vehicle implements Driveable {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void drive() {
        System.out.println("Riding the motorcycle...");
    }
}
