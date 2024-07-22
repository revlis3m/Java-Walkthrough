/*
Odd and Even Numbers:
Write a Java program to print all the even numbers between 1 and 100. Also, print the count of even and odd numbers.*/

public class exercice1 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Number\tEven\tOdd");
        while (n < 100) {
            int even = 0, odd =0;
            if(n%2 == 0) even =n;
            else odd = n;
            System.out.println(n+"\t"+ even +"\t"+ odd);
            n++;
        }
    }
}
