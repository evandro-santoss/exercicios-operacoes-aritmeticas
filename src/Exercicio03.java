import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // 1 - Declare e inicialize uma variável do tipo String chamada name com seu
        // próprio nome.
        String name = "evandro";

        // 2-Em seguida, imprima uma mensagem que diga "Olá, meu nome é [nome]",
        System.out.println("Olá, nome é " + name);

        // 3- Em sequência declare outra variável, e através do da Classe Scanner,
        Scanner scanner = new Scanner(System.in);

        // 4- Peça ao usuário para informar o sobrenome,
        System.out.println("\nInforme seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // 5- Por fim imprima o nome completo.
        System.out.println(" seu nome completo é: " + name + " " + sobrenome);

        scanner.close();

    }

}
