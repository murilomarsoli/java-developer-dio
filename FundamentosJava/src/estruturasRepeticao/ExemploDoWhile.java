package estruturasRepeticao;

import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
    System.out.println("Chamando...");
    // Do-while: executa pelo menos uma vez, enquanto uma condição for válida;

    do{
      // executa repetidas vezes até alguém atender (até 'atendeu' do método 'celularTocando()' for true); 
      System.out.println("Celular tocando...");
    }while(celularTocando());

    System.out.println("Alô!!!");
  }

  private static boolean celularTocando() {
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu: " + atendeu);
    return !atendeu;
  }
}
