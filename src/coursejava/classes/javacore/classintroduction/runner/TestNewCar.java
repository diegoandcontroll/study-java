package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Subaru;

public class TestNewCar {
  public static void main(String[] args) {
    Subaru subaru = new Subaru(0, true, "red",150000);
    subaru.setModel("SUBARU IMPREZA");
    subaru.show();
  }  
}
