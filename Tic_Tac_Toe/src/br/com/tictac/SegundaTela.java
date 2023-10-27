package br.com.tictac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SegundaTela extends JFrame{
	public SegundaTela() {
		setTitle("1 vs Computador");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel telaUmJogador = new JPanel();
        telaUmJogador.setLayout(null);
        JLabel titulo = new JLabel("Escolha um símbolo: ");
        titulo.setBounds(230, 30, 150, 15);
        JButton x = new JButton("X");
        JButton y = new JButton("O");
        x.setBounds(33, 75, 250, 50);
        y.setBounds(316, 75, 250, 50);
        
        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaComputador1();
            }
        });
        
        
        y.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaComputador2();
            }
        });
        
        telaUmJogador.add(y);
        telaUmJogador.add(x);
        telaUmJogador.add(titulo);
        add(telaUmJogador);
        setVisible(true);
	}
	
}
