public class PassengerCar extends Kia{

    private int numberOfSeats;

    private String carClass;

    public PassengerCar(String modelCar, int year, int numberOfSeats, String carClass) {
        super(modelCar, year);
        this.numberOfSeats = numberOfSeats;
        this.carClass = carClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    @Override
    public void print() {
        System.out.println("\nModel Car " + getModelCar() + "\nYear Car " + getYear()
         + "\nNumber Of Seats " + numberOfSeats + "\nClass Car " + carClass);
    }
}
