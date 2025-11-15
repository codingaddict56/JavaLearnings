public class Main {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle("BMW", 60);
        vh.displayinfo();

        Car car = new Car("Audi", 80, "Petrol");
        car.displayinfo();

        ElectricCar ec = new ElectricCar("Tesla", 100, "Electric", 85);
        ec.displayinfo();

    }
}