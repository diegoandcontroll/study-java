package coursejava.classes.introduction;

public class Aula05 {
  public static void main(String[] args) {
    // String[] names = new String[3];

    String[] fruits = {"Pineapple", "Orange", "Banana", "Grape"};
    for(int i = 0; i < fruits.length; i++){
      System.out.println(fruits[i]);
    }

    for(String f: fruits){
      System.out.println(f);
    }

    for (String fr : fruits) {
      System.out.println("\n"+fr);
    }
  }
}
