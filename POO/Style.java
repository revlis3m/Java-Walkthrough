//class = style so this is stylish

package POO;

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

        Capital shame = new Capital();
        Capital paris = new Capital("Paris", "France", 446565, "La Seine");

        System.out.println(paris.toString());

        //let's compare
        City tokyo = new City("Tokyo", "Japan", 156156);
        City tokyo1 = new City("Tokyo", "Japan", 156156);
        if(tokyo.equals(tokyo1)) System.out.println("Same city");
        else System.out.println("Not same city");

        //Capital time
        Capital rome = new Capital("Rome", "Italia", 4654846, "Coluseum");
        Capital rome1 = new Capital("Rome", "Italia", 4654846, "Coluseum");
        if(rome.equals(rome1)) System.out.println("Same city");
        else System.out.println("Not same city");
    }
}
