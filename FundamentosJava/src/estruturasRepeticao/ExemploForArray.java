package estruturasRepeticao;

public class ExemploForArray {
	  public static void main(String[] args) {
	    String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
	    int testeInt[] = {2, 4, 7, 3, 2, 15, 89};

	    //FOR CONVENCIONAL
	    // int i;
	    // for(i = 0; i < alunos.lenght; i++){} // alunos.lenght = vai pegar automaticamente o tamanho do vetor alunos;
	    for(int i = 0; i < 4; i++){
	      System.out.println("Aluno no indice " + i + " é a(o) " + alunos[i] + ".");
	    }
	    System.out.println();

	    // FOR EACH = percorre o array automaticamente sem a declaração do índice
	    // for(<tipoArray> <identificador> : <nomeArray>){}
	    for(String aluno : alunos){
	      System.out.println("Aluno" + " = " + aluno);
	    }
	    System.out.println();

	    for(int num : testeInt){
	      System.out.println("Número = " + num);
	    }
	  }
	}