package OtherClass;

public class Dog extends Canine implements BestoFriendo {
    public Dog(){

    }

    public Dog(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    protected void Noise(){
        System.out.println("Wouaf WOuaf");
    }

    public void hug(){
        System.out.println("I'm being huged omg");
    }

    public void lick(){
        System.out.println("Time to get u wet lol");
    }

    public void bePretty(){
        System.out.println("I'm prettier than a cat right ?");
    }
}
