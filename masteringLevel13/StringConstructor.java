// StringConstructors.java
// @uthor : Manuel Medina
// Date : 14 april 2018 12:39 p.m.
// String class constructors.

public class StringConstructor
{
   public static void main(String[] args)
   {
      char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
      String s = new String("Hello");

      // use String constructors
      String s1 = new String();
      String s2 = new String(s);
      String s3 = new String(charArray);
      String s4 = new String(charArray, 6, 3);

      System.out.printf(
         "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
   }
} // end class StringConstructors