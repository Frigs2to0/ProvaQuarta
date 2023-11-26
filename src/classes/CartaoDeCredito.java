package classes;

public class CartaoDeCredito implements MetodoDePagamento{
    private String numero;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoDeCredito(String numero, String dataValidade, String codigoSeguranca) {
        this.numero = numero;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado com cartão de crédito.");
    }
}
