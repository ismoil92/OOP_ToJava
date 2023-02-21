package Lesson3;

public class HotDrink extends Drink{
    private int temperature;

    private int volume;
    public HotDrink(String name, double cost) {
        super(name, cost);
    }

    public HotDrink(){

    }

    public HotDrink(String name, double cost, int temperature, int volume){
        super.name = name;
        super.cost = cost;
        this.temperature = temperature;
        this.volume=volume;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getVolume(){
        return this.volume;
    }

    @Override
    public String toString() {
        return String.format("Name:%s, Cost:%f, Temperature:%d, Volume:%d", super.name, super.cost, this.temperature, this.volume);
    }
}
