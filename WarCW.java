/**
Jeff Maynard
CS110
Card Game of War - CW
   Represents the card game "war" through the command window.
*/

public class WarCW{
   public static void main(String[] args){
      //creates a master deck
      Deck master = new Deck();
      //splits the deck between player1 and player2
      Player player1 = new Player(master.firstSplit());
      Player player2 = new Player(master.lastSplit());

      while(((player1.getPlayerDeck().getDeck().isEmpty())==false)&&((player2.getPlayerDeck().getDeck().isEmpty())==false)){
         //each player deals a card
         Card p1 = player1.deal();
         Card c1 = player2.deal();
         //comparison of dealt cards
			if(p1.getRank() >	c1.getRank()){
				player1.take(c1);
			}
			else if(p1.getRank()	< c1.getRank()){
				player2.take(p1);
			}
         //if war then one more card dealt face down, the next dealt card is compared
			else if(p1.getRank()	==	c1.getRank()){
				Card p2 = player1.deal();
				Card c2 = player2.deal();
            Card p3 = player1.deal();
            Card c3 = player2.deal();
            //comparison of dealt cards
            if(p3.getRank() >	c3.getRank()){
               player1.take(c1);
				   player1.take(c2);
               player1.take(c3);
			   }
			   else if(p3.getRank()	< c3.getRank()){
               player2.take(p1);
				   player2.take(p2);
               player2.take(p3);
            }
			}
      }
      //outmessage for winner
      if(player1.getPlayerDeck().getDeck().isEmpty()){
         System.out.println("Player 2 wins!");
         System.exit(0);
      }
      if(player2.getPlayerDeck().getDeck().isEmpty()){
         System.out.println("Player 1 wins!");
         System.exit(0);
      }
   }
}