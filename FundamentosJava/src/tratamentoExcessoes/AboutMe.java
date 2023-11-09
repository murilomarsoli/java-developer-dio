package tratamentoExcessoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) { 
        String nome, sobrenome;
        int  idade;
        double altura;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        try {
        	System.out.print("Digite seu nome: ");
	        nome = scanner.nextLine();
	
	        System.out.print("Digite seu sobrenome: ");
	        sobrenome = scanner.nextLine();
	
	        System.out.print("Digite sua idade: ");
	        idade = scanner.nextInt();
	
	        System.out.print("Digite sua altura em metros: ");
	        altura = scanner.nextDouble();
	        scanner.close();

	        System.out.println("\nOlá, me chamo " + nome + " " + sobrenome);
	        System.out.println("Tenho " + idade + " anos");
	        System.out.println("Minha altura é " + altura + "m");
    } catch (InputMismatchException e) {
        System.out.println("\nOs campos \"idade\" e \"altura\" devem ser numéricos;");
        System.out.println("O campo \"altura\" deve utilizar '.' como separador decimal.");
    } finally {
        System.out.println("\nDados cadastrados com successo.");
        }
   }
}

/* 3 possíveis exceções para serem tratadas no programa: 
            - Não informar uma informação requisitada;
            - Valor da idade ter um caractere não numérico;
            - Valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano).
        */

// TRY: bloco de código que testa e, caso encontre erro em sua execução, dispara esse erro ao catch;

// CATCH: caso tenha um erro disparado pelo bloco de código try, o bloco de código catch captura esse erro e executa alguma ação referente ao erro;

// FINALLY (opcional): executa alguma ação independente de ocorrer um erro ou não (mensagem "Altura inserida com sucesso", por exemplo);
