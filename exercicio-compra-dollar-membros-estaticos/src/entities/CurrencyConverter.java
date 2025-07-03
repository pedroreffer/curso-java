package entities;

public class CurrencyConverter {

    public static double IOF = 0.06;
    public double dollarprice;
    public double dollar;

    public double amountInReais() {
        return (dollarprice * dollar) + (dollarprice * dollar * IOF);
    }
}
