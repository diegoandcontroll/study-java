package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Player;
import coursejava.classes.javacore.classintroduction.domain.Team;

public class TestPlayer {
  public static void main(String[] args) {
    Player p1 = new Player("Diego");
    Team t1 = new Team("Corinthians", p1);
    t1.showPlayersOnTeam();
    // Player p2 = new Player("Diego2");
    // Player p3 = new Player("Diego3");

    // Player[] allPlayers = {p1,p2,p3};

    // for(Player players: allPlayers){
    //   players.showPlayer();
    // }
  }
}
