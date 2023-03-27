package coursejava.classes.introduction;

public class Aula06 {
  public static void main(String[] args) {
    int[][] values = new int[4][6];
    String[][] fruits = new String[3][];
    String[] fruits1 = {"Banana", "Grape", "Apple"};
    String[] fruits2 = {"Orange", "Pineapple", "Lemon"};
    String[] fruits3 = {"Kiwi", "Açai", "Melon", "Abacate"};
    String[][] arrayTest = {{"Banana", "Grape", "Apple"},{"Orange", "Pineapple", "Lemon"},{"Kiwi", "Açai", "Melon", "Abacate"}};
    fruits[0] = new String[3];
    fruits[0] = fruits1;
    // fruits[0][0] = "Banana";
    // fruits[0][1] = "Grape";
    // fruits[0][2] = "Apple";

    fruits[1] = new String[3];
    fruits[1] = fruits2;
    // fruits[1][0] = "Orange";
    // fruits[1][1] = "Pineapple";
    // fruits[1][2] = "Lemon";

    fruits[2] = new String[4];
    fruits[2] = fruits3;
    // fruits[2][0] = "Kiwi";
    // fruits[2][1] = "Açai";
    // fruits[2][2] = "Melon";
    // fruits[2][3] = "Abacate";

   
    for(int i = 0; i < values.length; i++){
      for(int j  = 0; j < values[0].length; j++){
        values[i][j] = (i + j)*10;
        System.out.println("[ "+ i + " ]:[ "+ j + " ] ==> "+values[i][j]);
      }
    }
    for(int[] valuesBase: values){
      for(int i: valuesBase){
        System.out.println("\n"+i);
      }
    }
    // for(String[] baseArray: fruits){
    //   for(String value: baseArray){
    //     System.out.println(value);
    //   }
    // }
    for(String[] fruitsBase: arrayTest){
      for(String v: fruitsBase){
        System.out.println("v ==> "+ v);
      }
    }
  }
}
