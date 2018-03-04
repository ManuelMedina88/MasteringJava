// TheTwelveDaysOfChristmasSong.java
// @uthor : Manuel Medina.
// Date : nov 28th 2017 19:57
// This app shows an prints "The Twelve Days of Christmas" song

public class TheTwelveDaysOfChristmasSong
{
   public static void main(String[] args)
   {
      String[] verses = {"and a Partridge in a Pear Tree.", "Two Turtle Doves, ", "Three French Hens, ", "four Calling Birds, ",
         "five Gold Rings, ", "six Geese a-Laying, ", "Seven Swans a-Swimming, ", "Eight Maids a-Milking, ",
         "Nine Ladies Dancing, ", "Ten Lords a-Leaping, ", "Eleven Pipers Piping, ", "Twelve Drummers Drumming, "};

      for(int i = 0; i < 12; i++)
      {
         System.out.print("On the ");
         switch(i)
         {
            case 0:
               System.out.print("first ");
               break;
            case 1:
               System.out.print("Second ");
               break;
            case 2:
               System.out.print("Third ");
               break;
            case 3:
               System.out.print("Fourth ");
               break;
            case 4:
               System.out.print("Fifth ");
               break;
            case 5:
               System.out.print("Sixth ");
               break;
            case 6:
               System.out.print("Seventh ");
               break;
            case 7:
               System.out.print("Eighth ");
               break;
            case 8:
               System.out.print("Nineth ");
               break;
            case 9:
               System.out.print("Tenth ");
               break;
            case 10:
               System.out.print("Eleventh ");
               break;
            case 11:
               System.out.print("Twelfth ");
         }

         System.out.print("day of Christmas my true love sent to me\n");

         switch(i)
         {

            case 0:
               System.out.print("a Partridge in a Pear Tree.");
               break;
            case 1:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 2:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 3:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 4:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 5:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 6:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 7:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 8:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 9:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 10:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
            case 11:
               for(int j = i; j >= 0; j--)
                  System.out.println(verses[j]);
               break;
         }

         System.out.println("\n");
      }
   }
}