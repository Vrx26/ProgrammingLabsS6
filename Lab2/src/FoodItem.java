import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome;
    short expires;

    FoodItem(int ID, String name, float price, Category category, Date dateOfIncome, short expires)
    {
        super(ID, name, price, category);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return String.format("%s | DateOfIncome: %s | Expires: %s", super.toString(), this.dateOfIncome, this.expires);
    }

    @Override
    public Object clone()
    {
        return new FoodItem(this.ID, this.name, this.price, this.category, this.dateOfIncome, this.expires);
    }
}
