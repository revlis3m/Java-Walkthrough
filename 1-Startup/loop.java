import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        String name = null;
        char response = 'O';
        Scanner sc = new Scanner(System.in);
        while (name == null || name.isEmpty()) {
            System.out.println("What's ur name : ");
            name = sc.nextLine();
            response = ' ';

            while (response != 'Y' && response != 'N') {
                System.out.println("How dumb are you Retry ? (Y/N)");
                response = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Hello " + name + ", hope you don't die ?");
        System.out.println("Au revoir…");
        System.out.println("Growing simulation");
        int age = 0;
        do {
            age++;
            System.out.println(age);
            try{
                Thread.sleep(300);
            }
            catch (InterruptedException exception){
                System.err.println(exception);
            }
        } while (age < 100);
        System.out.println("You died XD");

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
        }
    }
}
