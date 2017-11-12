// CheckboardPatternOfAsterisks.java
// @uthor : Manuel Medina.
// Date : nov 10th 2017.
// app that displays the checkerboard pattern that follows.

public class CheckboardPatternOfAsterisks
{
   public static void main(String[] args)
   {
      int cont = 1;
      while(cont <= 8)
      {
         if(cont % 2 == 0)
         {
            System.out.print(" ");
         }
         int cont1 = 1;
         while(cont1 < 8) {
            System.out.print("*");
            System.out.print(" ");
            cont1++;
         }
         System.out.println();
         cont++;
      }
   }
}