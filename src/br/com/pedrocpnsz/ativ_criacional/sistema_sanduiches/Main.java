package br.com.pedrocpnsz.ativ_criacional.sistema_sanduiches;

public class Main {

    public static void main(String[] args) {
        Sanduiche sanduicheBasico = new Builder()
                .setPao("Pao Branco")
                .setCarne("Presunto")
                .build();

        System.out.println("Sanduiche basico: " + sanduicheBasico);

        Sanduiche sanduicheCompleto = new Builder()
                .setPao("Pao Integral")
                .setCarne("Peito de frango")
                .setQueijo("Queijo cheddar")
                .setAlface(true)
                .setTomate(true)
                .setMolho("Molho barbecue")
                .build();

        System.out.println("Sanduiche completo: " + sanduicheCompleto);
    }
}
