package br.com.pedrocpnsz.ativ_criacional.sistema_sanduiches;

public class Sanduiche {

    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean tomate;
    private String molho;

    public Sanduiche(Builder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.alface = builder.alface;
        this.tomate = builder.tomate;
        this.molho = builder.molho;
    }

    public String getPao() {
        return pao;
    }

    public String getCarne() {
        return carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public boolean isAlface() {
        return alface;
    }

    public boolean isTomate() {
        return tomate;
    }

    public String getMolho() {
        return molho;
    }

    @Override
    public String toString() {
        return "Sanduiche{"
                + "pao='" + pao + '\''
                + ", carne='" + carne + '\''
                + ", queijo='" + queijo + '\''
                + ", alface=" + alface
                + ", tomate=" + tomate
                + ", molho='" + molho + '\''
                + '}';
    }
}
