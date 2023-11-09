package estruturasCondicionais;

public class ResultadoEscolar {
	  public static void main(String[] args) {
	    double nota = 5.0;

	    // CONDICIONAL TERNÁRIA
	    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

	    System.out.println(resultado);

	    // CONDICIONAL SIMPLES
	/*     if(nota >= 7)
	        System.out.println("Aprovado"); */

	    // CONDICIONAL COMPOSTA
	/*     if(nota >= 7)
	        System.out.println("Aprovado");
	      else
	        System.out.println("Reprovado"); */

	    // CONDICIONAL ENCADEADA
	    if (nota >= 7)
	      System.out.println("Aprovado");
	    else if(nota >= 5 && nota < 7)
	      System.out.println("Recuperação");
	    else
	      System.out.println("Reprovado");
	  }
	}
