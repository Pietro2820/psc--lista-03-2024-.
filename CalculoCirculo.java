import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Este programa realiza cálculos com círculos e esferas.");
        System.out.println("Você pode calcular o perímetro de um círculo, a área de um círculo ou o volume de uma esfera.");
        
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = entrada.nextInt();
        
        System.out.print("Digite o raio: ");
        double raio = entrada.nextDouble();

        // Formatação da saída de ponto flutuante
        // %.2f - Formata o número com 2 casas decimais
        // %n - Adiciona uma quebra de linha após a impressão
        
        switch (operacao) {
            case 1:
                System.out.printf("Perímetro do círculo: %.2f%n", (2 * Math.PI * raio));
                break;
            case 2:
                System.out.printf("Área do círculo: %.2f%n", (Math.PI * Math.pow(raio, 2)));
                break;
            case 3:
                System.out.printf("Volume da esfera: %.2f%n", ((4.0 / 3.0) * Math.PI * Math.pow(raio, 3)));
                break;
            default:
                System.out.println("Código da operação inválido.");
        }
        
        entrada.close();
    }
}
