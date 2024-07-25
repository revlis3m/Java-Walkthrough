package Exceptions;

import POO.City;
import POO.CityException;

public class NoError {
    public static void main(String[] args) {
        int j = 20, i = 0;
        try {
            System.out.println(j/i);
        } catch (ArithmeticException e) {
            System.out.println("Dumbass try to divide by zero");
        }
        System.out.println("Hello");
        
        try {
            
            City inferno = new City("Inferno","Hell",2);
            System.out.println(inferno.toString());
            City pensailvania = new City("Pensilvania", "US", -51);
            System.out.println(pensailvania.toString());
        } catch (CityException e) {
            
        }
    }
}
