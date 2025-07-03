/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe entities.CurrencyConverter
para ser responsável pelos cálculos.*/

package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        CurrencyConverter c = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        c.dollarprice =sc.nextDouble();
        System.out.print("How many dollars will vbe bought? ");
        c.dollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", c.amountInReais());

        sc.close();
    }
}