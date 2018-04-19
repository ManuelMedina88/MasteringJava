// StringStartEnd.java
// @uthor : Manuel Medina.
// Date : April 17th 2018 10:06 a.m.
// String methods startsWith and endsWith

public class StringStartEnd
{
   public static void main(String[] args)
   {
      String[] strings = {"started", "starting", "ended", "ending"};

      // test method startsWith
      for (String string : strings)
      {
         if (string.startsWith("st"))
            System.out.printf("\"%s\" start with \"st\"%n", string);
      }

      System.out.println();

      // test method startsWith starting from position 2 of string
      for (String string : strings)
      {
         if (string.startsWith("art", 2))
            System.out.printf(
               "\"%s\" starts with \"art\" at position 2%n", string);
      }

      System.out.println();

      // test method endWith
      for (String string : strings)
      {
         if (string.endsWith("ed"))
            System.out.printf("\"%s\" ends with \"ed\"%n", string);
      }
   }
} // end class StringStartEnd