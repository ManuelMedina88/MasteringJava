// CalculatingTheValueOfPI.java
// @uthor : Manuel Medina.
// Date : nov 26th 2017 14:54
// Calculate the value of PI from the infinite series

public class CalculatingTheValueOfPI
{
   public static void main(String[] args)
   {
      long[] b = {4,1,4,3};
      long[] c = new long[2];
      long[] d = new long[2];


      System.out.println("Cycle\tResult");
      for(int i = 1; i <= 200000; i++) {

         if(i == 1) {
            c = fraction(b, 1);
            b[0] = c[0];
            b[1] = c[1];
            b[3] = b[3] + 2;

            d = fraction(b, 2);
            if(((double) d[0] / (double) d[1]) > 3 && ((double) d[0] / (double) d[1]) < 3.5)
               System.out.printf("%d\t%f%n", i , (double) d[0] / (double) d[1]);
            //System.out.printf("%d/%d%n", c[0], c[1]);
            //System.out.printf("%d/%d%n", d[0], d[1]);
            b[0] = d[0];
            b[1] = d[1];
            b[3] = b[3] + 2;
         }

         if(i > 1)
         {
            c = fraction(b, 1);
            b[0] = c[0];
            b[1] = c[1];
            b[3] = b[3] + 2;

            d = fraction(b, 2);
            if(((double) d[0] / (double) d[1]) > 3 && ((double) d[0] / (double) d[1]) < 3.5)
               System.out.printf("%d\t%f%n", i , (double) d[0] / (double) d[1]);
            //System.out.printf("%d/%d%n", c[0], c[1]);
            //System.out.printf("%d/%d%n", d[0], d[1]);
            b[0] = d[0];
            b[1] = d[1];
            b[3] = b[3] + 2;
         }
      }

   }

   public static long[] fraction(long[] a, int b)
   {
      long[] y = new long[2];

      if(b == 1) {

         y[0] = (a[0] * a[3]) - (a[1] * a[2]);
         y[1] = (a[1] * a[3]);

      }

      if (b == 2)
      {
         y[0] = (a[0] * a[3]) + (a[1] * a[2]);
         y[1] = (a[1] * a[3]);
      }

      return y;
   }
}