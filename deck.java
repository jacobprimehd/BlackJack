import java.util.*;
public class deck{
   private String suit;
   private int cardValue;
   private String cardName;
   ArrayList<Integer> spades = new ArrayList<>();
   ArrayList<Integer> hearts = new ArrayList<>();
      ArrayList<Integer> diamonds = new ArrayList<>();
   ArrayList<Integer> clubs = new ArrayList<>();
   int cardNum = 0;
  
   
   int suitNum = (int)Math.random()*4+1;;
   public void shuffle(){
      for(int i = 1; i <= 13; i++){
         spades.add(i);
      }
       for(int i = 1; i <= 13; i++){
         hearts.add(i);
      }
       for(int i = 1; i <= 13; i++){
         clubs.add(i);
      }
       for(int i = 1; i <= 13; i++){
         diamonds.add(i);
      }
    
   }
   public void setRandomSuit(){   
     if(suitNum == 1){
      this.suit = "Hearts";
     } else if(suitNum == 2){
      this.suit = "Spades";
     } else if(suitNum == 3){
      this.suit = "Clubs";
     } else if(suitNum == 4){
      this.suit = "Diamonds";
     }
   }
   
   public String getRandomSuit(){
    return suit;
   }
   public void setRandomCard(){
      // int cardNum = 0;
      if(suit.equals("Hearts")){
          cardNum = ((int)Math.random())*(hearts.size())+1;
          hearts.remove(cardNum-1);
      }else if(suit.equals("Spades")){
          cardNum = ((int)Math.random())*(hearts.size())+1;
          spades.remove(cardNum-1);
      }else if(suit.equals("Clubs")){
          cardNum = ((int)Math.random())*(hearts.size())+1;
          clubs.remove(cardNum-1);
      }else if(suit.equals("Diamonds")){
          cardNum = ((int)Math.random())*(hearts.size())+1;
          diamonds.remove(cardNum-1);
      }
   }

   public void setCardValueAndName(){
      if(cardNum == 1){
         this.cardValue = 1;
         this.cardName = "ace";
      }else if(cardNum == 2){
         this.cardValue = 2;
         this.cardName = "two";
      }else if(cardNum == 3){
         this.cardValue = 3;
         this.cardName = "three";
      }else if(cardNum == 4){
         this.cardValue = 4;
         this.cardName = "four";
      }else if(cardNum == 5){
         this.cardValue = 5;
         this.cardName = "five";
      }else if(cardNum == 6){
         this.cardValue = 6;
         this.cardName = "six";
      }else if(cardNum == 7){
         this.cardValue = 7;
         this.cardName = "seven";
      }else if(cardNum == 8){
         this.cardValue = 8;
         this.cardName = "eight";
      }else if(cardNum == 9){
         this.cardValue = 9;
         this.cardName = "nine";
      }else if(cardNum == 10){
         this.cardValue = 10;
         this.cardName = "ten";
      }else if(cardNum == 11){
         this.cardValue = 10;
         this.cardName = "Jack";
      }else if(cardNum == 12){
         this.cardValue = 10;
         this.cardName = "Queen";
      }else if(cardNum == 13){
         this.cardValue = 10;
         this.cardName = "King";
      }
   }
   public int getCardValue(){
      return this.cardValue;
   }
   public String getCardName(){
      return this.cardName;
   }
}