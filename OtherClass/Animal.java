package OtherClass;

abstract class Animal {

    protected int weight;
    protected String color;

    abstract void Move();
    abstract void Noise();


    protected void Eat(){
        System.out.println("I'm eating meat");
    };

    protected void Drink(){
        System.out.println("I'm drinking water");
    };

    public String toString(){
        return "I'm a animal with the type " + this.getClass() + " my weight is " + this.weight + " and my color " + this.color;
    }
}
