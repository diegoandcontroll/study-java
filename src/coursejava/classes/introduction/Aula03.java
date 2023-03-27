package coursejava.classes.introduction;

public class Aula03 {
  public static void main(String[] args) {
    int age = 17;
    int money = 800;
    String iPass = money >= 800 && age >= 18 ? "Pass" : "Not Pass";
    switch (age) {
      case 17:
        System.out.println("Menor");
        break;
      case 18:
        System.out.println("Maior");
        break;
      default:
        System.out.println(age);
        break;
    }
    if (money >= 800 && age >= 18) {
      System.out.println("PASS");
    } else if (money < 800 && age > 18) {
      System.out.println("Pass more money is small to night");
    } else {
      System.out.println("NOT PASS");
    }
    System.out.println(iPass);
  }
}
