package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Person;

public class TestPerson {
  public static void main(String[] args) {
    Person person = new Person("Goku", 100, "Av. zé claudino");
    // person.setName("Goku");
    // person.setAge(100);
    // person.init("Goku", 110, "Av. josé claudino");
    String text = person.showInfo();

    System.out.println(text);
    // System.out.println(person.getName());
  }
}
