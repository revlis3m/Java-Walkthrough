//class = style so this is stylish
public class Style {
    public static void main(String[] args) {
        City lamecity = new City();
        City inferno = new City("Inferno","Hell",2);

        System.out.println("First city is "+ lamecity.nameCity);
        System.out.println("Second city is "+ inferno.nameCity);

        lamecity.nameCity = "1 2 3 viva espana";
        System.out.println("First city is "+ lamecity.nameCity);
        

        //let use get and set as good people we're
        lamecity.setNameCity("Bamako");
        lamecity.setNameCountry("Mali");
        lamecity.setNbrCitizens(1986465);

        System.out.println(lamecity.toString());

        //Okay now the best city
        City trixCity = new City("Trix City", "Karmine Corp", 9999999);
        System.out.println(trixCity.toString());

        System.out.println("Number city created is " + City.numberInstance);
    }
}
