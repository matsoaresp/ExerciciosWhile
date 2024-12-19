import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero de 0 a 25 ");
        int numero = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {

            if (numero > 25 ){
                System.out.println("Número incorreto, tente novamente");
                numero = sc.nextInt();
            }
             fatorial *= i;

        }
        System.out.println(fatorial);



        sc.close();
    }
}
