package br.com.pedrocpnsz.ativ_estrutural.gerenciamento_de_biblioteca;

public class Main {

    public static void main(String[] args) {

        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.buscarEEmprestarLivro("Harry Potter", "Juquinha");
    }

}
