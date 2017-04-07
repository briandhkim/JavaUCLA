
package cardgame;

/**
 *
 * @author Brian
 */
import java.util.*;
public class GamePlayer {
    
private final String name;
private ArrayList<GameCard> hand;
private GameCard pile;

public GamePlayer(String name){
    this.name = name;  
}

public String returnName(){
    return this.name;
}

public ArrayList<GameCard> returnHand(){
    return this.hand;
}

public GameCard returnPile(){
    return this.pile;
}

public void takeDeck(ArrayList<GameCard> hand){
    this.hand = hand;
}

public GameCard roundPile(){             //bring out first card on deck
    this.pile = this.hand.get(0);
    this.hand.remove(0);
    return pile;
}

public void takeWinCards(GameCard other){
    this.hand.add(this.pile); 
    this.hand.add(other);
    // this.hand.remove(0);  //to delete the round pile 
}

public void initialPrint(){
    int size = hand.size()-4;       //size = 26, iterator 0-25
    //System.out.println("Initial Hands");
    System.out.print(this.name+"'s Hand: "+this.hand.get(0).printCard()+", "+this.hand.get(1).printCard()+ ", (");
    System.out.print(size);
    System.out.println(" more), "+ this.hand.get(hand.size()-2).printCard() + ", " +this.hand.get(hand.size()-1).printCard());
}


public void roundPrint(){   //pile printing and comparison will be done in separate command lines
    int size = this.hand.size()-4;   
    this.pile = this.roundPile();
    
    if (!this.hand.isEmpty()){
    System.out.print(this.name+"'s Pile: " + this.pile.printCard() + " | ");
    
        if (this.hand.size() >4){
            System.out.print(this.name+"'s Hand: "+this.hand.get(0).printCard()+", "+this.hand.get(1).printCard()+", (");
            System.out.print(this.hand.size()-4);
            System.out.println(" more), "+this.hand.get(hand.size()-2).printCard()+", "+this.hand.get(hand.size()-1).printCard());
        }
        else if (this.hand.size() >= 1){
            System.out.print(this.name+"'s Hand: ");
            for (int i = 0; i < hand.size()-1; i++){
                System.out.print(this.hand.get(i).printCard()+ ", ");
            }
            System.out.println(this.hand.get(hand.size()-1).printCard());
        }
    }
    else
        System.out.println(this.name+"'s Pile: "+ this.pile.printCard());
}


    
}
