package fundamentosJava;
public class A3tiposVariaveis {
  public static void main (String[] args){

    byte idade = 123;
    short ano = 2021;
    int cep = 12345098; // não armazena se o valor iniciar com 0 (provavelmente teríamos que armazenar em string);
    long cpf = 98765432109L; //sempre encerrar com o L e não armazena se o valor iniciar com 0 (provavelmente teríamos que armazenar em string);
    float pi = 3.14F; // sempre encerrar com o F;
    double salario = 1275.334455;
    boolean javaeDivertido = true; // boolean = true or false;
    char minhaLetra = 'A'; // um caractere apenas;
    char caracterAscii1 = 65, caracterAscii2 = 66, caracterAscii3 = 67; // numeros que representam caracteres na tabela ASCII;

    String nome = "Murilo";
    String sobrenome = "Marsoli";
    String nomeCompleto = nome + sobrenome;


    int numeroInt = 1;
    // short numeroShort = numeroInt; // não podemos converter automaticamente um tipo de variável maior para outra de tipo menor (em num de bytes);
    short numeroShort = (short) numeroInt; // para isso devemos fazer um "Casting";
    double numeroDouble = numeroShort; // Widening Casting: converter um tipo de tamanho menor para um de tamanho maior (automático);
    int numeroInt2 = (int) numeroDouble; // Narrowing Casting: converter um tipo de tamanho maior para um de tamanho menor (manual);


    int numero = 1; // variável: pode ter seu valor alterado ao longo da execução do programa;
    numero = 2; // variável alterada ao longo da execução do programa;

    int numero2;
    numero2 = 15; // posso atribuir um valor ao longo da execução do programa;

    final double VALOR_DE_PI = 3.14; // CONSTANTE: não tem seu valor alterado ao longo do programa, deve ser antecipado pelo modificador "final";


    System.out.println("idade = " + idade);
    System.out.println("ano = " + ano);
    System.out.println("cep = " + cep );
    System.out.println("cpf = " + cpf);
    System.out.println("pi = " + pi);
    System.out.println("salario = " + salario);
    System.out.println(javaeDivertido + "\n");

    System.out.println("casting int para short = " + numeroShort);
    System.out.println("casting automático short para double = " + numeroDouble);
    System.out.println("casting double para int = " + numeroInt2 + "\n");

    System.out.println(numero);
    System.out.println(VALOR_DE_PI);
    System.out.println(numero2 + "\n");

    System.out.println(minhaLetra);
    System.out.println(caracterAscii1 + ", " + caracterAscii2 + ", " + caracterAscii3);
    System.out.println("Meu nome completo é " + nomeCompleto);
    System.out.println("Meu nome completo é " + nome + " " + sobrenome);
  }
}

/* Tipos e Variáveis

Tipos primitivos

  char -> 2 bytes -> um caractere;
  byte -> 1 byte -> -128 a 127;
  short -> 2 bytes -> -32.768 a 32.767;
  int -> 4 bytes -> -2.147.483.648 a -2.147.483.647 (mais comum);
  long -> 8 bytes -> -9.223.372.036.854.775.808 a -9.223.372.036.854.775.807;
  float -> 4 bytes; -> com precisão até 6 ou 7 dígitos decimais;
  double -> 8 bytes -> com precisão até 15 dígitos decimais (mais comum);
  boolean -> 1 bit -> true ou false;

Tipos não primitivos

  String
  Arrays
  Classes e etc...
*/