public class Euler {

   public static long fact(int x) {
      long prod = 1;
      for (int i = 1; i < x; i++) {
         prod = prod * i;
      }
      return prod;
   }
   public static double euler(){
      double e = 0;
      for (int i = 1; i < 50; i++) {
         e = e+1 / (double) (fact(i));
      }
      return e;
   }

   public static void main(String[] args) {

      System.out.println("e = "+euler());
   }


}