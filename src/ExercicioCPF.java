import java.util.Scanner;

public class ExercicioCPF {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String cpf;
        while(true){
            System.out.print("Digite seu CPF: ");
            cpf = sc.nextLine();
            if (cpf.length() != 11){
                System.out.println("O CPF só deve conter números");
                continue;
            } else {
                System.out.printf("CPF válido: %s\n", cpf);
                break;
            }

        }



    }
}
