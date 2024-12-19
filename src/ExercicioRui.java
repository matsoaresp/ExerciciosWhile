import java.util.Scanner;

public class ExercicioRui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = "";
        String resultado = "";

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o item número "+ i);

            item = sc.next();
            resultado += "Item"+i+":"+item +"\n";

        }
        System.out.println("Lista de compras:");
        System.out.println(resultado);

        sc.close();
    }
}
