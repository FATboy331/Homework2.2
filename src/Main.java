public class Main {

    public static void main(String[] args) {
        Jeep jeep = (Jeep) createObject("Jeep");
        jeep.print();
        ElectricCar electricCar = (ElectricCar) createObject("ElectricCar");
        electricCar.print();
        PassengerCar passengerCar = (PassengerCar) createObject("PassengerCar");
        passengerCar.print();
    }
    public static Kia createObject(String className){
    switch (className){
        case "Jeep":
            return new Jeep("KIA Sportage", 2014, "4WD", 3.5);

        case "ElectricCar":
            return new ElectricCar("KIA EV6", 2020,"90%", 320);

        case "PassengerCar":
            return new PassengerCar("KIA K7", 2019, 4,"Business Class");

        default:
            return null;
    }
    }

}