public class Car extends Vehicle {

    String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void displayinfo(){
        System.out.println("Car info: Brand=" + getBrand() + " Speed" + getSpeed() + " Fuel Type=" + getFuelType());
    }
}
