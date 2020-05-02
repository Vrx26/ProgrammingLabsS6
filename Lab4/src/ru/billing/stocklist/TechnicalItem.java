package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int ID, String name, float price, Category category, short warrantyTime)
    {
        super(ID, name, price, category);
        this.setWarrantyTime(warrantyTime);
    }

    @Override
    public String toString() {
        return String.format("%s | WarrantyTime: %s", super.toString(), this.warrantyTime);
    }

    @Override
    public Object clone()
    {
        return new TechnicalItem(this.getId(), this.getName(), this.getPrice(), this.getCategory(), this.warrantyTime);
    }

    protected short getWarrantyTime() {
        return this.warrantyTime;
    }

    protected void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
}
