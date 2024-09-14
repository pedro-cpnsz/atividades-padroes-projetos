package br.com.pedrocpnsz.ativ_criacional.sistema_sanduiches;

public class Builder {

    public String pao, carne, queijo, molho;
    public boolean alface, tomate;

    public Builder setPao(String pao) {
        this.pao = pao;
        return this;
    }

    public Builder setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public Builder setQueijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    public Builder setAlface(boolean alface) {
        this.alface = alface;
        return this;
    }

    public Builder setTomate(boolean tomate) {
        this.tomate = tomate;
        return this;
    }

    public Builder setMolho(String molho) {
        this.molho = molho;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(this);
    }
}
