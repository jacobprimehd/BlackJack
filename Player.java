import java.util.*;

public class Player {

   private String name;
   ArrayList<String> hand = new ArrayList<String>();
   private String startingCard;
   private double score;
   
   public void setName(String x) {
      this.name = x;
   }
   public String getName() {
      return this.name;
   }
   
   public void setHand(String x) {
      hand.add(x);
   }
   
   public void clearHand() {
      hand.clear();   
   }
   
   public ArrayList<String> getHand() {
      return this.hand;
   }
   
   
   public void setStartingCard() {
      this.startingCard = hand.get(0);
   }
   
   public String getStartingCard() {
      return this.startingCard;
   }
   
   
   public void setScore(double x) {
      this.score += x;
   }
   
   public double getScore() {
      return this.score;
   }   
   
}                                                                        
