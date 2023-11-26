package classes;

public class AgenteLogistico implements Observer {
    private String nome;

    public AgenteLogistico(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar() {
        System.out.println(nome + ": Recebi uma notificação!");
    }

    public void setNome(String novoNomeCliente1) {
        System.out.println("Observer Atualizou!");
    }
}

