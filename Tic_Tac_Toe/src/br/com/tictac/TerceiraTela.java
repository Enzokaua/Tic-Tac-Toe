package br.com.tictac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TerceiraTela extends JFrame {
	public TerceiraTela() {
		setTitle("Multiplayer");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		JPanel telaDoisJogadores = new JPanel();
		telaDoisJogadores.setLayout(null);
		JLabel titulo = new JLabel("Jogador 1, escolha: ");
		titulo.setBounds(230, 30, 150, 15);
		JButton x = new JButton("X");
		JButton y = new JButton("O");
		x.setBounds(33, 75, 250, 50);

		x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == x) {
					new QuartaTelaCenario1();	
					
				}


			}
		});

		y.setBounds(316, 75, 250, 50);

		y.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new QuartaTelaCenario2();
				
			}
		});

		telaDoisJogadores.add(y);
		telaDoisJogadores.add(x);
		telaDoisJogadores.add(titulo);
		add(telaDoisJogadores);
		setVisible(true);
	}

}
