import java.util.Scanner;

public class Convertisor {
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
    public static void main(String[] args) {
        System.out.println("Convertor Fahrenheit Celsius\n-------------------------------------------------");
        char choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose the convertor mode : \n1 - Fahrenheit to Celsius\n2 - Celsius to Fahrenheit");
            int mode = sc.nextInt();
            switch (mode) {
                case 1:
                    System.out.println("Temperature to convert : ");
                    float degF = sc.nextFloat();
                    float degC = ((degF - 32) * 5) / 9;
                    System.out.println(arrondi(degF,2) + "F equal to " + arrondi(degC,2) + "C");
                    break;
                
                case 2:
                    System.out.println("Temperature a convertir : ");
                    degC = sc.nextFloat();
                    degF = (9 * degC / 5) + 32;
                    System.out.println(arrondi(degC,2) + "C equal to " + arrondi(degF,2) + "F");
                    break;
            
                default:
                    break;
            }
            System.out.println("Do you want to do another conversion ?(Y/N):");
            sc.nextLine();
            String temp = sc.nextLine();
            choice = temp.charAt(0);
        } while (choice != 'N' && choice != 'n');

    }
}
