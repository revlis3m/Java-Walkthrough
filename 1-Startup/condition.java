import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number human i'll say if it's positive or negative");
        int i = sc.nextInt();
        if (i < 0)
            System.out.println("Negative number !");

        else if (i > 0)
            System.out.println("Positive number !");

        else {
            System.out.println("oh my god wtf is this psotif or negatif whhhhhhhhhhhhhhhhhhhhhhhy !");
            System.err.println("He died look what u have done shame on you");
            System.exit(1);
        }

        System.out.println("Now enter an age ");
        int age = sc.nextInt();
        if (age > 18 && age < 48)
            System.out.println("It's ok");
        else
            System.out.println("Humm i'm calling the police by precaution");

        // Switch struct
        int note = 15;
        switch (note) {
            case 0:
                System.out.println("Ouch !");
                break;
            case 10:
                System.out.println("You mid asf");
                break;
            case 20:
                System.out.println("Nerd !");
                break;
            default:
                System.out.println("Who care about you ?");
        }

        //If pfff for noob
        int ageDrink = 20;
        String response = (age > ageDrink) ? "You can drink" : "Look at this baby XD";
        System.out.println(response);
    }
}
