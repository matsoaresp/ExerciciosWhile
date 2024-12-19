package Entidades;

public class Funcionario {
    public String nome;
    public double salario;
    public double taxa;

    public double SalarioLiquido() {
        return salario - taxa;
    }

    public void AumentarSalario(double porcentagem) {
        salario = salario + (salario * porcentagem / 100);
    }

    public String toString (){
        return "Funcionario: "+nome+", $"+SalarioLiquido();
    }
}
