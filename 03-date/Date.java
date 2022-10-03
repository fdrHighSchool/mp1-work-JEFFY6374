import java.util.Scanner;

public class Date
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is the Month: ");
        String month = s.nextLine();
        
        System.out.print("What is the Day: ");
        String day = s.nextLine();
        
        System.out.print("What day of the week is it: ");
        String weekday = s.nextLine();
        
        System.out.print("What is the Year: ");
        String year = s.nextLine();
        System.out.print("American Format: " + weekday + ", " + month + " " + day + ", " + year + "\n");
        System.out.print("European Format: " + weekday + " " + day + " " + month + " " + year + "\n");
        
    }
}