import java.util.Scanner;

public class MaiorMenorMedia{
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        // Entrada
        System.out.println("Escreva 3 numeros para saber a média aritmética deles.");
        
        System.out.println("Primeiro número: ");
        Double primeiroNu = numeros.nextDouble();

        System.out.println("Segundo número: ");
        Double segundoNu = numeros.nextDouble();

        System.out.println("Terceiro número: ");
        Double terceiroNu = numeros.nextDouble();
        
        // Comparação
        Double maior = Math.max(primeiroNu,Math.max(segundoNu,terceiroNu));
        Double menor = Math.min(primeiroNu,Math.min(segundoNu,terceiroNu));

        // Apresentação
        System.out.println("\nMaior: " + maior + " Menor: " + menor);

        numeros.close();

        // Resultado
        Double resultado;

        resultado = primeiroNu + segundoNu + terceiroNu;

        System.out.println("\n" + primeiroNu + " + " + segundoNu + " + " + terceiroNu + " + " + " = " + resultado);
        resultado = resultado / 3;

        System.out.println("\nA média aritmética desse números é: " + resultado);
    }
}