package br.com.pedrocpnsz.ativ_comportamental.calculo_de_descontos;

public class DescontoTemporada implements EstrategiaDesconto {

    private double desconto;

    public DescontoTemporada(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * desconto;
    }
    
}
