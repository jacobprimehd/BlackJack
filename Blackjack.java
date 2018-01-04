import java.util.*;

public class Blackjack {
   public static void main(String[] args){
      
      Scanner console = new Scanner(System.in);
      Player p1 = new Player; //player 1 
      Player p2 = new Player;// Player 2
      
      System.out.println("Welcome to Blackjack!");
      System.out.print("Please enter the name of player 1: ");
      p1.name = console.next();
      System.out.print("\nPlease enter the name of player 2: ");
      p2.name = console.next();
      System.out.println("=========================");
      System.out.println(p1 + " shows: ");
      System.out.println(p2 + " shows: ");
   }
}
