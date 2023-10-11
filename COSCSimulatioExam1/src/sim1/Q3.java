package sim1;

/*
* Write a program that will ask the user for a sentence and print all the words with length 3.
* For example:
    If the user enters
		“The dog jumped over the cat”
    The program would print out:
		“The dog the”
* */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {

    public static void main(String []args) {

        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter text ");
        String[] text = new String[]{inputLine.nextLine()};
        int counter = 0;
        for(int i = 0; i < text.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(text[counter], " ");
            String token = tokenizer.nextToken();
            if(token.length() == 3){
                System.out.println(token);
            }
            counter++;
        }
    }
}