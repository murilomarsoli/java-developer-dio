package tratamentoExcessoes;

public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23765064");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("CEP inválido.");
    }
  }
  
  static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
      // disparará nossa nova exceção criada
      throw new CepInvalidoException();  
    // simulando um cep formatado;
    return "23.765-064";
  }
}
