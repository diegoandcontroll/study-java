package coursejava.classes.javacore.classintroduction.domain;

public class NewCar {
  private int totalKm;
  private String color;
  private boolean isStep;
  private double value;

  public NewCar(int totalKm, boolean isStep, String color, double value){
    this.totalKm = totalKm;
    this.isStep = isStep;
    this.color = color;
    this.value = value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public void setTotalKm(int totalKm) {
    this.totalKm = totalKm;
  }
  public String getColor() {
    return color;
  }
  public void setStep(boolean isStep) {
    this.isStep = isStep;
  }

  public int getTotalKm() {
    return this.totalKm;
  }

  public boolean getIsStep(){
    return this.isStep;
  }

  public double getValue() {
    return value;
  }

  public void show(){
    System.out.println("## CAR ##");
    System.out.println(this.color);
    System.out.println(this.totalKm+" Kmh");
    System.out.println("Steps on : "+this.isStep);
    System.out.println(this.value+" R$");
  }
}
