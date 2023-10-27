package br.com.tictac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class TelaInicial extends JFrame {

	public TelaInicial() {
        setTitle("Tic Tac Toe");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel telaInicial = new JPanel();
        telaInicial.setLayout(null);
        JLabel titulo = new JLabel("Escolha uma modalidade: ");
        titulo.setBounds(230, 30, 150, 15);
        JButton multiPlayer = new JButton("2 Jogadores");
        JButton computGame = new JButton("Computador");
        multiPlayer.setBounds(33, 75, 250, 50);
        computGame.setBounds(316, 75, 250, 50);

        multiPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TerceiraTela();
            }
        });
        
        computGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SegundaTela();

            }
        });

        telaInicial.add(titulo);
        telaInicial.add(multiPlayer);
        telaInicial.add(computGame);
        add(telaInicial);
        setVisible(true);
   
          }   
          
         
}
