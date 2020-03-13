import java.util.Date;

public class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int ID, String name, float price, Category category, short warrantyTime)
    {
        super(ID, name, price, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return String.format("%s | WarrantyTime: %s", super.toString(), this.warrantyTime);
    }

    @Override
    public Object clone()
    {
        return new TechnicalItem(this.ID, this.name, this.price, this.category, this.warrantyTime);
    }
}
