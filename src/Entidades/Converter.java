package Entidades;

public class Converter {
    public static double Valor (double valor, double quantidade){

            double taxa = valor * 1.06;
            return (taxa * quantidade);
    }
}
