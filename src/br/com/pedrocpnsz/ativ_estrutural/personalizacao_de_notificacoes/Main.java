package br.com.pedrocpnsz.ativ_estrutural.personalizacao_de_notificacoes;

public class Main {

    public static void main(String[] args) {

        Notificacao emailNotificacao = new EmailNotificacao();
        Notificacao emailCriptografadoComLog = new LogAuditoriaDecorator(new CriptografiaDecorator(emailNotificacao) {}) {};
        emailCriptografadoComLog.enviar("Mensagem importante");

        Notificacao smsNotificacao = new SMSNotificacao();
        smsNotificacao.enviar("Mensagem simples");
        
        Notificacao appNotificacao = new AppNotificacao();
        Notificacao appLogAuditavel = new LogAuditoriaDecorator(appNotificacao) {};
        appLogAuditavel.enviar("Notificacao mobile.");
        
    }

}
