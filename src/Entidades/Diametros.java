package Entidades;

public class Diametros {

    public double largura;
    public double altura;

    public double Area (){
        return largura*altura;
    }
    public double Parametro(){
        return 2*(largura + altura);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString (){
        return "AREA = "+Area () +"\nPERIMETRO = "+ Parametro()+"\nDIAGONAL = "+Diagonal();
    }
}
