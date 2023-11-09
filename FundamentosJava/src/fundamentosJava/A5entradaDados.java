package fundamentosJava;

import java.util.Locale;
import java.util.Scanner;

public class A5entradaDados {
    public static void main(String[] args) {
        // Podemos declarar as variáveis tanto aqui quanto juntamente com o Scanner (mostrado logo abaixo);
        String nome, sobrenome;
        int  idade;
        double altura;
        
        // Criando um novo objeto do tipo Scanner;
        // Dependendo do locale que colocarmos ele pode dar erro de conversão nas entradas de dados.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        // String nome = scanner.nextLine();
        // Já declara a variável e armazena na mesma o valor que for capturado pelo Scanner;

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite sua altura em metros (utilize . como separador decimal): ");
        altura = scanner.nextDouble();
        // Fechar o scanner após sua execução;
        scanner.close();

        System.out.println("\nOlá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
   }
}