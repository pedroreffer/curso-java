/*Fazer um programa para ler os valores da largura e altura
  de um retângulo. Em seguida, mostrar na tela o valor de
  sua área, perímetro e diagonal. Usar uma classe como
  mostrado no projeto ao lado.*/

package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle ret = new Retangle();

        System.out.println("Enter rectangle width and height: ");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETER = %.2f%n", ret.perimeter());
        System.out.printf("DIAGONAL = %.2f%n",ret.diagonal());

        sc.close();
    }
}