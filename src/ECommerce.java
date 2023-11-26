import classes.*;

import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras cc = CarrinhoDeCompras.getInstance();
        AgenteLogistico cliente1 = new AgenteLogistico("Cliente 1");

        String novoNomeCliente1 = new String("Cliente 1");

        cc.adicionarObservador(cliente1);

        while (true) {
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Mostrar carrinho");
            System.out.println("3. Finalizar compra");
            System.out.println("4. Pagar com cartão de crédito");
            System.out.println("5. Pagar com boleto bancário");
            System.out.println("6. Alterar nome do " + novoNomeCliente1);
            System.out.println("7. Sair");
            System.out.println("");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite o preço do produto:");
                    double precoProduto = scanner.nextDouble();
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    cc.adicionarItem(produto);

                    break;
                case 2:
                    cc.mostrarCarrinho();
                    System.out.println("Total: R$" + cc.calcularTotal());
                    break;
                case 3:
                    double totalCompra = cc.calcularTotal();
                    System.out.println("Compra finalizada. Total: R$" + totalCompra);
                    break;
                case 4:
                    System.out.println("Digite o número do cartão de crédito:");
                    String numeroCartao = scanner.next();
                    System.out.println("Digite a data de validade do cartão:");
                    String dataValidadeCartao = scanner.next();
                    System.out.println("Digite o código de segurança do cartão:");
                    String codigoSegurancaCartao = scanner.next();

                    CartaoDeCredito cartao = new CartaoDeCredito(numeroCartao, dataValidadeCartao, codigoSegurancaCartao);
                    cartao.processarPagamento(cc.calcularTotal());
                    break;
                case 5:
                    System.out.println("Digite o número do boleto bancário:");
                    String numeroBoleto = scanner.next();

                    BoletoBancario boleto = new BoletoBancario(numeroBoleto);
                    boleto.processarPagamento(cc.calcularTotal());
                    break;

                case 6:
                    System.out.println("Digite o novo nome para o " + novoNomeCliente1 + ":");
                    novoNomeCliente1 = scanner.next();
                    cliente1.setNome(novoNomeCliente1);
                    System.out.println("Nome do Cliente alterado para: " + novoNomeCliente1);
                    break;

                case 7:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}