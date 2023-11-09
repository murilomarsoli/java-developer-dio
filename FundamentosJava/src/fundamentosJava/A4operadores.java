package fundamentosJava;

public class A4operadores {
  public static void main(String[] args){
    
    int soma = 10 + 5, subtracao = 37 - 7, divisao1 = 10/2;
    int numero = 5, valorA = 4, valorB = 6, numA = 10, numB = 12;
    int resultadoTernarioInt = numA == numB ? 1 : 0; // OPERADOR TERNÁRIO COM RETORNO EM INTEIRO
    double multiplicacao = 2.87 * 2, divisao2 = 3.0/2.0;
    boolean valorLogico = true, resultadoLogico;

    String nomeUm, nomeDois; // Variáveis do tipo String;
    String NomeTres = new String("Murilo"); // Novo objeto do tipo String;
    String resultadoTernarioString = numA == numB ? "numA é igual a numB" : "numA é diferente de numB"; // OPERADOR TERNÁRIO COM RETORNO EM STRING;

    // OPERADORES ARITMÉTICOS
    System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(multiplicacao);
    System.out.println(divisao1);
    System.out.println(divisao2);
    System.out.println(5 % 3 + "\n"); // módulo
    System.out.println();

    // OPERADORES UNÁRIOS;
    System.out.println(numero);

    numero = - numero; // numero 5 se torna -5;
    
    System.out.println(numero);
    System.out.println(+ numero); // numero = -5 + 5 = continua sendo -5;
    
    numero = - numero; // numero = -(-5) = se torna 5 positivo;
    // OU numero = numero * -1 // multiplicar por -1 sempre vai inverter o sinal do número; 
    
    System.out.println(numero); // numero = 5;

    System.out.println(++numero); // numero = numero + 1 = 6;
 
    System.out.println(--numero); // numero = numero - 1 = 5;
   
    System.out.println(numero++); // incrementa após uma ação; numero = 5 -> printa 5 na tela -> numero passa a valer 6 após a ação;
    System.out.println(numero); // numero = 6; agora printa 6, pois numero foi incrementado anteriormente;

    System.out.println(numero+=3); // incrementa 5 a var numero; 6 + 3 = 9;
    System.out.println(numero+=3); // incrementa 3 a var numero; 9 + 3 = 12;
    System.out.println(numero-=2); // incrementa 2 a var numero; 12 - 2 = 10;
    System.out.println(numero*=2); // incrementa a multiplicação por 2 do valor da var numero;
    System.out.println();

    System.out.println(valorLogico); // true
    System.out.println(!valorLogico + "\n"); // false

    // OPERADORES RELACIONAIS -> resultado 'true' ou 'false'

    System.out.println(valorA == valorB); // valorA (4) é igual a valorB (6)? false;
    System.out.println(34 != 35); // 34 é diferente de 35? true;
    System.out.println(valorA > valorB); // valorA é maior que valorB? false;
    System.out.println(valorA < valorB); //valorA é menor que valorB? true;
    System.out.println(200 >= 100); //200 é maior ou igual a 100? true;
    System.out.println(98 <= 98); // 98mé menor ou igual a 98? true;

    resultadoLogico = valorA == valorB;
    System.out.println("O valorA é igual ao valorB: " + resultadoLogico);

    if(valorA <= valorB)
      System.out.println("O valorA " + valorA + " é menor ou igual ao valorB " + valorB + ".");

    nomeUm = "Murilo";
    nomeDois = "Murilo";

    System.out.println(nomeUm == nomeDois);

    System.out.println(nomeUm == NomeTres); // dá false porque uma variável é diferente de um objeto, não são a mesma coisa mesmo com seus conteúdos iguais;
    System.out.println(nomeUm.equals(NomeTres)); // método equals() compara o CONTEÚDO dos dois, originando o true, pois os conteúdos são iguais;

    // OPERADOR TERNÁRIO ->  exemplo especificado lá no topo, nas declarações de variáveis;
    System.out.println(resultadoTernarioInt);
    System.out.println(resultadoTernarioString + "\n");

    // OPERADORES LÓGICOS
    if((numB == numA) && 6 > 5) // 'E'
      System.out.println("numB é igual a numA e 6 é maior que 5!");
    else
      System.out.println("A expressão lógica não é verdadeira.");

    if(!(numB == numA) && 6 > 5) // "NEGAÇÃO" DA CONDIÇÃO 1; 'E'
      System.out.println("numB é igual a numA e 6 é maior que 5!");
    else
      System.out.println("A expressão lógica não é verdadeira.");

    if ((numB == numA) || 6 > 5) // "OU"
      System.out.println("Uma das condições é verdadeira.");
  }
}

/*  OPERADORES
      - Atribuição ( = );
      - Aritméticos ( + - * / % ); operador + também concatena strings;
      - Unário ( + - ++ --)  -> positivo, negativo, incremento, decremento;
      - Relacionais ( == != > >= < <= );
      - Ternário ( <exp1> ? <casoTrue> : <casoFalse>) -> forma resumida para escolher um entre dois valores (true or false);
      - Lógicos (&& -> "E", || -> "OU", ! -> "NEGAÇÃO"); -> criar expressões lógicas;
*/