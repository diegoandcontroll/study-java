package coursejava.classes.javacore.classintroduction.domain;

public class Car {
  private String model;
  private double totalKm;
  private static double maxKm;

  public Car(String model,double totalKm){
    this.totalKm = totalKm;
    this.model = model;
  }

  public void showCar(){
    System.out.println("Model ==> "+this.model);
    System.out.println("TotalKm ==> "+this.totalKm);
    System.out.println("MaxKm ==> "+Car.maxKm);
  }

  public static void setMaxkm(double maxKm){
    Car.maxKm = maxKm;
  }
}
