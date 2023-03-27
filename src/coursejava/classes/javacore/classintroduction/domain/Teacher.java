package coursejava.classes.javacore.classintroduction.domain;


public class Teacher {
  private String name;


  public Teacher(String name){
    this.name = name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void show(){
    System.out.println(this.name);
  }
}
