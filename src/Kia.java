public abstract class Kia implements Printable{
     private String modelCar;
     private int year;

     public Kia(String modelCar, int year) {
          this.modelCar = modelCar;
          this.year = year;
     }

     public String getModelCar() {
          return modelCar;
     }

     public void setModelCar(String modelCar) {
          this.modelCar = modelCar;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     @Override
     public void print() {

     }
}
