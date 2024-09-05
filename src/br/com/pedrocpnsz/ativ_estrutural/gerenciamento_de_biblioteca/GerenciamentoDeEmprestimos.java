package br.com.pedrocpnsz.ativ_estrutural.gerenciamento_de_biblioteca;

public class GerenciamentoDeEmprestimos {
    
    public void emprestarLivro(String titulo, String usuario) {
        System.out.println("Emprestando o livro '" + titulo + "' para o usuario " + usuario);
    }

    public void devolverLivro(String titulo, String usuario) {
        System.out.println("Devolvendo o livro '" + titulo + "' do usuario " + usuario);
    }
    
}
