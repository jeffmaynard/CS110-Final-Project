import java.util.Scanner;
/**
Jeff Maynard
CS110
Game of War - Runner
   Represents the main functions of the card game "war".
*/

public class War{
   public static Deck master;
   public static Player player1;
   public static Player player2;
   public static Scanner keyboard = new Scanner(System.in);
   
   
   /**
      Initializes the deck and players.
      @param String name The desired user Player name.
   */
   public static void startUp(String name){
      master = new Deck();
      player1 = new Player(master.firstSplit(), name);
      player2 = new Player(master.lastSplit(), "Computer");
   }
   /**
      Plays a card based on a player. 
      @param Player player The desired player.
      @return Card c The top card from the Player's deck.
   */
   public static Card playCard(Player player){
      Card c = player.deal();
      return c;
   }
   /**
      Compares two cards. Returns the higher of the two. If the cards are the same a "war" occurs.
      @param Card p1 The first card to compare.
      @param Card c1 The second card to compare.
      @return Card c The higher valued card.
   */
   public static Card compare(Card p1, Card c1){
      Card c = new Card();
      if(p1.getRank() >	c1.getRank()){
		   player1.take(c1);
         c = p1;
      }
      else if(p1.getRank() < c1.getRank()){
		   player2.take(p1);
         c = c1;
      }
      else if(p1.getRank() == c1.getRank()){
         c = null;
      }
      return c;
   }
   /**
      Prints various messages based on the winner of the game.
   */
   public static void close(){
      if(player1.getPlayerDeck().getDeck().isEmpty()){
         System.out.println(player1.getPlayerName() + "'s deck is empty!");
         System.out.println(player2.getPlayerName() + " wins!");
         System.exit(0);
      }
      if(player2.getPlayerDeck().getDeck().isEmpty()){
         System.out.println(player2.getPlayerName() + "'s deck is empty!");
         System.out.println(player1.getPlayerName() + " wins!");
         System.exit(0);
      }
   }
}