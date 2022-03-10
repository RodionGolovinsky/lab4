public class Currency  {
    public String name;
    public double amount;

    Currency(String name, int amount) {

        this.name = name;
        this.amount = amount;
    }
    public static void disappear(Currency currency, String where){
        System.out.println(currency.amount+ " " + currency.name + " - этот объект исчез" + where);
    }
}


