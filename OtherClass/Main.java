package OtherClass;

public class Main {
    public static void main(String[] args) {
        Wolve wol = new Wolve(54, "Grey");
        wol.Eat();
        wol.Drink();
        wol.Move();
        wol.Noise();
        System.out.println(wol.toString());
        //---------------------------------------------------
        Dog doggy = new Dog(20, "White");
        doggy.Eat();
        doggy.Drink();
        doggy.Move();
        doggy.Noise();
        System.out.println(doggy.toString());

        //Interface methods
        doggy.hug();
        doggy.lick();
        doggy.bePretty();

        //Polymorph
        BestoFriendo dio = new Dog(20,"Black");
        dio.hug();
        dio.lick();
        dio.bePretty();
    }
}
