/* 
 * Find the Maximum and Minimum in an Array:
 * Write a Java program that finds the maximum and minimum values in an array of integers.
*/

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        //First let make a thing to have a dynamic array
        int array[] = new int[10];
        System.out.println("You're going to fill the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + (i+1) + " : ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }

        //Now we can find minimum and maximum
        int max = array[0], min = array[0];
        /* 
         * For our algorithm we gonna be simple we gonna take a number and compare it to the next one if he is bigger it's the new max
         * [0,3,2,5]
         * max will be 0 after 3 after 3 after 5
         * inverse for min
        */
        for (int i = 1; i < array.length; i++) {
            if(max <= array[i]){
                max = array[i];
            }
            if(min >= array[i]){
                min = array[i];
            }
        }

        System.out.println("Max number is " + max + "\nMin number is " + min);
    }
}
