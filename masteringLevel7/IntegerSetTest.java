// IntegerSet.java
// @uthor Manuel Medina.
// Date : Jan 1st 2018 09:21 a.m.

public class IntegerSetTest
{
   public static void main(String[] args)
   {
      IntegerSet set1 = new IntegerSet();
      IntegerSet set2 = new IntegerSet();

      int[] set3 = {12, 52, 23, 56, 86, 28};
      int[] set4 = {20, 35, 23, 56};

      for(int i = 0; i < set3.length; i++)
      {
         set1.insertElement(set3[i]);
      }

      for(int i = 0; i < set4.length; i++)
      {
         set2.insertElement(set4[i]);
      }

      boolean[] a = IntegerSet.union(set1.integerSet, set2.integerSet);
      boolean[] b = IntegerSet.intersection(set1.integerSet, set2.integerSet);

      System.out.println("First set :");
      displaySet(set1.integerSet);
      //System.out.println(set1);
      System.out.println("Second set :");
      System.out.println(set2);
      //displaySet(set2.integerSet);
      System.out.println("The union of both set:");
      displaySet(a);
      System.out.println("The intersection of both set");
      displaySet(b);
   }

   public static void displaySet(boolean[] c)
   {
      boolean n = false;

      for(int i = 0; i < c.length; i++)
      {
         if(c[i] == true)
         {
            n = true;
            break;
         }
      }

      if(n != false) {
         for (int i = 0; i < c.length; i++) {
            if (c[i] == true)
               System.out.printf("%d ", i);
         }

         System.out.println("\n");
      }else
         System.out.println("---");
   }
}