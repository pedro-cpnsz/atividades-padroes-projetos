package br.com.pedrocpnsz.ativ_comportamental.plataforma_de_noticias;

public interface Sujeito {
    void adicionarObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificarObservadores();
}
