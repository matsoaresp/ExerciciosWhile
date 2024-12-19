package Programa;
import java.util.Locale;
import java.util.Scanner;
import Entidades.Funcionario;

public class RelatorioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe seu nome");
        funcionario.nome = sc.nextLine();
        System.out.println("Informe seu salario");
        funcionario.salario = sc.nextDouble();
        System.out.println("Informe a taxa do seu sálario");
        funcionario.taxa = sc.nextDouble();
        System.out.println(funcionario);
        System.out.println("Escolha a porcentagem para aumentar no salário:");
        double percentage = sc.nextDouble();
        funcionario.AumentarSalario(percentage);
        System.out.println(funcionario);

        sc.close();
    }
}
