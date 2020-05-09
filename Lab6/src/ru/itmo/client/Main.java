package ru.itmo.client;

import java.util.Date;

import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;
import ru.itmo.stocklist.*;

public class Main {
    public static void main(String[] args) {
        var catalog = new ItemCatalog();
        for (int i=0;i<=10;i++){
            try {
                catalog.addItem(new GenericItem());
            }
            catch (ItemAlreadyExistsException e)
            {
                e.printStackTrace();
            }
        }

    // ItemAlreadyExistsException
    try {
        catalog.addItem(new GenericItem(1, "a", 100, Category.GENERAL));
    }
    catch (ItemAlreadyExistsException e)
    {
        e.printStackTrace();
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
        try {
            loader.load(catalog);
        }
        catch (CatalogLoadException e){
            e.printStackTrace();
        }
        catalog.printItems();


        try{
            CatalogFileLoader fileLoader = new CatalogFileLoader("items.lst");
            fileLoader.load(catalog);
            catalog.printItems();
        } catch (CatalogLoadException e){
            e.printStackTrace();
        }
    }
}
