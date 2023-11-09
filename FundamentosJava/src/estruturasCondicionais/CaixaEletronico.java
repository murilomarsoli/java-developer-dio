package estruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        System.out.println("Saldo = " + saldo);
        System.out.println("Valor solicitado = " + valorSolicitado);

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo = " + saldo);
        }else{
            System.out.println("\nSaldo insuficiente.");
        }
        
    }
}