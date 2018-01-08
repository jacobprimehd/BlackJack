import java.util.*;

public class Results {

   private int p1Score;
   private int p2Score;
   private String result;
   
   public void setP1Score(int x) {
      this.p1Score = x;
   }
   public int getP1Score() {
      return this.p1Score;
   }

   public void setP2Score(int x) {
      this.p2Score = x;
   }
   public int getP2Score() {
      return this.p2Score;
   }
   
   public void setResult(String x) {
      this.name = x;
   }
   public String getResult() {
      return this.name;
   }
   
   public String gameResult() {
   
      if(p1Score.getP1Score > p2Score.getP2Score && p1Score.getP1Score <= 21) {
         result.setResult = p1.getName + " wins!";
      }
      
      if(p2Score.getP2Score > p1Score.getP1Score && p2Score.getP2Score <= 21) {
         result.setResult = p2.getName + " wins!";
      }
      
      if(p1Score.getP1Score > 21 && p2Score.getP2Score <= 21) {
         result.setResult = p2.getName + " wins!";
      }
      
      if(p2Score.getP2Score > 21 && p1Score.getP1Score <= 21) {
         result.setResult = p1.getName + " wins!";
      }
      
      if(p1Score.getP1Score <= 21 && p2Score.getP2Score <= 21 && p1Score.getP1Score == p2Score.getP2Score) {
         result.setResult = "The game was a tie";
      }
      
      if(p1Score.getP1Score > 21 && p2Score.getP2Score > 21) {
         result.setResult = "Both players busted";
      }
 
   }

}
