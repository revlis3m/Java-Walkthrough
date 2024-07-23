public class City {

    String nameCity, nameCountry;
    int nbrCitizens;

    public City() {
        System.out.println("Proceding to create a city");
        nameCity = "Unknow";
        nameCountry = "Unknow";
        nbrCitizens = 0;

        numberInstance++;
        nudeNumberInstance++;
    }

    public City(String nameCity, String nameCountry, int people){
        System.out.println("Proceding to create a city");
        this.nameCity = nameCity;
        this.nameCountry = nameCountry;
        this.nbrCitizens = people;

        numberInstance++;
        nudeNumberInstance++;
    }

    //getters
    public String getNameCity() {
        return nameCity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public long getNbrCitizens() {
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
        String message = "The name of the city is " + getNameCity() + " wich country is " + getNameCountry() + "who have a number population of " + nbrCitizens;
        return message;
    }

    //You know minecraft ?
    //Class atributes

    public static int numberInstance = 0;
    private static int nudeNumberInstance = 0;

}
