package sim1;

/*
* Write a simple program which rotates the characters of a given license plate number by certain position.
* i.e., it changes the character part of the license plate number by a certain offset of characters.
* [The program must take input of the license plate number]
*
* Example:
1.	For plate number ABC789 to be rotated by an offset of 2 the new plate number will be CDE789
2.	For plate number XYZ172 to be rotated by an offset of 2 the new plate number will be ZAB172
3.	For plate number ABC789 to be rotated by an offset of 4 the new plate number will be EFG789
4.	For plate number XYZ172 to be rotated by an offset of 4 the new plate number will be BCD172

* You may assume that any message input to this program takes only:
•	Upper case letters
•	Digits
All characters except for digits are to be substituted for (digits are just written as it is to the cipher text).

* */

import java.util.Scanner;

public class Q5 {

    public static void main(String []args) {
        //Get input
        Scanner inputLine = new Scanner(System.in);
        System.out.println("input a licence Plate");
        char[] licencePlate = inputLine.nextLine().toCharArray();
        int counter = 0;
        //Ask for the change
        System.out.println("What should the offset be by?: ");
        int offset = inputLine.nextInt();
        //Do the change
        for(int i = 0; i < licencePlate.length; i++){
            licencePlate[counter] = (char) (licencePlate[counter] + offset);
            counter++;
        }
        //Show the change
        System.out.println(licencePlate);
    }

}