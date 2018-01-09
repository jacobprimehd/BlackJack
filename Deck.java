import java.util.*;
public class Deck{
   private String suit;
   private int cardValue;
   private String cardName;
   private int cardNum;
   private int suitNum;
   private  ArrayList<Integer> spades = new ArrayList<>();
   private ArrayList<Integer> hearts = new ArrayList<>();
    private ArrayList<Integer> diamonds = new ArrayList<>();
    private ArrayList<Integer> clubs = new ArrayList<>();
   
   //spades.add(1);
   
   
   
   //int suitNum = (int)Math.random()*4+1;
   
   public void shuffle(){
      for(int i = 1; i <= 13; i++){
         spades.clear();
         diamonds.clear();
         hearts.clear();
         clubs.clear();
      }    
   }
   public void setRandomSuit(){ 
   this.suitNum = (int)(Math.random()*4+1);  
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
       //int cardNum = 0;
      if((this.suit).equals("Hearts")){
          this.cardNum = ((int)(Math.random()*13)+1);
          if(hearts.contains(cardNum)){
            this.setRandomCard();
          } else hearts.add(cardNum);
      }else if((this.suit).equals("Spades")){
          this.cardNum = ((int)(Math.random()*13)+1);
          if(spades.contains(cardNum)){
            this.setRandomCard();
          } else spades.add(cardNum);
      }else if((this.suit).equals("Clubs")){
           this.cardNum = ((int)(Math.random()*13)+1);
           if(clubs.contains(cardNum)){
            this.setRandomCard();
          } else clubs.add(cardNum);

      }else if((this.suit).equals("Diamonds")){
          this.cardNum = ((int)(Math.random()*13)+1);
          if(diamonds.contains(cardNum)){
            this.setRandomCard();
          } else diamonds.add(cardNum);

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
      }else System.out.print("error");
   }
   public int getCardValue(){
      return this.cardValue;
   }
   public String getCardName(){
      return this.cardName;
   }
   public String toString(){
    return cardName + " of " + suit;
   }
}