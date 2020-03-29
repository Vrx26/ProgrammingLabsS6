public class StringsExcercise {
    public static void main(String[] args) {
        String line = "Конфеты ’Маска’;45;120";
        String[] itmFld;
        itmFld = line.split(";");
        var item = new FoodItem(itmFld[0], Float.parseFloat(itmFld[1]), Short.parseShort(itmFld[2]));
        item.printALL();
    }
}
