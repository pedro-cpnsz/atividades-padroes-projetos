package br.com.pedrocpnsz.ativ_comportamental.calculo_de_descontos;

public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(100.0);

        carrinho.setEstrategiaDesconto(new DescontoQuantidade(75, 0.1));
        System.out.println("Com desconto por quantidade: " + carrinho.calcularValorFinal());

        carrinho.setEstrategiaDesconto(new DescontoTemporada(0.15));
        System.out.println("Com desconto de temporada: " + carrinho.calcularValorFinal());

        carrinho.setEstrategiaDesconto(new DescontoMembroVIP(0.25));
        System.out.println("Com desconto de membro VIP: " + carrinho.calcularValorFinal());
    }
}
