import java.util.Scanner;
/**
Jeff Maynard
CS110
Card Game of War - CW
   Represents the card game "war" through the command window.
*/

public class WarCW{
   public static void main(String[] args){
      //various prints and data collection to/from user
      Scanner keyboard = new Scanner(System.in);
      System.out.println("New Game!\n----------\n");
      System.out.print("Enter your name: ");
      String name = keyboard.next();
      //creates a master deck
      Deck master = new Deck();
      //splits the deck between player1 and player2
      Player player1 = new Player(master.firstSplit(), name);
      Player player2 = new Player(master.lastSplit(), "Computer");
      //runs game while both players have cards remaining in their deck
      while(((player1.getPlayerDeck().getDeck().isEmpty())==false)&&((player2.getPlayerDeck().getDeck().isEmpty())==false)){
         //each player deals a card
         Card p1 = player1.deal();
         Card c1 = player2.deal();
         System.out.println("\n" + player1.getPlayerName() + " played a " + p1.toString());
         System.out.println(player2.getPlayerName() + " played a " + c1.toString() + "\n");
         keyboard.nextLine();
         //comparison of dealt cards
			if(p1.getRank() >	c1.getRank()){
            System.out.println(player1.getPlayerName() + " won that hand.\n----------");
				player1.take(c1);
            //System.out.println("(Press enter to continue)");
            keyboard.nextLine();
			}
			else if(p1.getRank()	< c1.getRank()){
            System.out.println(player2.getPlayerName() + " won that hand.\n----------");
				player2.take(p1);
            //System.out.println("(Press enter to continue)");
            keyboard.nextLine();
			}
         //if war then one more card dealt face down, the next dealt card is compared
			else if(p1.getRank()	==	c1.getRank()){
            System.out.println("War!\n----------");
            System.out.println("(Press enter to continue)");
            keyboard.nextLine();
				Card p2 = player1.deal();
				Card c2 = player2.deal();
            Card p3 = player1.deal();
            Card c3 = player2.deal();
            System.out.println(player1.getPlayerName() + " played a " + p3.toString());
            System.out.println(player2.getPlayerName() + " played a " + c3.toString() + "\n");
            keyboard.nextLine();
            //comparison of dealt cards
            if(p3.getRank() >	c3.getRank()){
               System.out.println(player1.getPlayerName() + " won that hand.\n----------");
               player1.take(c1);
				   player1.take(c2);
               player1.take(c3);
               //System.out.println("(Press enter to continue)");
               keyboard.nextLine();
			   }
			   else if(p3.getRank()	< c3.getRank()){
               System.out.println(player2.getPlayerName() + " won that hand.\n----------");
               player2.take(p1);
				   player2.take(p2);
               player2.take(p3);
               //System.out.println("(Press enter to continue)");
               keyboard.nextLine();
            }
			}
      }
      //outmessage for winner
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