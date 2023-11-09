package fundamentosJava;
public class A1varMetodos {
    public static void main(String[] args) {
        // Declaração de variáveis String
        String primeiroNome = "Murilo";
        String segundoNome = "Marsoli";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); /* variável = método*/

        System.out.println(nomeCompleto); //println imprime a string e pula uma linha;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    } // Método por parâmetro e formas de concatenar strings.
}

// Organização dos arquivos do projeto java em "pacotes" (packages) para melhor organização.
  
  // Packages = subdiretórios;

// CONVENÇÃO PARA A CRIAÇÃO DE PREFIXOS DOS PACOTES DE ORGANIZAÇÃO:

  // Para fins organizacionais: org.
  // Para fins comerciais: com.
  // Para fim didáticos: edu.

// Java Beans: diz respeito às convenções universais de escrita da linguagem Java para ser compreendíveis por todos.

  //VARIÁVEIS
    // singular; (a não ser q sejam arrays)
    // idioma único; (a maioria dos projetos requisitam o idioma inglês)
    // não abreviar a variável;

  // MÉTODOS
    // nomeados como verbos;
    // nomear de acordo com a função; (um único verbo)
    // convenção "camelCase";}
