package coursejava.classes.javacore.classintroduction.runner;

import coursejava.classes.javacore.classintroduction.domain.Client;
import coursejava.classes.javacore.classintroduction.domain.TypeClient;

public class TestClient {
  public static void main(String[] args) {
    Client c1 = new Client("Diego", TypeClient.CLIENT_PJ);

    System.out.println(c1.getName());
    System.out.println(c1.getType());
  }
}
