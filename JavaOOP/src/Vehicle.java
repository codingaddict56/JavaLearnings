public class Vehicle {

    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

   // accelerate(), brake(), and displayInfo()
    public void accelerate(){
        System.out.println("The vehicle accelerate at speed" + speed);
    }

    public void brake(){
        System.out.println("vehicle brakes at speed :" + speed);
    }

    public void displayinfo(){
        System.out.println("Vehicle info: Brand=" + brand + " Speed=" + speed);
    }
}
