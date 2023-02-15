package Lesson1;

import java.util.ArrayList;

public class HotDrinkVendingMachine implements VendingMachine {

    public ArrayList<HotDrink>  getHotDrinksList = new ArrayList<>();;

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
}
