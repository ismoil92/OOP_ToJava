package Lesson3;

import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<HotDrink> GetHotDrinksList();

    HotDrink getProductByName(String name);
    HotDrink getProductByCost(double cost);

    void print();
}
