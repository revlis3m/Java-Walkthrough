package OtherClass;

public class Main {
    public static void main(String[] args) {
        Wolve wol = new Wolve(54, "Grey");
        wol.Eat();
        wol.Drink();
        wol.Move();
        wol.Noise();
        System.out.println(wol.toString());
    }
}
