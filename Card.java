/**
Jeff Maynard
CS110
Card Class
   Class to represent a single playing card from a standard 52 card deck.
   Each card is given a rank and suit which cannot be modified after creation.
   Two cards are equal if they contain the same rank (suit is ignored).
*/

public class Card{
   //suit fields
   final static public int SPADES = 1;
   final static public int CLUBS = 2;
   final static public int HEARTS = 3;
   final static public int DIAMONDS = 4;
   //card rank fields
   final static public int ACE = 14;
   final static public int JACK = 11;
   final static public int QUEEN = 12;
   final static public int KING = 13;

   private int suit;
   private int rank;
   
   /**
      Constructor for creating a blank card for a placeholder.
   */
   public Card(){
   }
   /**
      Creates a Card object with a suit and rank.
      @param suit The suit of the Card object.
      @param rank The rank of the Card object.
   */
   public Card(int suit, int rank){
      this.suit = suit;
      this.rank = rank;
   }
   /**
      The getSuit function returns the suit of the Card object.
      @return suit The suit of the Card object.
   */
   public int getSuit(){
      return suit;
   }
   /**
      The getRank function returns the rank of the Card object.
      @return rank The rank of the Card object.
   */
   public int getRank(){
      return rank;
   }
   /**
      The toString function returns the suit and rank of the
      Card object as a string.
      @return cardString The suit and rank of the card object.
   */
   public String toString(){
      String suitString = "";
         if(suit == SPADES){
            suitString = "Spades";
         }
         else if(suit == CLUBS){
            suitString = "Clubs";
         }
         else if(suit == HEARTS){
            suitString = "Hearts";
         }
         else if(suit == DIAMONDS){
            suitString = "Diamonds";
         }
      String cardString = (rank + " of " + suitString);
      return cardString;
   }
   /**
      The equals function returns true if the Card obejcts are
      of equal rank. Returns false if the Card objects are not
      of equal rank.
      @param otherCard A Card object to be compared to the original
      Card object.
      @return isEqual Boolean representing the equality of the
      Card objects.
   */
   public boolean equals(Card otherCard){
      boolean isEqual = false;
      if(this.getRank() == otherCard.getRank()){
         isEqual = true;
      }
      else if(this.getRank() != otherCard.getRank()){
         isEqual = false;
      }
      return isEqual;
   }
}