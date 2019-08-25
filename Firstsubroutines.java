/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutines;

/**
 *
 * @author harde
 */
public class Firstsubroutines {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        /*This is the main() method which asks for user input. Once input is
        given, the program calls on each subroutine to remove spaces between
        letters and then reverse the word or phrase entered.
        */
        System.out.println("This program is used to test for a palendrome.");
        System.out.println("You must first enter a word or phrase.");
        System.out.println("Your word or phrase will then be tested.");
        String inputLine;
        TextIO.put("Enter a word or phrase: ");
        inputLine=TextIO.getln();
        String nospace=modifyString(inputLine); 
        /*Calling the modifyString subroutine, which removes all spaces and 
        makes all letters lower case.
        */
        String reverse=reverseString(nospace);
        /*Calling the reversString subroutine, which takes the word or phrase
        after it has been modified to lower case and spaces removed, then
        reverses the word or phrase.
        */
        System.out.println("Word or phrase: "+nospace);
        System.out.println("Reversed word or phrase: "+reverse);
        if(nospace.equalsIgnoreCase(reverse))
            /*Testing to see if the modified reverse equals the modified
            forward. */
            System.out.println(inputLine+ " is a palindrome.");
            else
            System.out.println(inputLine+" is not a palindrom.");                    
    }        
    static String reverseString(String str){        
        String reverse;
        int i;
        reverse=""; 
        /* Reverses string */
        for (i=str.length()-1; i>=0; i--){
            reverse=reverse + str.charAt(i);                    
        }
        return reverse;
    }
    public static String modifyString(String str){
        /* Modifies string to remove spaces and make all letters lowercase. */
        str=str.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();
        System.out.println(str);
        return str;        
    }
                        
}