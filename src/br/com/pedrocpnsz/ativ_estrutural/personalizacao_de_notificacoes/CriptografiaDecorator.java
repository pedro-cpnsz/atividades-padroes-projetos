package br.com.pedrocpnsz.ativ_estrutural.personalizacao_de_notificacoes;

public abstract class CriptografiaDecorator extends NotificacaoDecorator {

    protected Notificacao notif;

    public CriptografiaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar("Criptografado: " + mensagem);
    }
    
}
