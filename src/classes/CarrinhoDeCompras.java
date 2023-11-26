package classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private static CarrinhoDeCompras instance;
    private List<Produto> itens;
    private List<Observer> observadores;

    private CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }
    public static CarrinhoDeCompras getInstance() {
        if (instance == null) {
            instance = new CarrinhoDeCompras();
        }
        return instance;
    }
    public void adicionarItem(Produto produto) {
        itens.add(produto);
        notificarObservadores();
    }

    public void mostrarCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (Produto produto : itens) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
        notificarObservadores();
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        notificarObservadores();
        return total;
    }
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar();
        }
    }
}
