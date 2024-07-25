package POO;

import java.util.Objects;

public class City {

    protected String nameCity, nameCountry;
    protected int nbrCitizens;

    public City() {
        System.out.println("Proceding to create a city");
        nameCity = "Unknow";
        nameCountry = "Unknow";
        nbrCitizens = 0;

        numberInstance++;
        nudeNumberInstance++;
    }

    public City(String nameCity, String nameCountry, int people) throws CityException{
        if(people < 0) throw new CityException();
        else{
            System.out.println("Proceding to create a city");
            this.nameCity = nameCity;
            this.nameCountry = nameCountry;
            this.nbrCitizens = people;
    
            numberInstance++;
            nudeNumberInstance++;
        }
    }

    //getters
    public String getNameCity() {
        return nameCity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public int getNbrCitizens() {
        return nbrCitizens;
    }

    //setter
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setNbrCitizens(int nbrCitizens) {
        this.nbrCitizens = nbrCitizens;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String message = "The name of the city is " + getNameCity() + " wich country is " + getNameCountry() + " who have a number population of " + nbrCitizens;
        return message;
    }

    //You know minecraft ?
    //Class atributes

    public static int numberInstance = 0;
    private static int nudeNumberInstance = 0;

    //equal ?
    //First hash
    public int hashCode() {
        return Objects.hash(nameCity, nameCountry, nbrCitizens);
    }

    //equal
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (getClass() != obj.getClass())
        return false;

        City other = (City) obj;

        return Objects.equals(other.getNameCity(), this.getNameCity()) && 
            Objects.equals(other.getNameCountry(), this.getNameCountry())  &&  
            (other.getNbrCitizens() == this.getNbrCitizens() ? true : false);
    }

}
