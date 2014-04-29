/**
Jeff Maynard
CS110
Game of War - CW
   Represents a card game of "war" expressed through a command window.
*/
public class WarCW extends War{
   public static void main(String[] args){
      //Greets user. Collects name.
      System.out.println("New Game!\n----------\n");
      System.out.print("Enter your name: ");
      String name = keyboard.next();
      startUp(name);
      //runs game while both players have cards remaining in their deck
      while(((player1.getPlayerDeck().getDeck().isEmpty())==false)&&((player2.getPlayerDeck().getDeck().isEmpty())==false)){
         //each player deals a card
         Card p1 = playCard(player1);
         if(p1.getRank() != 0){
            System.out.println(player1.getPlayerName() + " played a " + p1.toString());
         }
         else{
            break;
         }
         Card c1 = playCard(player2);
         if(c1.getRank() != 0){
            System.out.println(player2.getPlayerName() + " played a " + c1.toString());
         }
         else{
            break;
         }
         keyboard.nextLine();
         //cards are compared
         Card c = compare(p1, c1);
         if(c == p1){
            System.out.println(player1.getPlayerName() + " won that hand.\n----------");
            keyboard.nextLine();
         }
         else if(c == c1){
            System.out.println(player2.getPlayerName() + " won that hand.\n----------");
            keyboard.nextLine();
         }
         else{
            System.out.println("War!\n----------");
            keyboard.nextLine();
            Card p2 = player1.deal();
            Card c2 = player2.deal();
            Card p3 = player1.deal();
            Card c3 = player2.deal();
            System.out.println(player1.getPlayerName() + " played a " + p3.toString());
            System.out.println(player2.getPlayerName() + " played a " + c3.toString() + "\n");
            keyboard.nextLine();
            c = compare(p3, c3);
            if(c == p3){
               System.out.println(player1.getPlayerName() + " won that hand.\n----------");
               keyboard.nextLine();
            }
            else if(c == c3){
               System.out.println(player2.getPlayerName() + " won that hand.\n----------");
               keyboard.nextLine();
            }
            else{
               System.out.println("War!\n----------");
               keyboard.nextLine();
            }
         }
      }
      //outmessage for winner
      close();
   }
}