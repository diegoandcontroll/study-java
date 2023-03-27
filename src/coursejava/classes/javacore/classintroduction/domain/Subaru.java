package coursejava.classes.javacore.classintroduction.domain;

public class Subaru extends NewCar{
  private String model;
  public Subaru(int totalKm, boolean isStep, String color, double value){
    super(totalKm, isStep, color, value);
  }
  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void show(){
    super.show();
    System.out.println("## BRAND CARD ##");
    System.out.println(this.model);
  }
}
