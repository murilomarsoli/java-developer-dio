package tratamentoExcessoes;

public class ExemploExcecao {
  public static void main(String[] args) {
    
    // Checked Exceptions: já é detectada imediatamente pela classe, são obrigadas a serem tratadas;

    // Unchecked Exceptions: não tão recorrentes, podemos tratar opcionalmente de acordo com o que queremos na nossa aplicação;

    Number valor = Double.valueOf("a1.75"); // Unchecked Exception
    System.out.println(valor); 

    /* try {
      Number valor2 = NumberFormat.getInstance().parse("a1.75"); // Checked exception
    } catch (ParseException e) {
      e.printStackTrace();
    } */
    
  }
}
