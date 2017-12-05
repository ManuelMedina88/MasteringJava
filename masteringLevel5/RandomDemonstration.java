// RandomDemonstration.java
// @uthor : Manuel Medina.
// Date : nov 30th 2017 10:28
// App that demonstrates various capabilities of SecureRandom
import java.security.SecureRandom;

public class RandomDemonstration
{
   public static void main(String[] args)
   {
      SecureRandom random = new SecureRandom();

      System.out.printf("a) 1 <= %d <= 2.%n", 1 + random.nextInt(2));
      System.out.printf("b) 1 <= %d <= 100.%n", 1 + random.nextInt(100));
      System.out.printf("c) 0 <= %d <= 9.%n", random.nextInt(10));
      System.out.printf("d) 1000 <= %d <= 1112.%n", 1000 + random.nextInt(113));
      System.out.printf("e) -1 <= %d <= 1.%n", -1 + random.nextInt(3));
      System.out.printf("f) -3 <= %d <= 11.%n", -3 + random.nextInt(15));
      System.out.println();

      System.out.printf("a) %d.%n", 2 + 2 * random.nextInt(5));
      System.out.printf("b) %d.%n", 3 + 2 * random.nextInt(5));
      System.out.printf("c) %d.%n", 6 + 4 * random.nextInt(5));






   }
}