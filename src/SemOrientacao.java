import java.util.Scanner;

public class SemOrientacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA,xB,xC,yA,yB,yC;
        System.out.println("Digite o valor de X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA+ xB+xC) / 2.0;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

         p = (xA+ xB+xC) / 2.0;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.println("Area: "+areaX);
        System.out.println("Area: "+areaY);

        if (areaX > areaY) {
            System.out.println("Maior área " +areaX);
        } else {
            System.out.println("Maior área " +areaY);
        }
    }
}
