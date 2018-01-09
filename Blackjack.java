import java.util.*;

public class Blackjack {
   public static void main(String[] args){
      int game = 0; 
      while( game == 0){
      Scanner console = new Scanner(System.in);
      Player p1 = new Player(); //player 1 
      Player p2 = new Player(); // Player 2
      Deck card = new Deck();
      int x = 1;
      card.shuffle();
      int player1Score = 0;
      int player2Score = 0;
      
      System.out.println("Welcome to Blackjack!");
      System.out.println("Please enter the name of player 1: ");
      p1.setName(console.next());
      System.out.println("Please enter the name of player 2: ");
      p2.setName(console.next());
      System.out.println("=========================");
      card.setRandomSuit();
      card.setRandomCard();
      card.setCardValueAndName();
      System.out.println(p1.getName() + " shows: " + card.toString() );
      System.out.println(p2.getName() + " shows: ");
      System.out.println(p1.getName() + ", it is your turn.");
      System.out.println(p1.getName() + ", you have[" + "]");
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals("h")){ // hit
            card.setRandomSuit();
            card.setRandomCard();
            card.setCardValueAndName();
            System.out.println("You have drawn a " + card.toString());
         }
         if(turn.equals("s")){ // stand 
         
         x += 1;
         }   
      }
      x = 0;
      System.out.println(p2 + ", it is your turn.");
      System.out.println(p2 + ", you have[" + "]");
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals("h")){ // hit 
         
         }
         if(turn.equals("s")){ // stand 
         
         x += 1;
         }   
      }
      x = 0;
      System.out.println("wins");
      System.out.println(p1 + " has " + "wins.");
      System.out.println(p1 + " has " + "wins.");
      System.out.println("play again (y/n)?");
      String reset = console.next();
      if(reset.equals("y")){
      
      }
      if(reset.equals("n")){
         game = 1;
      }
      
      }
      
   }
}