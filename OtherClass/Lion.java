package OtherClass;

public class Lion extends Feline{
    public Lion(){}

    public Lion(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    protected void Noise(){
        System.out.println("I say bouh and people run");
    }
}
