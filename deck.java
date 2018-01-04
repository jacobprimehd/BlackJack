public class deck{
   private String suits;
   private int[] drawnCards;
   int[] spades = {1,2,3,4,5,6,7,8,9,10,11,12,13};
   int[] hearts = {1,2,3,4,5,6,7,8,9,10,11,12,13};
   int[] diamonds = {1,2,3,4,5,6,7,8,9,10,11,12,13};
   int[] clubs = {1,2,3,4,5,6,7,8,9,10,11,12,13};
   int suitNum = (int)Math.random()*4+1;
   String suit = "";
   public void setRandomSuit(){   
     if(suitNum == 1){
      suit = Hearts;
     } else if(suitNum == 2){
      suit = Spades;
     } elseif(suitNum == 3){
      suit = Clubs;
     } elseif(suitNum == 4){
      suit = Diamonds;
     }
   }
   
   public String getRandomSuit(suit){
    return suit;
   }
}