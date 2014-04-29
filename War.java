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
      Greets the user and initializes the two Players in the game.
   */
   public static void startUp(){
      System.out.println("New Game!\n----------\n");
      System.out.print("Enter your name: ");
      String name = keyboard.next();
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
      System.out.println(player.getPlayerName() + " played a " + c.toString());
      keyboard.nextLine();
      return c;
   }
   /**
      Compares two cards. If the cards are the same a "war" occurs.
      @param Card p1 The first card to compare.
      @param Card c1 The second card to compare.
   */
   public static void compare(Card p1, Card c1){
      if(p1.getRank() >	c1.getRank()){
         System.out.println(player1.getPlayerName() + " won that hand.\n----------");
		   player1.take(c1);
         keyboard.nextLine();
      }
      else if(p1.getRank() < c1.getRank()){
         System.out.println(player1.getPlayerName() + " won that hand.\n----------");
		   player2.take(p1);
         keyboard.nextLine();
      }
      else if(p1.getRank()	==	c1.getRank()){
         System.out.println("War!\n----------");
         keyboard.nextLine();
		   Card p2 = player1.deal();
			Card c2 = player2.deal();
         Card p3 = player1.deal();
         Card c3 = player2.deal();
         System.out.println(player1.getPlayerName() + " played a " + p3.toString());
         System.out.println(player2.getPlayerName() + " played a " + c3.toString() + "\n");
         keyboard.nextLine();
         if(p3.getRank() >	c3.getRank()){
            System.out.println(player1.getPlayerName() + " won that hand.\n----------");
		      player1.take(c3);
            keyboard.nextLine();
         }
         else if(p3.getRank() < c3.getRank()){
            System.out.println(player1.getPlayerName() + " won that hand.\n----------");
		      player2.take(p3);
            keyboard.nextLine();
         }
      }
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