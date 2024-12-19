import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um nome (5 a 50 caracteres, sem números): ");
            String nome = sc.nextLine();


            if (nome.length() < 5 || nome.length() > 50) {
                System.out.println("O nome deve ter entre 5 e 50 caracteres. Tente novamente.");
                continue;
            }


            if (nome.matches(".*\\d.*")) {
                System.out.println("Números não são permitidos no nome. Tente novamente.");
                continue;
            }


            System.out.println("Nome válido: " + nome);
            break;
        }

        sc.close();
    }
}
