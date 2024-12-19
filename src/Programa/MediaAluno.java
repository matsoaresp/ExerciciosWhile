package Programa;
import Entidades.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe suas notas");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        if (aluno.Notas() < 60){
            aluno.PontosFaltando();
        }
        System.out.println(aluno);

    }
}
