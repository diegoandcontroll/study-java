package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Player;
import coursejava.classes.javacore.classintroduction.domain.Team;

public class TestTeam {
  public static void main(String[] args) {
    Player p1 = new Player("Diego");
    Team team1 = new Team("Corinthians", p1);
    System.out.println(team1.getName());
  }
}
