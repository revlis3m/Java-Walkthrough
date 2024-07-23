/*
 * Sum of Array Elements:
Write a Java program to calculate the sum of all elements in an array.
 */

import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("You're going to fill the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + (i+1) + " : ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of the array is "+ sum);
    }
}
