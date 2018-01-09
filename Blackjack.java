import java.util.*;

public class Blackjack {
   public static void main(String[] args){
      int game = 0;      
      Scanner console = new Scanner(System.in);
      Player p1 = new Player(); //player 1 
      Player p2 = new Player(); // Player 2
      Deck card = new Deck();
      Results result = new Results();
      result.setWins();
      int x = 1;   
      int player1Score = 0;
      int player2Score = 0;     
      System.out.println("Welcome to Blackjack!");
      System.out.println("Please enter the name of player 1: ");
      p1.setName(console.next());
      System.out.println("Please enter the name of player 2: ");
      p2.setName(console.next());    
      while( game == 0){
      System.out.println("=========================");
      card.shuffle();
      card.setRandomSuit();
      card.setRandomCard();
      card.setCardValueAndName();
      result.setP1Score(card.getCardValue());
      p1.setStartingCard( card.toString());
      System.out.println(p1.getName() + " shows: " + card.toString() );
      card.setRandomSuit();
      card.setRandomCard();
      card.setCardValueAndName();
      p2.setStartingCard( card.toString());
      result.setP2Score(card.getCardValue());
      System.out.println(p2.getName() + " shows: " + card.toString());
      System.out.println(p1.getName() + ", it is your turn.");
      card.setRandomSuit();
      card.setRandomCard();
      card.setCardValueAndName();
      result.addP1Score(card.getCardValue());
      System.out.println(p1.getName() + ", you have[" + result.getP1Score() + "]");
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals("h")){ // hit
            card.setRandomSuit();
            card.setRandomCard();
            card.setCardValueAndName();
            System.out.println("You have drawn a " + card.toString());
            result.addP1Score(card.getCardValue());
            System.out.println("You have " + result.getP1Score() + " points");
            if(result.getP1Score() > 21){
             System.out.println("YOU BUST!");
             x +=1;
            }
         }
         if(turn.equals("s")){ // stand 
         System.out.println("You have " + result.getP1Score() + " points");
         x = 5;
         }   
      }
      x = 5;
     System.out.println(p2.getName() + ", it is your turn."); 
     System.out.println(p2.getName() + " shows: "+ p2.getStartingCard());
      card.setRandomSuit();
      card.setRandomCard();
      card.setCardValueAndName();
      result.addP2Score(card.getCardValue());
     System.out.println(p2.getName() + ", you have[" + result.getP2Score() + "]");
     x = 1;
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals("h")){ // hit
            card.setRandomSuit();
            card.setRandomCard();
            card.setCardValueAndName();
            System.out.println("You have drawn a " + card.toString());
            result.addP2Score(card.getCardValue());
            System.out.println("You have " + result.getP2Score() + " points");
            if(result.getP2Score() > 21){
             System.out.println("YOU BUST!");
             x = 5;
            }
         }
         if(turn.equals("s")){ // stand 
         System.out.println("You have " + result.getP2Score() + " points");
         x = 5;
         }   
      }
     x=1;
      //System.out.println("wins");
//       System.out.println(p1.getName() + " has " + "wins.");
//       System.out.println(p1.getName() + " has " + "wins.");
      result.gameResult(p1.getName(), p2.getName());
      System.out.println(result.getResult());
      
      System.out.println("WINS... " +p1.getName() + ": " + result.getP1Wins() + "   " + p2.getName() + ": " + result.getP2Wins());
       System.out.println("play again (y/n)?");
       String reset = console.next();
       
      if(reset.equals("y")){
      
      }
      if(reset.equals("n")){
         game = 1;
         System.out.println("Thanks for playing!");
      }
      
      }
      
   }
}