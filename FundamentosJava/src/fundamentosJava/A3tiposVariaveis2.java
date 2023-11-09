package fundamentosJava;

//Complementando os estudos;
//Strings - Tutorial Java do site W3schools;

public class A3tiposVariaveis2 {
public static void main(String[] args){
 String saudacao1 = "Olá";
 String saudacao2 = "Mundo";
 String textoIndex = "Localização na string da ocorrência 'string'";
 String texto1 = "Nós somos os tão chamados \"Vikings\" do Norte"; // Caractere especial \"
 String texto2 = "It\'s Alright"; // Caractere especial \'
 String texto3 = "The character \\ is called backslash"; // Caractere especial \\

 System.out.println(saudacao1);
 System.out.println("O tamanho da string 'Olá' é: " + saudacao1.length());
 System.out.println(saudacao1.toUpperCase()); // As letras se tornam todas maiúsculas;
 System.out.println(saudacao1.toLowerCase()); // As letras se tornam toda minúscula;
 System.out.println(textoIndex.indexOf("string") + "\n"); // Localiza na string o index (posição) da primeira ocorrência de um texto especificado no método.
 
 System.out.println(saudacao1 + " " + saudacao2 + '!'); // Concatenação de strings;
 System.out.println(saudacao1.concat(saudacao2+"!\n")); // Concatenação através do método concat(); Caractere /n -> nova linha;

 System.out.println(texto1);
 System.out.println(texto2);
 System.out.println(texto3);

 System.out.println("Exemplooo carriage\rreturn\n"); // Caractere \r -> carriage return;
 System.out.println("Exemplo\ttab"); // Caractere \t -> tab;
 System.out.println("Exemplo \bbackspace"); // Caractere \b -> backspace;
 System.out.println("Exemplo form \ffeed"); // Caractere \f -> form feed;
}
}

/* String no Java

 - É um objeto, o qual contém métodos que realizam operações específicas nas strings
   - length(), toUpperCase(), toLowerCase(), indexOf() e etc... 

 - Java conta as posições a partir do zero. 0 é a primeira posição da string, 1 é a segunda, 2 é a terceira e assim vai;
*/ 