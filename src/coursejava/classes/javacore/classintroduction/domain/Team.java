package coursejava.classes.javacore.classintroduction.domain;

public class Team {
  private String name;
  private Player player;

  public Team(String name, Player player){
    this.name = name;
    this.player = player;
  }
  public void showPlayersOnTeam(){
    System.out.println("Team ==> "+this.name);
    System.out.println("PlayerName ==> "+this.player.getPlayer());
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public Player getPlayer(){
    return this.player;
  }
  public void setPlayer(Player player){
    this.player = player;
  }
}
