package br.com.pedrocpnsz.ativ_comportamental.plataforma_de_noticias;

import java.util.ArrayList;
import java.util.List;

public class Noticia implements Sujeito {

    private List<Observer> observadores;
    private String conteudo;

    public Noticia() {
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.atualizar(conteudo);
        }
    }

    public void publicarNoticia(String conteudo) {
        this.conteudo = conteudo;
        notificarObservadores();
    }
    
}
