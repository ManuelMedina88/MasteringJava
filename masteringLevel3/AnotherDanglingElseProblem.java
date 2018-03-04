// AnotherDanglingElseProblem.java
// @uthor : Manuel Medina.
// Date : nov 9th 2017.
// testing the dangling else

public class AnotherDanglingElseProblem
{
   public static void main(String[] args)
   {
      int x = 5;
      int y = 8;

      System.out.printf("a) Assuming that x = %d and y = %d, the following output is produced:%n%n", x, y);
      if  (y == 8)
         if (x == 5)
            System.out.println("@@@@@");
      else
         System.out.println("#####");
      System.out.println("$$$$$");
      System.out.println("&&&&&");


      System.out.printf("Assuming that x = %d and y = %d, the following output is produced:%n%n", x, 8);
      if(y == 8) {
         if (x == 5)
            System.out.println("@@@@@");
      }
      else
      {
         System.out.println("#####");
         System.out.println("$$$$$");
         System.out.println("&&&&&");
      }

      System.out.printf("Assuming that x = %d and y = %d, the following output is produced:%n%n", x , y);

      if(y == 8)
         if (x == 5)
            System.out.println("@@@@@");
         else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
         }
         x = 5;
         y = 7;
         System.out.printf("d) Assuming that x = %d and y = 7, the following output is produced:%n%n", x , y);

         if (y == 8) {
            if (x == 5)
               System.out.println("@@@@@");
         }else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
         }
   }
}