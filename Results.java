import java.util.*;

public class Results {

   private int p1Score;
   private int p2Score;
   private String result;
   private double p1Wins;
   private double p2Wins;
   
   public void setP1Score(int x) {
      this.p1Score = x;
   }
   public void addP1Score(int x){
      this.p1Score += x;
   }
   public int getP1Score() {
      return this.p1Score;
   }

   public void setP2Score(int x) {
      this.p2Score = x;
   }
    public void addP2Score(int x){
      this.p2Score += x;
   }
   public int getP2Score() {
      return this.p2Score;
   }
   
   public String getResult() {
      return this.result;
   }
   
   public void gameResult(String p1, String p2) {
   
      if(p1Score > p2Score && p1Score <= 21) {
         result = p1 + " wins!";
         this.p1Wins += 1.0;
      }
      
      if(p2Score > p1Score && p2Score <= 21) {
         result = p2 + " wins!";
         this.p2Wins += 1.0;
      }
      
      if(p1Score > 21 && p2Score <= 21) {
         result = p2 + " wins!";
         this.p2Wins += 1.0;
      }
      
      if(p2Score > 21 && p1Score <= 21) {
         result = p1 + " wins!";
         this.p1Wins += 1.0;
      }
      
      if(p1Score <= 21 && p2Score <= 21 && p1Score == p2Score) {
         result = "The game was a tie";
         this.p1Wins += .5;
         this.p2Wins += .5;    
      }
      
      if(p1Score > 21 && p2Score > 21) {
         result = "Both players busted";
      }
      
   }
   public void setWins(){
      this.p1Wins = 0.0;
      this.p2Wins = 0.0;
   }
   public void addP1Wins(double x){
      p1Wins += x;
   }
   
   public double getP2Wins(){
      return this.p2Wins ;
   }

   public double getP1Wins(){
      return this.p1Wins ;
   }

}