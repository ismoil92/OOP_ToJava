package Lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class HotDrinkVendingMachine implements VendingMachine, Iterator<HotDrink> {
    public ArrayList<HotDrink> getHotDrinksList = new ArrayList<>();
    private int count=0;

    public  HotDrinkVendingMachine(){

    }

    @Override
    public ArrayList<HotDrink> GetHotDrinksList(){
        return getHotDrinksList;
    }
    @Override
    public HotDrink getProductByName(String name) {
        for(var drink:getHotDrinksList){
            if(drink.getName() == name){
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProductByName(String name, int volume, int temperature){
        for(var drink:getHotDrinksList){
            if(drink.getName() == name && drink.getVolume() == volume && drink.getTemperature() == temperature){
                return drink;
            }
        }
        return null;
    }

    @Override
    public HotDrink getProductByCost(double cost) {
        for(var drink:getHotDrinksList){
            if(drink.getCost() == cost){
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProductByCost(double cost, int volume, int temperature){
        for(var drink:getHotDrinksList){
            if(drink.getCost() == cost && drink.getVolume() == volume && drink.getTemperature() == temperature){
                return drink;
            }
        }
        return null;
    }

    @Override
    public void print() {
        for(var value: getHotDrinksList){
            System.out.println(value);
        }
    }

    @Override
    public boolean hasNext() {
        return count<getHotDrinksList.size()-1;
    }

    @Override
    public HotDrink next() {
        count++;
        return getHotDrinksList.get(count);
    }
}
