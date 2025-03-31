import java.util.Scanner;

public class Maquina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        // Apresentação
        System.out.println("Olá! Bem-vindo à máquina de venda automática.");
        System.out.println("Este programa vai calcular o troco a ser devolvido com base no valor da compra e no valor pago.");
        
        // Loop
        while (true) {

            // Entrada de Valores
            System.out.print("Valor da compra: R$ ");
            int valorCompra = scanner.nextInt();
            System.out.print("Valor pago: R$ ");
            int valorPago = scanner.nextInt();

            // Cálculo do troco
            int troco = valorPago - valorCompra;

            if (valorCompra > valorPago) {
                System.out.println("Valor pago é menor que o valor da compra. Por favor, verifique o valor pago.\n");
            } else {
                System.out.println("O valor do troco é: R$ " + troco);

                // Determinar o menor número de notas
                int[] notas = {50, 20, 10, 5, 2, 1}; // Notas disponíveis
                int[] quantidadeNotas = new int[notas.length];

                for (int i = 0; i < notas.length; i++) {
                    quantidadeNotas[i] = troco / notas[i]; // Quantidade de cada nota
                    troco %= notas[i]; // Atualiza o troco restante
                }

                // Exibir a quantidade de notas necessárias
                for (int i = 0; i < notas.length; i++) {
                    if (quantidadeNotas[i] > 0) {
                        System.out.println("Notas de R$ " + notas[i] + ": " + quantidadeNotas[i]);
                    }
                }
            }

            // Continuar ou sair
            System.out.print("Deseja realizar outra compra? (1 - Sim, 2 - Não): ");  
            int resposta = scanner.nextInt();
            if (resposta == 2) {
            break;}   
        }

        scanner.close();
    }
}
