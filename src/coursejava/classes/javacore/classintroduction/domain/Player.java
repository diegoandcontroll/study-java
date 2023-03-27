package coursejava.classes.javacore.classintroduction.domain;

public class Player {
  private String name;

  public Player(String name){
    this.name = name;
  }
  public String getPlayer(){
    return this.name;
  }
  public void showPlayer(){
    System.out.println(this.name);
  }
}
