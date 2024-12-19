package Programa;
import Entidades.Diametros;


import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Diametros diametro = new Diametros();
        System.out.println("Informe a altura e a largura do Retangulo");
        diametro.altura = sc.nextDouble();
        diametro.largura = sc.nextDouble();

        System.out.println(diametro);
    }
}
