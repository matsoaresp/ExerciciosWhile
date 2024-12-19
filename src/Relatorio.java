import java.util.Scanner;

public class Relatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";

        double salario = 0;
        double recolhimento = 0;
        double impostor = 0;
        double media = 0;
        double salarioLiq = 0;
        String opcao = "";
        String dados = "";

        while(true){
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine();
            System.out.println("Informe seu salário:");
            salario = sc.nextDouble();
            sc.nextLine();

            if (nome.length() < 2 ||  nome.length()> 30){
                System.out.println("O nome deve conter entre 2 a 30 caracteres");
                nome = sc.nextLine();
                continue;

            } if (salario < 465.00){
                System.out.println("O salário não pode ser menor que 465.00");
                salario = sc.nextDouble();
                sc.nextLine();

            }
            if (salario < 965.67){
                 recolhimento = salario * 0.08;

            } else if (salario < 1609.45){
                 recolhimento = salario * 0.09;

            }
             else if (salario < 3218.90){
                 recolhimento = salario * 0.11;

            }
            if ( salario < 1434.00 ) {
                 impostor = salario * 0.00;
            }
            else if ( salario < 2150.00 ){
                 impostor = salario * 0.75;
            }
            else if ( salario < 2886.00 ){
                 impostor = salario * 15.0;
            }
            else if ( salario < 3582.00 ){
                 impostor = salario * 22.5;
            }
            else if ( salario > 3582.00 ){
                impostor = salario * 27.5;
            }

            salarioLiq = salario - (recolhimento + impostor);

            dados +=  "Nome: " + nome +"- R$ "+salario+"- (-) R$ "+recolhimento +"- (-) R$ "+impostor+" (=) R$ "+salarioLiq +"\n";
            System.out.println("Digite 1 para sair:");
            opcao = sc.nextLine();
            if (opcao.equals("1") ){
                break;
            }

        }
        System.out.println("RELATÓRIO DA FOLHA DE PAGAMENTO: ");
        System.out.println(dados);

        System.out.println("TOTAIS:");

sc.close();
    }
}
