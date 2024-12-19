package Programa;
import Entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class ComOrientacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os valores de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area do Triangulo X : "+ areaX);
        System.out.println("Area do Triangulo Y : "+ areaY);

        if (areaX > areaY) {
            System.out.println("Área de X é maior" + areaX);
        }

            System.out.println("Área de Y é maior: " + areaY);
        sc.nextLine();
    }
}
