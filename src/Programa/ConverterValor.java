package Programa;
import Entidades.Converter;
import java.util.Locale;
import java.util.Scanner;

public class ConverterValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Qual o valor do dollar?");
        double valor = sc.nextDouble();
        System.out.println("Qual o valor em dolares você quer comprar?");
        double quantidade = sc.nextDouble();

        double resultado = Converter.Valor(valor, quantidade);
        System.out.printf("O valor a pagar em reais = %.2f%n", resultado);



        sc.close();
    }
}
