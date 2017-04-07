
package cardgame;

/**
 *
 * @author Brian
 */
public class GameCard {
    private String[] ranks ={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"} ;
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private int suit, rank;
    
    public GameCard(int rank, int suit){
        this.suit = suit;
        this.rank = rank;
    }
    
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    
    public int compare(GameCard other){
        //int rank1 = current.getRank();
        int rank2 = other.getRank();
        //int suit1 = current.getSuit();
        int suit2 = other.getSuit();
        
        if (this.rank> rank2)
            return 1;
        else if (this.rank < rank2)
            return -1;
        else if (this.rank == rank2){
            if (this.suit > suit2)
                return 1;
            else 
                return -1;
        }
        
        return 0;
    }
    
    public String printCard(){
        return ranks[rank] + " of " + suits[suit];
    }
         
    public String printTest(GameCard card){
        return card.ranks[rank] + card.suits[suit];
    }
}
