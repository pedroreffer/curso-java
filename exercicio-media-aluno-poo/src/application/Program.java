/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
 ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
 para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara
 resolver este problema.*/

package application;

import entities.FinalGrade;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FinalGrade grade = new FinalGrade();

        String name = sc.nextLine();
        grade.a = sc.nextDouble();
        grade.b = sc.nextDouble();
        grade.c = sc.nextDouble();

        System.out.println();
        System.out.println(grade);

        if (grade.finalGrade() < 60) {
            System.out.printf("FAILED \nMiSSING %.2f POINTS", grade.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}