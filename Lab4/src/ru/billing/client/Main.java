package ru.billing.client;

import java.util.Date;
import ru.billing.stocklist.*;

public class Main {
    public static void main(String[] args) {
        var catalog = new ItemCatalog();
        for (int i=0;i<=10;i++){
            catalog.addItem(new GenericItem());
        }


        long begin = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            catalog.findItemByID(10);
        }
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));

        begin = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            catalog.findItemByIDAL(10);
        }
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));


        // task-2
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(catalog);
        catalog.printItems();
    }
}
