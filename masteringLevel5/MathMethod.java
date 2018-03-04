// MathMethod.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 21:23
// app that shows the math's method

public class MathMethod
{
   public static void main(String[] args)
   {
      System.out.println("What is the value of x after each of the following statements is executed?\n");
      System.out.printf("x = Math.abs(7.5) is : %.2f%n", Math.abs(7.5));
      System.out.printf("x = Math.floor(7.5) is : %.2f%n", Math.floor(7.5));
      System.out.printf("x = Math.abs(0.0) is : %.2f%n", Math.abs(0.0));
      System.out.printf("x = Math.ceil(0.0) is : %.2f%n", Math.ceil(0.0));
      System.out.printf("x = Math.abs(-6.4) is : %.2f%n", Math.abs(-6.4));
      System.out.printf("x = Math.ceil(-6.4) is : %.2f%n", Math.ceil(-6.4));
      System.out.printf("x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) is : %.2f%n", Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));

   }
}