
package cardgame;

/**
 *
 * @author Brian
 */
import java.util.*;
public class GameDeck {
    
    private final ArrayList<GameCard> warCards;
    private ArrayList<GameCard> playerDeck;
    Iterator<GameCard> iter;
    
   public GameDeck(){
       warCards = new ArrayList<>();
       for (int x = 0; x <4; x++){ //sets suits
           for (int y = 0; y < 13; y++){ //sets ranks
               warCards.add(new GameCard(y,x)); //(ranks,suits)
           }
       }
   }
   
   public GameCard shuffle(){
       Random num = new Random();
       int i = num.nextInt(warCards.size());
       return warCards.remove(i);
   }
   
   public ArrayList<GameCard> playerCards(GameDeck distributor){
       playerDeck = new ArrayList<>();
       for (int i = 0; i <26; i++){
           playerDeck.add(distributor.shuffle());
       }
       return playerDeck;
   }
   
   public GameCard fullDeckCard(int num){
       return this.warCards.get(num);
   }
   
   public GameCard playerDeckCard(int num){
       return this.playerDeck.get(num);
   }
   
   public int deckSize(){
       return playerDeck.size();
   }

    
}
