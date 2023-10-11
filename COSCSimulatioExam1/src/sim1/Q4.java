package sim1;

/*
* Write a program which will ask the user for a sentence and
* print all the words in same order but with flipped characters.
*
* For example:
    If the user enters
	    “The dog jumped over the cat”
    The program would print out:
	    “ehT god depmuj revo eht tac”

* */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q4 {

    public static void main(String[] args) {
        //Ask for input
        System.out.println("Enter Text: ");
        Scanner inputLine = new Scanner(System.in);
        String text = inputLine.nextLine();
        //Give each word to te tokenizer
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        //Loop
        while (tokenizer.hasMoreTokens()){
            //Seperate each word to a token
            String token = tokenizer.nextToken();   // by SPACE
            //Use those tokens and revers them
            System.out.print( new StringBuilder(token).reverse() + " " ); // displaying the reverse

        }


    }
}