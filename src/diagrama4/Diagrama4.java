/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama4;

/**
 *
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 02/24/2016
 */
public class Diagrama4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        String playAgain="y";
        while (playAgain.equalsIgnoreCase("y")){
            guessingGame();
            System.out.println("Would youlike to play another game(y/n)");
            playAgain=lectura.next();
        }
    }
    static void guessingGame(){
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        
       int answer=(int) Math.floor((Math.random()*100)+1);
       //System.out.println(answer);
       int guess=0;
       int numGuesses=1;
       
       while (!(numGuesses>7 || guess==answer)){
           System.out.println("Guess a number");
           guess=lectura.nextInt();
           if (guess<answer){
           System.out.println("Higher...");
           }
           else if (guess>answer){
               System.out.println("Lower...");
               
           }
           else{
              System.out.println("You Win"); 
           }
           numGuesses=numGuesses+1;
       }
       if (numGuesses>7){
           System.out.println("You loser");
       }
       
    }
    
}
