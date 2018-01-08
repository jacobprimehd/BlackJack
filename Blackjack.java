import java.util.*;

public class Blackjack {
   public static void main(String[] args){
      
      Scanner console = new Scanner(System.in);
      Player p1 = new Player; //player 1 
      Player p2 = new Player; // Player 2
      deck card = new deck;
      int x = 0;
      int game = 0;
      
      System.out.println("Welcome to Blackjack!");
      System.out.println("Please enter the name of player 1: ");
      p1.setName = console.next();
      System.out.println("Please enter the name of player 2: ");
      p2.setName = console.next();
      System.out.println("=========================");
      System.out.println(p1 + " shows: ");
      System.out.println(p2 + " shows: ");
      System.out.println(p1 + ", it is your turn.");
      System.out.println(p1 + ", you have[" + "]");
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals"h"){ // hit 
         
         }
         if(turn.equals"s"){ // stand 
         
         x += 1;
         }   
      }
      x = 0;
      System.out.println(p2 + ", it is your turn.");
      System.out.println(p2 + ", you have[" + "]");
      while( x == 1){ 
         System.out.println("Do you want to [h]it or [s]tand?");
         String turn = console.next();
         if(turn.equals"h"){ // hit 
         
         }
         if(turn.equals"s"){ // stand 
         
         x += 1;
         }   
      }
      x = 0;
      System.out.println("wins");
      System.out.println(p1 + " has " + "wins.");
      System.out.println(p1 + " has " + "wins.");
      System.out.println("play again (y/n)?");
      String reset = console.next();
      if(reset.equals"y"){
      
      }
      if(reset.equals"n"){
         game = 1;
      }
      
   }
}
