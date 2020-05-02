package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    FoodItem(int ID, String name, float price, Category category, Date dateOfIncome, short expires) {
        super(ID, name, price, category);
        this.setDateOfIncome(dateOfIncome);
        this.setExpires(expires);
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        this.setName(name);
        this.setPrice(price);
        this.addAnalog(analog);
        this.setExpires(expires);
        this.setDateOfIncome(date);
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0f, null, null, (short) 32);
    }

    @Override
    public String toString() {
        return String.format("%s | DateOfIncome: %s | Expires: %s", super.toString(), this.dateOfIncome, this.expires);
    }

    @Override
    public Object clone()
    {
        return new FoodItem(this.getId(), this.getName(), this.getPrice(), this.getCategory(), this.getDateOfIncome(), this.getExpires());
    }

    protected Date getDateOfIncome() {
        return this.dateOfIncome;
    }

    protected void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    protected short getExpires() {
        return this.expires;
    }

    protected void setExpires(short expires) {
        this.expires = expires;
    }
}
