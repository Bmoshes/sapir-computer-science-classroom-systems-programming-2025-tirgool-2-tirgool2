public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2020);
        Vehicle truck = new Truck("Ford", 2019);
        Vehicle motorcycle = new Motorcycle("Harley", 2021);

        car.startEngine();
        ((Driveable) car).drive();

        truck.startEngine();
        ((Driveable) truck).drive();

        motorcycle.startEngine();
        ((Driveable) motorcycle).drive();
    }
}
