import java.util.* ;
public class Number {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Im thinking of a number from 1-100");
    int random = (int)(Math.random() * 100);
    if (true){
      int guess = in.nextInt();
      if (guess==random){
        System.out.println("You guessed correctly!");
      } else { 
        System.out.println("The number was " + random); 
        System.out.println("You were off by " + (random-guess)); 
      }
    }
  }
}