
package cardgame;

/**
 *
 * @author Brian
 */
import java.util.*;
public class CardGame {

    public static void main(String[] args) {
      GameDeck deck1 = new GameDeck(); //initializes a wardeck
        
      ArrayList<GameCard> player1Deck;
      player1Deck = deck1.playerCards(deck1);   //provides player 1 with half of the randomly shuffled deck
      
      ArrayList<GameCard> player2Deck;
      player2Deck = deck1.playerCards(deck1);  //provides the remaining half to the second player
      
      GamePlayer player1 = new GamePlayer("John");
      player1.takeDeck(player1Deck);                 //players given half of shuffled decks
      GamePlayer player2 = new GamePlayer("Jeff");
      player2.takeDeck(player2Deck);
      
      System.out.println("Initial Hands");
      player1.initialPrint();
      player2.initialPrint();
      
      
      
      int rndCt = 1;
      while (player1.returnHand().size() <=51 && player2.returnHand().size() <=51){
          System.out.println ("Round " + rndCt);
          player1.roundPrint();
          player2.roundPrint();
          
          int result = player1.returnPile().compare(player2.returnPile());
          if (result == 1){
          System.out.println(player1.returnName()+ " wins.");
          System.out.println(player1.returnName()+ " takes the pile");
          player1.takeWinCards(player2.returnPile());
                 }
          else {
             System.out.println(player2.returnName()+ " wins.");
             System.out.println(player2.returnName()+ " takes the pile");
             player2.takeWinCards(player1.returnPile());
          }          
          rndCt++;        
      }
      
      if (player1.returnHand().size() > 51){
          System.out.println(player1.returnName()+ " wins \nGame Over");
      }
      else if (player2.returnHand().size() > 51){
          System.out.println(player2.returnName()+" wins \nGame Over");
      } 
    }
    
}
