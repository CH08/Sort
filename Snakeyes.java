/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

import java.util.Arrays;

/**
 *
 * @author harde
 */
 public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int die1;
    int die2;
    int rolls;
    rolls=0;
    final int SnakeEyes=1000;
    int[] result=new int[SnakeEyes];
    for(int i=0;i<SnakeEyes; i++){
    
   do{
        die1=(int)(Math.random()*6)+1;
        die2=(int)(Math.random()*6)+1;
        rolls++;
   } while(die1 !=1 || die2 !=1);
   result[i]=rolls;
    }
    double avg= Arrays.stream(result).sum()/(double)SnakeEyes;
    TextIO.putln(SnakeEyes + " Snake eyes after "+ rolls +" rolls of dice");
    System.out.println(rolls/SnakeEyes + " rolls on average to get snake eyes.");
    

  
    }
}


     
    
 
    
