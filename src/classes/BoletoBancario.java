package classes;

public class BoletoBancario implements MetodoDePagamento {
    private String numeroBoleto;

    public BoletoBancario(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado com boleto bancário. Boleto: " + numeroBoleto);
    }
}
