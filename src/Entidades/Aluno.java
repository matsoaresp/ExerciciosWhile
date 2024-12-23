package Entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double Notas(){

        if (nota1 > 30){
            return nota2 + nota3 / 2;
        } else if (nota2 > 35 || nota3 > 35){
            return  nota1;
        }
        return nota1 + nota2 + nota3 / 3;
    }
    public String Resultado (){
        if (Notas() > 60){
            return "APROVADO";
        } else {
            return "REPROVADO";

        }
    }

    public double PontosFaltando() {
        if (Notas() >= 60) {
            return 0;
        }
        return 60 - Notas();
    }

    public String toString() {
        return String.format(
                "NOTA FINAL = %.2f%n%s%nPONTOS FALTANDO = %.2f",
                Notas(),
                Resultado(),
                PontosFaltando()
        );
    }

}
