import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura (entre 0,1 e 2,5) ");
        double altura = sc.nextDouble();
        System.out.println("Digite sua peso(entre 1 e 300)");
        double peso = sc.nextDouble();
        double imc = 0;
        String categoria = "";

        for (int i = 0; i <= imc; i++){

            if (peso < 1.0 || peso > 300.0){
                System.out.println("Peso incorreto, informe novamente!");
                peso = sc.nextDouble();
            } else if (altura < 0.1 || altura > 2.5){
                System.out.println("Altura incorreta, informe novamente!");
                altura = sc.nextDouble();
            }
            imc = peso/(altura*altura);

        }

        if (imc < 18.5 ){
            categoria = "Magreza";
        } else if (imc > 18.5 && imc < 25){
            categoria = "Normal";
        } else if (imc > 25 && imc < 30){
            categoria = "Sobrepeso";

        }else if (imc > 30 && imc < 35){
            categoria = "Obesidade grau I";
        }
        else if (imc > 35 && imc < 40){
           categoria = "Obesidade grau II";
        }
        else if (imc > 40 && imc < 45){
            categoria = "Obesidade grau III";
        }
        System.out.println("Peso: "+ peso);
        System.out.println("Altura: "+ altura);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Categoria: "+categoria);
        sc.close();
    }
}
