package coursejava.classes.javacore.classintroduction.domain;

public class Person {
  private String name;
  private int age;
  private String address;

  public Person(String name,int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }
  // public void init(String name,int age){
  //   this.name = name;
  //   this.age = age;
  // }

  // public void init(String name,int age, String address){
  //   this.init(name, age);
  //   this.address = address;
  // }

  public String showInfo(){
    return "Name: ==> "+this.name+"\nAge: ==> "+this.age+"\nAddress: ==>"+this.address;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
}
