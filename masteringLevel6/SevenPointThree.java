//SevenPointThree.java
//@uthor : Manuel Medina.
//Date : dic 11th 2017 12:18pm.
// only a demonstration

public class SevenPointThree{

   private final static int ARRAY_SIZE = 10;
   private final static int ARRAY_SIZE2 = 3;

   public static void main(String[] args)
   {
      double[] array = new double[ARRAY_SIZE];

      System.out.println(array[4]);

      array[9] = 1.667;

      array[6] = 3.333;

      double sum = 0.0;
      for(int x = 0; x < array.length; x++)
         sum += array[x];

      System.out.println(sum);

      int[][] table = new int[ARRAY_SIZE2][ARRAY_SIZE2];

      System.out.println(table.length * table.length);

      for(int x = 0; x < table.length; x++)
         for(int y = 0; y < table[x].length; y++)
            table[x][y] = x + y;


      for(int[] array1 : table)
         for(int x : array1)
            System.out.printf("%d ", x);
   }
}