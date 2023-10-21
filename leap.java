import java.util.Scanner;

public class leap {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE YEAR");
      int var2 = sc.nextInt();
      if ((var2 % 4 != 0 || var2 % 100 == 0) && var2 % 400 != 0) {
         System.out.println("IT IS NOT A LEAP YEAR");
      } else {
         System.out.println("IT IS A LEAP YEAR");
      }
      sc.close();

   }
}
