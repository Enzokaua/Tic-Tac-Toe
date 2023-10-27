package br.com.tictac;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuintaTela extends JFrame{

	public QuintaTela() {
		setTitle("Vitória!");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel telaVitoria = new JPanel();
        telaVitoria.setLayout(null);
        JLabel tituloDerrota = new JLabel("Jogar novamente?");
        tituloDerrota.setBounds(230, 30, 150, 15);
        JButton continuar = new JButton("Sim");
        JButton parar = new JButton("Sair");
        continuar.setBounds(33, 75, 250, 50);
        parar.setBounds(316, 75, 250, 50);
        
        parar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	telaVitoria.setVisible(false);
            }
        });
        
        
        continuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaInicial();
            }
        });
        
        telaVitoria.add(parar);
        telaVitoria.add(continuar);
        telaVitoria.add(tituloDerrota);
        add(telaVitoria);
        setVisible(true);
	}
	
}
