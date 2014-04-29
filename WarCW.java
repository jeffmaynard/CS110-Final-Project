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
      

   }
}