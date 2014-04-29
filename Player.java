/**
Jeff Maynard
CS110
Player Class
   Represents a player in the card game of war.
*/

public class Player{
   public Deck deck;
   
   /**
      Default constructor. Creates a player with a deck.
      @param Deck deck A Deck object to be attatched to the particular Player.
   */
   public Player(Deck deck){
      this.deck = deck;
   }
   /**
      Returns the Deck of the Player object.
      @return Deck deck The deck of the Player.
   */
   public Deck getPlayerDeck(){
      return deck;
   }
   /**
      Sets the Deck of the Player object.
      @param Deck deck The desired deck of the Player.
   */
   public void setPlayerDeck(Deck deck){
      this.deck = deck;
   }
   /**
   */
   public Card deal(){
      Card c = getPlayerDeck().getDeck().get(0);
      getPlayerDeck().getDeck().remove(0);
      return c;
   }
   /**
   */
   public void take(Card c){
      getPlayerDeck().getDeck().add(getPlayerDeck().getDeck().size(), c);
   }
}