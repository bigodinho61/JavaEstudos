package introducaometodos.dominio;

public class Calculadora {

    // Metodo vazio
    public void somaDoisNumeros(double n1, double n2){
        double s = n1+n2;
        System.out.println("A soma de "+n1+" e "+n2+" é "+s);
    }
    // Metodo retorna algo
    public double multiplicaDoisNumeros(double n1, double n2){
        double s = n1+n2;

        return  s;

    }

    public void alteraDoisNumero(int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteradDoisNuMEROS");
        System.out.println("Num1"+num1);
        System.out.println("Num2"+num2);

    }
}
