public class Jeep extends Kia{

    private String suspensionType;

    private double engineVolume;

    public Jeep(String modelCar, int year, String suspensionType, double engineVolume) {
        super(modelCar, year);
        this.suspensionType = suspensionType;
        this.engineVolume = engineVolume;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void print() {
        System.out.println("\nModel Car " + getModelCar() + "\nYear Car " + getYear()
                + "\nSuspension Type " + suspensionType + "\nEngine Volume " + engineVolume);
    }
}
