package br.com.pedrocpnsz.ativ_comportamental.plataforma_de_noticias;

public class Leitor implements Observer {

    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println(nome + " recebeu a nova noticia: " + noticia);
    }
    
}
