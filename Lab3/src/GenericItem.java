import java.lang.reflect.GenericSignatureFormatError;
import java.util.Objects;

public class GenericItem {
    public int ID;
    static int currentID = 0;
    public String name;
    public float price;
    public GenericItem analog;
    public Category category = Category.GENERAL;

    public GenericItem(int ID, String name, float price, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
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
        return String.format("ID: %d | Name: %-20s | Price: %5.2f | Category: %s", ID, name, price, category);
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
}
