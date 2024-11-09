public class Car extends Vehicle implements Driveable {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }
}
