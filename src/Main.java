import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua senha: ");
        int senha = sc.nextInt();


        while  (senha != 2002){
            System.out.println("Senha Ivalida");
            System.out.println("Tente novamente");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");



        sc.close();

        }
    }





