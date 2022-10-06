
/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket {
  public static void main(String[] args){
    roofcone();
    base();
    base2();
    base3();
    engine();
  }

  public static void roofcone() {
    System.out.println("    /\\"); 
    System.out.println("   /  \\");
    System.out.println("  /    \\ ");
  }

  public static void base() {
    System.out.print(" +------+\n");
    System.out.print(" |      |\n");
    System.out.print(" |      |\n"); 
  }
  public static void base2() {
    System.out.print(" +------+\n");
    System.out.print(" |United|\n");
    System.out.print(" |States|\n"); 
  }
  public static void base3() {
      base();
      System.out.print(" +------+\n");
    }
    public static void engine() {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
    }
}