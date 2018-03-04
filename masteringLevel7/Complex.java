// Complex.java
// @uthor : Manuel Medina.
// Date : Dic 31th 2017 15:28
// app that performs the sum and substraction of the complex numbers.
public class Complex
{
   private double a;
   private double b;
   private double c;
   private double d;

   public Complex(double a, double b, double c, double d)
   {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public Complex()
   {
      a = 0;
      b = 0;
      c = 0;
      d = 0;
   }

   public void setA(double a)
   {
      this.a = a;
   }

   public void setB(double b)
   {
      this.b = b;
   }

   public void setC(double c)
   {
      this.c = c;
   }

   public void setD(double d)
   {
      this.d = d;
   }

   public double getA()
   {
      return a;
   }

   public double getB()
   {
      return b;
   }

   public double getC()
   {
      return c;
   }

   public double getD()
   {
      return d;
   }

   public void sum()
   {
      System.out.printf("The sum of %.0f %s %.0fi + %.0f %s %.0fi%nis equal to : %.0f %s %.0fi%n%n",
         getA(), (getB() > 0)? "+": "-", Math.abs(getB()), getC(), (getD() > 0)? "+": "-", Math.abs(getD()),
         Math.abs(getA() + getC()), (getB() + getD() > 0)? "+": "-", Math.abs(getB() + getD()));
   }

   public void subt()
   {
      System.out.printf("The Substraction of %.0f %s %.0fi - (%.0f %s %.0fi)%nis equal to : %.0f %s %.0fi%n%n",
         getA(), (getB() > 0)? "+": "-", Math.abs(getB()), getC(), (getD() > 0)? "+": "-", Math.abs(getD()),
         (getA() + getC() * -1), (getB() + getD() * -1 > 0)? "+": "-", Math.abs(getB() + getD() * -1));
   }
}