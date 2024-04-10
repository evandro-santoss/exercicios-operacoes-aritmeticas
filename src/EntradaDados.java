import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        // entrada
        // Scanner
        Scanner scanner = new Scanner (System.in);

        // Texto
        System.out.print("informe o seu nome: ");
        String nome = scanner.next();

        // caractere
        System.out.print("Escolha uma cor: (azul, verde, amarelo)");
        char cor = scanner.next().charAt(0);

        // NUMERO
        System.out.print("\nInforme sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        
        //processamento
        nome = nome.toUpperCase();

        // Saida
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(cor);

        scanner.close();




    
    }
    
}
