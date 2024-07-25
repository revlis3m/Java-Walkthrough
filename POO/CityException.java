package POO;

public class CityException extends Exception{
    public CityException(){
        System.out.println("You can't create a city with negative number of population");
    }
}
