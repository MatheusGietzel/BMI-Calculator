import java.util.Scanner;

public class BMICALC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Resultado: " + interpretarResultado(imc));

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
    
        return peso / (altura * altura);
    }

    public static String interpretarResultado(double imc) {
        String resultado;
        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            resultado = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            resultado = "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            resultado = "Obesidade grau 1";
        } else if (imc >= 35 && imc < 40) {
            resultado = "Obesidade grau 2";
        } else {
            resultado = "Obesidade grau 3";
        }
        return resultado;
    }
}