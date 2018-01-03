// IntegerSet.java
// @uthor : Manuel Medina.
// Date : Jan 1st 2018 08:26 a.m.

public class IntegerSet
{
   public boolean[] integerSet = new boolean[101];

   public IntegerSet()
   {
      for(int i = 0; i < 101; i++)
      {
         integerSet[i] = false;
      }
   }

   public static boolean[] union(boolean[] set1, boolean[] set2)
   {
      boolean[] set = new boolean[101];

      for(int i = 0; i < 101; i++)
      {
         set[i] = false;
      }



      for(int i = 0; i < 101; i++)
      {
         if (set1[i] == true)
            set[i] = true;

         if (set2[i] == true)
            set[i] = true;
      }

      return set;
   }

   public static boolean[] intersection(boolean[] set1, boolean[] set2)
   {
      boolean[] set = new boolean[101];

      for(int i = 0; i < 101; i++)
      {
         set[i] = false;
      }

      for(int i = 0; i < 101; i++)
      {
            if (set1[i] == true && set2[i] == true)
            {
               set[i] = true;
            }
      }

      return set;
   }

   public void insertElement(int a)
   {
      integerSet[a] = true;
   }

   public void deleteElement(int a)
   {
      integerSet[a] = false;
   }

   public String toString()
   {
      String a = "---";

      boolean n = false;
      for(int i = 0; i < integerSet.length;i++)
         if(integerSet[i] == true)
         {
            a = "";
            n = true;
            break;
         }

      if(n != false) {
         for (int i = 0; i < 101; i++) {
            if (integerSet[i] == true) {
               a += String.format("%d ", i);
            }
         }
      }

      return a;

   }

}