package OtherClass;

public class Dog extends Canine {
    public Dog(){

    }

    public Dog(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    protected void Noise(){
        System.out.println("Wouaf WOuaf");
    }
}
