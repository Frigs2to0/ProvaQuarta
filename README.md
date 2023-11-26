# ProvaQuarta
![image](https://github.com/Frigs2to0/ProvaQuarta/assets/96925831/f9fdd089-3870-46ee-bac7-5eaa1e603283)


Singleton: Estou utilizando na classe carrinhoDeCompras, criando uma instância única dele, utilizei
essa instancia na ECommerce(main) "CarrinhoDeCompras cc = CarrinhoDeCompras.getInstance();", fiz um
menu com while e depois switch.

Injeção de Depência: Dentro do switch, eu chamo a var "cc" e por ela aplico a interface "MetodoDePagamento"
que extende CartaoDeCredito e BoletoBancario, no caso "cc" é uma instancia do carrinho de compras.
EX: "cartao.processarPagamento(cc.calcularTotal());"

Observer: Comecei fazendo uma interface "Observer" e depois apliquei ela na classe "AgenteLogistico", que basicamente
é responsável por atualizar o nome do cliente, podendo mudar para Guilherme, assim alterando o nome sem interferir no
carrinho de compras. Também utilizei na classe "CarrinhoDeCompras" para sempre que algum dos metodos for utilizado ele
mande uma notificação no terminal.  
