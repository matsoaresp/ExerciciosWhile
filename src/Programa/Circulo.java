package Programa;

import Entidades.Circunferencia;
import java.util.Locale;
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira o raio da circunferência: ");
        double radius = sc.nextDouble();


        double c = Circunferencia.circunference(radius);
        double v = Circunferencia.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Circunferencia.PI);

        sc.close();
    }
}
