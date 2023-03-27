package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Car;

public class TestCar {
  public static void main(String[] args) {
    Car c1 = new Car("BMW", 280);
    Car.setMaxkm(200);
    c1.showCar();
  }
}
