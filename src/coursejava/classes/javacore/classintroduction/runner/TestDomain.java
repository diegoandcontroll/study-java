package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Aula01;

public class TestDomain {
  public static void main(String[] args) {
    Aula01 obj = new Aula01();
    obj.name = "Diego";
    obj.age = 24;
    obj.gender = 'M';
    obj.sumNumber(obj.number);
    // System.out.println("Person ==> "+obj.name+" "+obj.age+" "+obj.gender);
  }
}
