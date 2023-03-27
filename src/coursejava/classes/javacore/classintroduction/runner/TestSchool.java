package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.School;
import coursejava.classes.javacore.classintroduction.domain.Teacher;

public class TestSchool {
  public static void main(String[] args) {
    Teacher t1 = new Teacher("Test");
    Teacher t3 = new Teacher("Test2");
    Teacher t4 = new Teacher("Test3");
    Teacher t5 = new Teacher("Test4");
    Teacher[] teachers = {t1,t3,t4,t5};
    School school = new School("Konoha", teachers);
    school.show();

  }
}
