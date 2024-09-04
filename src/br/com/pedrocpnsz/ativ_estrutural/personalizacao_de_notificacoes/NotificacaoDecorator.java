package br.com.pedrocpnsz.ativ_estrutural.personalizacao_de_notificacoes;

public abstract class NotificacaoDecorator implements Notificacao {

    protected Notificacao notif;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notif = notificacao;
    }

    @Override
    public void enviar(String mensagem) {
        notif.enviar(mensagem);
    }
}
