// DemonstrationsMath.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 13:55am.
// Demonstration of Math class

public class DemonstrationsMath
{
   public static void main(String[] args)
   {
      System.out.println("Method\t\tDescription\t\t\t\t\tExample");

      System.out.printf("%s\t\t%s\t\t\t\tabs(23.7) is %.1f%n", "abs(x)", "absolute value of x", Math.abs(23.7));
      System.out.printf("%s\t\t%s\t\t\t\t\tabs(0.0) is %.1f%n", "      ", "           ", Math.abs(0.0));
      System.out.printf("%s\t\t%s\t\t\t\t\tabs(-23.7) is %.1f%n", "      ", "           ", Math.abs(23.7));

      System.out.println();

      System.out.printf("%s\t\t%s\t\tceil(9.2) is %.1f%n", "ceil(x)","round x to the smallest integer not", Math.ceil(9.2));
      System.out.printf("%s\t\t%s\t\t\t\t\tceil(-9.8) is %.1f%n", "    ", "less than x", Math.ceil(-9.8));
      System.out.println();

      System.out.printf("%s\t\t%s\t\tcos(0.0) is %.1f%n", "cos(x)", "trigonometric cosine of x(x in radians)", Math.cos(0.0));
      System.out.println();

      System.out.printf("%s\t\t%s\t\t\t\texp(1.0) is %.5f%n", "exp(x)", "exponential method ex", Math.exp(1.0));
      System.out.printf("%s\t\t%s\t\t\t\texp(2.0) is %.5f%n", "      ", "                     ", Math.exp(2.0));
      System.out.println();

      System.out.printf("%s\t%s\t\tfloor(9.2) is %.1f%n", "floor(x)", "rounds x to the largest integer not", Math.floor(9.2));
      System.out.printf("%s\t\t%s\t\t\t\t\tfloor(-9.8) is %.1f%n", "   ", "greater than x", Math.floor(-9.8));
      System.out.println();

      System.out.printf("%s\t\t%s\t\t\tlog(Math.E) is %.1f%n", "log(x)", "natural logarithm of x (base e)", Math.log(Math.E));
      System.out.printf("%s\t\t%s\t\t\tlog(Math.E * Math.E) is %.1f%n", "      ", "                               ", Math.log(Math.E * Math.E));
      System.out.println();

      System.out.printf("%s\t%s\t\t\t\tmax(2.3, 12.7) is %.1f%n", "max(x, y)", "larger value of x and y", Math.max(2.3, 12.7));
      System.out.printf("%s\t%s\t\t\t\tmax(-2.3, -12.7) is %.1f%n", "        ", "                       ", Math.max(-2.3, -12.7));
      System.out.println();

      System.out.printf("%s\t%s\t\t\tmin(2.3, 12.7) is %.1f%n", "min(x, y)", "smaller value of x and y", Math.min(2.3, 12.7));
      System.out.printf("%s\t%s\t\t\tmin(-2.3, -12.7) is %.1f%n", "         ", "                        ", Math.min(-2.3, -12.7));
      System.out.println();

      System.out.printf("%s\t%s\t\tpow(2.0, 7.0) is %.1f%n", "pow(x, y)", "x raised to the power y (i.e., x^y)", Math.pow(2.0, 7.0));
      System.out.printf("%s\t%s\t\tpow(9.0, 0.5) is %.1f%n", "         ", "                                   ", Math.pow(9.0, 0.5));
      System.out.println();

      System.out.printf("%s\t\t%s\t\tsin(0.0) is %.1f%n", "sin(x)", "trigonometric sine of x (x in radians)", Math.sin(0.0));
      System.out.println();

      System.out.printf("%s\t\t%s\t\t\t\tsqrt(900.0) is %.1f%n", "sqrt(x)", "square root of x", Math.sqrt(900.0));
      System.out.println();

      System.out.printf("%s\t\t%s\ttan(0.0) is %.1f%n", "tan(x)", "trigonometric tangent of x(x in radians)", Math.tan(0.0));
      System.out.println();
   }

   // public double hypotenuse(double side1, float side2)
   // public int smallest(int x, int y, int z)
   // public void instructions()
   // public float intToFloat(int number)

}