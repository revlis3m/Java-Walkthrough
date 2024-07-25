package OtherClass;

public class Cat extends Feline {
    public Cat(){}

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    protected void Noise(){
        System.out.println("I said miaou and got food");
    }
}
