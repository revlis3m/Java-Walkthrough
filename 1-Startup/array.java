import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int studentMark [] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < studentMark.length; i++) {
            System.out.println("The student number " + (i+1) + " has as mark : ");
            studentMark[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < studentMark.length; i++) {
            System.out.println("The student number " + (i+1) + " have " + studentMark[i]);
        }

        //shit i forgot the girl
        int studentMarkInclusive [][] = new int[2][10];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                String sexe = (j == 0) ? "Man" : "Woman";
                System.out.println("The "+ sexe + " student number " + (i+1) + " has as mark : ");
                studentMarkInclusive[j][i] = sc.nextInt();
                sc.nextLine();
            }
        }
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                String sexe = (j == 0) ? "Man" : "Woman";
                System.out.println("The "+ sexe + " student number " + (i+1) + " have as mark : " + studentMarkInclusive[j][i]);
            }
        }
    }
}
