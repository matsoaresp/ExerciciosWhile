import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua preferência de combustivel?");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int numero = sc.nextInt();

        while (numero != 4 ){

            if (numero == 1){
             alcool += 1;
            }
             else if (numero == 2){
                gasolina += 1;

            }
             else if (numero == 3){
                diesel += 1;
            }


             numero = sc.nextInt();


        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool "+ alcool);
        System.out.println("Gasolina "+ gasolina);
        System.out.println("Diesel "+ diesel);

    }
}
