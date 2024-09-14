package br.com.pedrocpnsz.ativ_comportamental.calculo_de_descontos;

public class DescontoMembroVIP implements EstrategiaDesconto {

    private double descontoFixo;

    public DescontoMembroVIP(double descontoFixo) {
        this.descontoFixo = descontoFixo;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * descontoFixo;
    }
    
}
