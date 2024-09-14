package br.com.pedrocpnsz.ativ_comportamental.calculo_de_descontos;

public class CarrinhoDeCompras {

    private double valorTotal;
    private EstrategiaDesconto estrategiaDesconto;

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularValorFinal() {
        double desconto = estrategiaDesconto.calcularDesconto(valorTotal);
        return valorTotal - desconto;
    }
}
