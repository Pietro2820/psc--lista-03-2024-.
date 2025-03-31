import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        //Apresentação
        System.out.println("Olá, nesse programa vamos resolver equações do segundo grau.\n");
        System.out.println("Para isso, você precisa fornecer os valores de a, b e c.");
        System.out.println("ax² + bx + c = 0\n");

        //Loop
        while (true) {

            //Entrada de valores
            System.out.println("Escreva o valor de a: ");
            int a = valores.nextInt();
            System.out.println("Escreva o valor de b: ");
            int b = valores.nextInt();
            System.out.println("Escreva o valor de c: ");
            int c = valores.nextInt();

            //Circunstâncias
            if (a == 0 && b == 0 && c != 0) {
                System.out.println("Coeficientes informados incorretamente.");
            } else if (a == 0 && b != 0) {
                System.out.println("Essa é uma equação de primeiro grau e deverá ser informado o valor da raiz real da equação.");
                System.out.println("O valor dessa raiz é: " + (-c / (double)b));
            } else {

                //Cálculo do discriminante
                System.out.println("delta = b² – 4ac");
                double delta = b * b - 4 * a * c;

                //Circunstâncias do delta
                if (delta < 0) {
                    System.out.println("Esta equação não possui raízes reais.");
                } else if (delta == 0) {
                    System.out.println("Esta equação possui uma única raiz real.");
                    System.out.println("A raiz real é: " + (-b / (2.0 * a)));
                } else {
                    //Cálculo das duas raízes reais
                    double x1 = (-b + Math.sqrt(delta)) / (2.0 * a); // Primeira raiz
                    double x2 = (-b - Math.sqrt(delta)) / (2.0 * a); // Segunda raiz
                    System.out.println("\nEsta equação possui duas raízes reais diferentes: " + x1 + " e " + x2);
                }
            }
            //Continue ou sair
            System.out.println("\nDeseja continuar? (1 - Sim / 2 - Não)");
            int resposta = valores.nextInt(); 
                if (resposta == 2) {break;}
        }    
        valores.close();
    }
}
