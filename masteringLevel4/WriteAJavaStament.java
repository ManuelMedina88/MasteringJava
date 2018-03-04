// WriteAJavaStatement.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 18:43pm
// Write a Java statement or a set of Java statements to accomplish each of the following task;

public class WriteAJavaStament
{
   public static void main(String[] args)
   {
      int sum = 0;
      for(int cont = 1; cont <= 99; cont += 2)
      {

         //System.out.printf("%d + %d = %d%n", sum, cont, sum + cont);
         sum += cont;
      }
      System.out.println(sum);
      System.out.println();

      System.out.println(Math.pow(2.5, 3));
      System.out.println();

      int cont1 = 1;
      while(cont1 <= 20)
      {
         System.out.print(cont1);
         System.out.print("\t");

         if(cont1 % 5 == 0)
            System.out.println();

         cont1++;
      }

      System.out.println();


      for(int cont = 1; cont <= 20; cont++)
      {
         System.out.print(cont);
         System.out.print("\t");

         if(cont % 5 == 0)
            System.out.println();
      }
   }
}