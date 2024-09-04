package br.com.pedrocpnsz.ativ_estrutural.personalizacao_de_notificacoes;

public abstract class LogAuditoriaDecorator extends NotificacaoDecorator {

    protected Notificacao notif;

    public LogAuditoriaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar("Log de auditoria: " + mensagem);
    }
    
}
