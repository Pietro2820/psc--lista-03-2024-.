import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double n1, n2;

        // Apresentação do programa.
        System.out.println("Olá! Aqui você pode realizar operações matemáticas entre dois números.");

        while (true) { // Loop infinito até o usuário escolher sair.
            // Solicitando os números ao usuário.
            System.out.print("Informe o primeiro número: ");
            n1 = scanner.nextDouble();
            System.out.print("Informe o segundo número: ");
            n2 = scanner.nextDouble();

            // Exibindo opções de operações disponíveis.
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            // Processamento da opção escolhida pelo usuário.
            switch (opcao) {
                case 0: // Opção para encerrar o programa.
                    System.out.println("Programa finalizado.");
                    scanner.close(); // Fechando o scanner antes de sair.
                    return;
                case 1: // Soma.
                    System.out.println("O resultado da soma de " + n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2: // Subtração.
                    System.out.println("O resultado da subtração de " + n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3: // Multiplicação.
                    System.out.println("O resultado da multiplicação de " + n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case 4: // Divisão, garantindo que não ocorra divisão por zero.
                    if (n2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        System.out.println("O resultado da divisão de " + n1 + " / " + n2 + " = " + (n1 / n2));
                    }
                    break;
                case 5: // Potência.
                    System.out.println("O resultado da potência de " + n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));
                    break;
                default: // Tratamento para opções inválidas.
                    System.out.println("Opção inválida. Por favor, selecione uma opção entre 0 e 5.");
            }
        }
    }
}
