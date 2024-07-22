public class variable {
    public static void main(String[] args) {
        
        // Nombre entier
        byte temperature = 64;
        short maxSpeed = 120;
        int hinataHotDegree = 5615236;
        long anneeLumiere = 9460700000000000L;

        //Nombre flotant
        float pi = 3.141592653f;
        double division = 0.333333333333333333333333333333333333333333334d;

        //Caractere
        char lettre = 'X';
        boolean reponse = false;

        //Chaine de caracteres
        String question = "English or Spanish ?";

        //Operation do some math
        int number1, number2, number3;
        number1 = 1+6;
        number2 = 9-56;
        number3 = 5*56;
        number1 = number2/number3;
        number3 = (number1 + 12)%number2;
        System.out.println("Number 1 : "+ number1);
        System.out.println("Number 2 : "+ number2);
        System.out.println("Number 3 : "+ number3);
        
        //shortcut
        number1 = 20;
        number1++;
        number1 *= 5; //21 *5 
        number2 += 47;
        System.out.println("Number 1 : "+ number1);
        System.out.println("Number 2 : "+ number2);

        //Some convertion uwu
        int i = 123;
        float j = (float)i;
        System.out.println(j);
        float x = 2.89f;
        int k = (int)x;
        System.out.println(k);
    }
}
