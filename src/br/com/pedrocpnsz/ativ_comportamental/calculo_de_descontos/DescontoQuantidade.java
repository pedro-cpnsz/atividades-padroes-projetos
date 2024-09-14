package br.com.pedrocpnsz.ativ_comportamental.calculo_de_descontos;

public class DescontoQuantidade implements EstrategiaDesconto {

    private int quantidadeLimite;
    private double desconto;

    public DescontoQuantidade(int quantidadeLimite, double desconto) {
        this.quantidadeLimite = quantidadeLimite;
        this.desconto = desconto;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor >= quantidadeLimite ? valor * desconto : 0;
    }
    
}
