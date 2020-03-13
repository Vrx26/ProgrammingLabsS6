import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // task 1-1
        GenericItem item1 = new GenericItem(1, "Apple",10, Category.GENERAL);
        GenericItem item2 = new GenericItem(2, "Strawberry",5, Category.FOOD);
        GenericItem item3 = new GenericItem(3, "Peach",7, Category.PRINT);

        item1.printALL();
        item2.printALL();
        item3.printALL();

        item1.addAnalog(item2);
        System.out.println(item1.analog.name);


        GenericItem[] items = {new FoodItem(4, "Milk", 20, Category.FOOD, new Date(), (short)45),
                               new TechnicalItem(5, "Milk", 20, Category.FOOD,(short) 50)
    };  
        for (GenericItem item:items) {
            item.printALL();
        }

        FoodItem compItem = new FoodItem(4, "Milk", 20, Category.FOOD, new Date(), (short)45);
        System.out.println(compItem.equals(items[0]));

        System.out.println(item1.clone());
    }
}
