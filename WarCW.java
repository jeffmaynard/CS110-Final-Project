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

      while((!player1.getPlayerDeck().getDeck().isEmpty())||(!player2.getPlayerDeck().getDeck().isEmpty())){
         //each player deals a card
         Card p1 = player1.deal();
         Card c1 = player2.deal();
         //comparison of delt	cards
			if(p1.getRank() >	c1.getRank()){
				player1.take(c1);
			}
			else if(p1.getRank()	< c1.getRank()){
				player2.take(p1);
			}
			else if(p1.getRank()	==	c1.getRank()){
				Card p2 = player1.deal();
				Card c2 = player2.deal();
			}
      }
      if(player1.getPlayerDeck().getDeck().isEmpty()){
         System.out.println("Player 2 wins!");
      }
      if(player2.getPlayerDeck().getDeck().isEmpty()){
         System.out.println("Player 1 wins!");
      }

   }
}