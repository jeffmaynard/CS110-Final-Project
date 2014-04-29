import java.util.ArrayList;
import java.util.Collections;
/**
Jeff Maynard
CS110
Deck Class
   Represents a deck of playing cards.
*/

public class Deck{
   public static final int DECK_SPLIT = 26;
   public ArrayList<Card> deck;

   /**
      Default constructor. Creates and shuffles a standard 52 card deck.
   */
   public Deck(){
      deck = new ArrayList<Card>();
      for(int i = 1; i < 5; i++){
         for(int j = 2; j < 15; j++){
            deck.add(new Card(i, j));
         }
      }
      Collections.shuffle(deck);
   }
   /**
      Returns a reference to the ArrayList which acts as the "deck" of the Deck class.
      @return ArrayList<Card> deck The actual "deck" of cards.
   */
   public ArrayList<Card> getDeck(){
      return this.deck;
   }
   /**
      Splits the deck in half and returns the first half as a Deck object.
      @return Deck splitDeck The first half of the deck of cards.
   */
   public Deck firstSplit(){
      Deck splitDeck = new Deck();
      splitDeck.getDeck().clear();
      for(int i = 0; i < DECK_SPLIT; i++){
         splitDeck.getDeck().add(deck.get(i));
      }
      return splitDeck;
   }
   /**
      Splits the deck in half and returns the last half as a Deck object.
      @return Deck splitDeck The last half of the deck of cards.
   */
   public Deck lastSplit(){
      Deck splitDeck = new Deck();
      splitDeck.getDeck().clear();
      for(int i = DECK_SPLIT - 1; i < deck.size(); i++){
         splitDeck.getDeck().add(deck.get(i));
      }
      return splitDeck;
   }
   
}