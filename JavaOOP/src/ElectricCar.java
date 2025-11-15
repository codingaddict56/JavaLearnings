public class ElectricCar extends Car{

    int batteryCapacity;

    public ElectricCar(String brand, int speed, String fuelType, int batteryCapacity) {
        super(brand, speed, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void displayinfo(){
        System.out.println("Electric Car info: Brand=" + getBrand() + " Speed=" + getSpeed() + " Fuel Type=" + getFuelType() + " Battery=" + getBatteryCapacity() + "kWh");
    }
}
