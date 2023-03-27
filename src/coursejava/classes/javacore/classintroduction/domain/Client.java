package coursejava.classes.javacore.classintroduction.domain;

public class Client {
  private String name;
  private TypeClient type;
  public Client(String name, TypeClient type){
    this.name = name;
    this.type = type;
  }
  public void setType(TypeClient type) {
    this.type = type;
  }

  public TypeClient getType() {
    return type;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
