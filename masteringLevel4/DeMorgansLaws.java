// TheMorgansLaws.java
// @uthor : Manuel Medina.
// Date : nov 27th 2017 17:21
// morgan's law's demonstration

public class TheMorgansLaws
{
   public static void main(String[] args)
   {
      int x = 6;
      int y = 6;
      System.out.printf("a) !(x < 5) && !(y >= 7) == %b ;  !((x < 5) || (y >= 7)) == %b%n", !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)));
      int a = 11;
      int b = 11;
      int g = 4;
      System.out.printf("!(a == b) || !(g != 5) == %b ; !((a == b) && (g != 5)) == %b%n", !(a == b) || !(g != 5), !((a == b) && (g != 5)));
      System.out.printf("!((x <= 8) && (y > 4)) == %b ; !(x <= 8) || !(y > 4) == %b%n", !((x <= 8) && (y > 4)), !(x <= 8) || !(y > 4));
      int i = 3;
      int j = 7;
      System.out.printf("!((i > 4) || (j <= 6)) == %b ; !(i > 4) && !(j <= 6) == %b%n", !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
   }
}