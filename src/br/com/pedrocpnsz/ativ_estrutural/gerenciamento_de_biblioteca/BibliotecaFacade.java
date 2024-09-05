package br.com.pedrocpnsz.ativ_estrutural.gerenciamento_de_biblioteca;

public class BibliotecaFacade {
    
    private CatalogoDeLivros catalogo;
    private RegistroDeUsuarios usuarios;
    private GerenciamentoDeEmprestimos emprestimos;
    private Notificacoes notificacoes;

    public BibliotecaFacade() {
        this.catalogo = new CatalogoDeLivros();
        this.usuarios = new RegistroDeUsuarios();
        this.emprestimos = new GerenciamentoDeEmprestimos();
        this.notificacoes = new Notificacoes();
    }
    
    public void buscarEEmprestarLivro(String titulo, String usuario) {
        catalogo.buscarLivro(titulo);
        usuarios.registrarUsuario(usuario);
        emprestimos.emprestarLivro(titulo, usuario);
        notificacoes.enviarNotificacao("O livro '" + titulo + "' foi emprestado para " + usuario);
    }
}
