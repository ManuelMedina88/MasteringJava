// DeckOfCards.java
// @uthor : Manuel Medina.
// Date : nov 7th 2017 15:03
// DeckOfCards class represents a desk of playing cards.
import java.security.SecureRandom;

public class DeckOfCards
{
   private Card[] deck; // array of Card objects
   private int currentCard; // index of next Card to be dealt (0-51)
   private static final int NUMERO_OF_CARDS = 52; // constant # of Cards random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // constructor fills deck of Cards
   public DeckOfCards()
   {
      String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades" };

      deck = new Card[NUMERO_OF_CARDS]; // create array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects
      for (int count = 0; count < deck.length; count++)
         deck[count] =
            new Card(faces[count % 13], suits[count / 13]);
   }

   // shuffle desk of Card with one-pass algorithm
   public void shuffle()
   {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0;

      // for each Card, pick another random Card (0-5) and swap them
      for (int first = 0; first < deck.length; first++)
      {
         // select a random number between 0 and 51
         int second = randomNumbers.nextInt(NUMERO_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];
         deck[first] = deck[second];
         deck[second] = temp;
      }
   }

   // deal on Card
   public Card dealCard()
   {
      // determine whether Card remain to be dealt
      if (currentCard < deck.length)
         return deck[currentCard++]; // return current Card in array
      else
         return null; // return null to indicate that all Card were dealt
   }
} // end class DeckCards