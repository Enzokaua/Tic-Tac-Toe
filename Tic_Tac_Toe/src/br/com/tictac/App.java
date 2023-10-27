package br.com.tictac;

import javax.swing.SwingUtilities;

public class App{

	public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new TelaInicial();
        });
		
	}

}
