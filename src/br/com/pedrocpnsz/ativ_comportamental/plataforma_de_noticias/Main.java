package br.com.pedrocpnsz.ativ_comportamental.plataforma_de_noticias;

public class Main {
    
    public static void main(String[] args) {
        Noticia noticia = new Noticia();

        Leitor leitor1 = new Leitor("Robertinho");
        Leitor leitor2 = new Leitor("Laurinha");
        Jornalista jornalista1 = new Jornalista("Andre");

        noticia.adicionarObservador(leitor1);
        noticia.adicionarObservador(leitor2);
        noticia.adicionarObservador(jornalista1);

        noticia.publicarNoticia("Semana de provas a caminho!");
    }
}

