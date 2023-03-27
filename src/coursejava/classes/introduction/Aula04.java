package coursejava.classes.introduction;

public class Aula04 {
  public static void main(String[] args) {
    System.out.println("hellow");
    int i = 0;
    while(i < 10){
      i++;
      System.out.println("[ "+i+" ]"+" * "+"[ 5 ]"+" = "+(i * 5));
    }
    System.out.println("\n");
    for(int  n = 1; n < 10; n++){
      System.out.println("[ "+n+" ]"+" * "+"[ 2 ]"+" = "+(n * 2));
    }
    for(int ii = 0; i < 50; i++){
      if(ii > 25){
        break;
      }
      System.out.println(i);
    }
  }
}
