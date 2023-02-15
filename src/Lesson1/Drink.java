package Lesson1;

public class Drink {
    protected String name;
    protected double cost;

    public Drink(){

    }

    public Drink(String name, double cost){
        this.name=name;
        this.cost = cost;
    }

    protected String getName(){
        return this.name;
    }

    protected double getCost(){
        return this.cost;
    }

    @Override
    public String toString() {
        return String.format("Name:%s, Cost:%f", this.name, this.cost);
    }
}
