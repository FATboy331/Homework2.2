public class ElectricCar extends Kia{

    private String batteryCapacity;

    private int maxSpeed;

    public ElectricCar(String modelCar, int year, String batteryCapacity, int maxSpeed) {
        super(modelCar, year);
        this.batteryCapacity = batteryCapacity;
        this.maxSpeed = maxSpeed;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void print() {
        System.out.println("\nModel Car " + getModelCar() + "\nYear Car " + getYear()
                + "\nBattery Capacity " + batteryCapacity + "\nMax Speed " + maxSpeed);
    }
}

