package ru.itmo.stocklist;

import java.util.Objects;

public class GenericItem {
    protected int ID;
    static int currentID = 0;
    private String name;
    private float price;
    private GenericItem analog;
    private Category category = Category.GENERAL;

    public GenericItem(int ID, String name, float price, Category category) {
        this.setId(ID);
        this.setName(name);
        this.setPrice(price);
        this.setCategory(category);
    }

    public GenericItem(String name, float price, Category category) {
        this.setId(GenericItem.currentID++);
        this.setName(name);
        this.setPrice(price);
        this.setCategory(category);
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(name, price, Category.GENERAL);
        this.addAnalog(analog);
    }

    public GenericItem() {
        this("Untitled", 0f, Category.GENERAL);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-20s | Price: %5.2f | ru.billing.stocklist.Category: %s", ID, name, price, category);
    }

    public void printALL(){
        System.out.println(toString());
    }

    public void addAnalog(GenericItem analog){
        this.analog = analog;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;

        GenericItem item = (GenericItem) o;
        return Objects.equals(this.ID, item.ID);
    }

    @Override
    public Object clone()
    {
        return new GenericItem(this.analog.ID, this.analog.name, this.analog.price, this.analog.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price, analog, category);
    }

    protected int getId() {
        return this.ID;
    }

    protected void setId(int id) {
        this.ID = id;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected float getPrice() {
        return this.price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    protected Category getCategory() {
        return this.category;
    }

    protected void setCategory(Category category) {
        this.category = category;
    }
}
