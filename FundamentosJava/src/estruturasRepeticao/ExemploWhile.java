package estruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile{
  public static void main(String[] args) {
    double mesada = 50.00;
    double valorDoce = valorAleatorio();
    int quantidadeDoce = 0;

    // While sempre inicia se sua condição inicial for verdadeira;
    while(mesada > 0){
      System.out.println("Valor do doce: R$" + valorDoce);
      mesada = mesada - valorDoce;
      quantidadeDoce++;
    }

    System.out.println("\nQuantidade de doces comprados: " + quantidadeDoce);
    System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    if(mesada < 0){
      System.out.println("E ainda ficou devendo R$" + -mesada);
    }
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}


