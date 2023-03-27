package coursejava.classes.javacore.classintroduction.domain;

public class School {
  private String name;
  Teacher[] teachers;
  public School(String name, Teacher[] teacher){
    this.name = name;
    this.teachers = teacher;
  }
  public void show(){
    System.out.println("School ==> "+this.name);
    for(Teacher t: this.teachers){
      System.out.println("Name ==> "+t.getName());
    }
  }
  public Teacher[] getTeachers() {
    return teachers;
  }
  public void setTeachers(Teacher[] teachers) {
    this.teachers = teachers;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
