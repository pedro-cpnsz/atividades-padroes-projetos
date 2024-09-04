package br.com.pedrocpnsz.ativ_estrutural.personalizacao_de_notificacoes;

public class AppNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando pelo app: " + mensagem);
    }
}
