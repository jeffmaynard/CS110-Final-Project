/**
Jeff Maynard
CS110
Player Class
   Represents a player in the card game of war.
*/

public class Player{
   public Deck deck;
   public String name;
   
   /**
      Default constructor. Creates a player with a deck.
      @param Deck deck A Deck object to be attatched to the particular Player.
      @param String name The name of the Player.
   */
   public Player(Deck deck, String name){
      this.deck = deck;
      this.name = name;
   }
   /**
      Returns the Deck associated with the Player object.
      @return Deck deck The deck associated with the Player.
   */
   public Deck getPlayerDeck(){
      return deck;
   }
   /**
      Returns the name of the Player.
      @return String name The name of the Player.
   */
   public String getPlayerName(){
      return name;
   }
   /**
      Sets the Deck of the Player object.
      @param Deck deck The desired deck of the Player.
   */
   public void setPlayerDeck(Deck deck){
      this.deck = deck;
   }
   /**
      Sets the name of the Player object.
      @param String name The desired name of the Player.
   */
   public void setPlayerName(String name){
      this.name = name;
   }
   /**
      Deals the first card from the Player deck.
      @return Card c The first card from the Player deck.
   */
   public Card deal(){
      Card c = new Card();
      if((getPlayerDeck().getDeck().isEmpty())==false){
         c = getPlayerDeck().getDeck().get(0);
         getPlayerDeck().getDeck().remove(0);
      }
      return c;
   }
   /**
      Adds a card to the end of the Player's deck.
      @param Card c A card to add to the Player's deck.
   */
   public void take(Card c){
      getPlayerDeck().getDeck().add(getPlayerDeck().getDeck().size(), c);
   }
}