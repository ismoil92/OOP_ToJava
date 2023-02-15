import Lesson1.HotDrink;
import Lesson1.HotDrinkVendingMachine;
import Lesson1.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine hotdrinkmachine = new HotDrinkVendingMachine();

       var list = ((HotDrinkVendingMachine) hotdrinkmachine).getHotDrinksList;

        list.add(new HotDrink("Mac coffee", 6000, 60, 1));
        list.add(new HotDrink("Nest coffee", 5000, 55, 2));
        list.add(new HotDrink("Cappucina", 12000, 60, 1));
        list.add(new HotDrink("coffee", 5000, 65, 1));
        list.add(new HotDrink("Mac coffee 2", 8000, 50, 2));

        var byCost =  ((HotDrinkVendingMachine) hotdrinkmachine).getProductByCost(6000, 1, 60);

        if(byCost !=null){
            System.out.println(byCost);
        }
        else{
            System.out.println(byCost);
        }
        var byCost2 = ((HotDrinkVendingMachine) hotdrinkmachine).getProductByCost(4000, 45, 1);
        if(byCost2 !=null){
            System.out.println(byCost2);
        }
        else{
            System.out.println(byCost2);
        }

        var byName = ((HotDrinkVendingMachine) hotdrinkmachine).getProductByName("coffee",1, 65);
        if(byName !=null){
            System.out.println(byName);
        }
        else{
            System.out.println(byName);
        }

        var byName2 = ((HotDrinkVendingMachine) hotdrinkmachine).getProductByName("Nestcoffee", 2, 50);

        if(byName2 !=null){
            System.out.println(byName2);
        }
        else{
            System.out.println(byName2);
        }
        System.out.println();
        hotdrinkmachine.print();
    }
}