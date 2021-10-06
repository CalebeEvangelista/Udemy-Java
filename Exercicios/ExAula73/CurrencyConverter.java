package ExAula73;

public class CurrencyConverter {

    public static double total(double price, double bought){
        double tax = bought * price * 0.06;
        return bought * price + tax;
    }
    
}
