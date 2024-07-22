import java.util.Scanner;

public class iokeyboard {
    public static void main(String[] args) {
        //Ouput
        System.out.println("Hi i'm Silver the prince of this world");

        //input
        Scanner sc =new Scanner(System.in);
        System.out.println("Why a prince ?");
        String answer = sc.nextLine();//Cauz he's the heart of the kingdom and his future
        System.out.println(answer);

        System.out.println("what's his ur age ?");
        int age = sc.nextInt();
        System.err.println("So your age is " + age);

        //type input
        Scanner input = new Scanner(System.in);
        System.out.println("What's is your Height (cm)");
        int height = input.nextInt();
        sc.nextLine();
        double d = sc.nextDouble();
        long l = sc.nextLong();
        byte b = sc.nextByte();//flemme wla
        
    }
}
