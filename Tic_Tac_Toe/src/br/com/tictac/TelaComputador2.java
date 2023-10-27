package br.com.tictac;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaComputador2 extends JFrame {
    private JButton UXU;
    private JButton UXD;
    private JButton UXT;
    private JButton DXU;
    private JButton DXD;
    private JButton DXT;
    private JButton TXU;
    private JButton TXD;
    private JButton TXT;
    private char currentPlayer = 'O';
    
    public TelaComputador2() {
        setTitle("Computador");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel telaDeGame = new JPanel();
        telaDeGame.setLayout(null);
        
        UXU = new JButton(" ");
        UXD = new JButton(" ");
        UXT = new JButton(" ");
        DXU = new JButton(" ");
        DXD = new JButton(" ");
        DXT = new JButton(" ");
        TXU = new JButton(" ");
        TXD = new JButton(" ");
        TXT = new JButton(" ");
        JButton Reinicia = new JButton("Reiniciar");

        UXU.setBounds(50, 20, 250, 50);
        UXD.setBounds(50, 90, 250, 50);
        UXT.setBounds(50, 160, 250, 50);
        DXU.setBounds(320, 20, 250, 50);
        DXD.setBounds(320, 90, 250, 50);
        DXT.setBounds(320, 160, 250, 50);
        TXU.setBounds(590, 20, 250, 50);
        TXD.setBounds(590, 90, 250, 50);
        TXT.setBounds(590, 160, 250, 50);
        Reinicia.setBounds(320, 250, 250, 50);

        ActionListener buttonClickListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (clickedButton.getText().equals(" ")) {
                clickedButton.setText(String.valueOf(currentPlayer));
                
                if (!hasPlayerWon("O") || hasPlayerWon("X")) {
                    iteracaoComputador();
                }

                if (hasPlayerWon("X")) {
                    new SextaTela();
                }
                if (hasPlayerWon("O")) {
                    new QuintaTela();
                }
            }
        }
    };
    

        Reinicia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetTexts();
            }
        });

        UXU.addActionListener(buttonClickListener);
        UXD.addActionListener(buttonClickListener);
        UXT.addActionListener(buttonClickListener);
        DXU.addActionListener(buttonClickListener);
        DXD.addActionListener(buttonClickListener);
        DXT.addActionListener(buttonClickListener);
        TXU.addActionListener(buttonClickListener);
        TXD.addActionListener(buttonClickListener);
        TXT.addActionListener(buttonClickListener);

        telaDeGame.add(UXU);
        telaDeGame.add(UXD);
        telaDeGame.add(UXT);
        telaDeGame.add(DXU);
        telaDeGame.add(DXD);
        telaDeGame.add(DXT);
        telaDeGame.add(TXU);
        telaDeGame.add(TXD);
        telaDeGame.add(TXT);
        telaDeGame.add(Reinicia);
        add(telaDeGame);
        
        resetTexts();
        setVisible(true);
    }

    private boolean hasPlayerWon(String player) {
        return
            (UXU.getText().equals(player) && UXD.getText().equals(player) && UXT.getText().equals(player)) ||
            (DXU.getText().equals(player) && DXD.getText().equals(player) && DXT.getText().equals(player)) ||
            (TXU.getText().equals(player) && TXD.getText().equals(player) && TXT.getText().equals(player)) ||
            (UXU.getText().equals(player) && DXU.getText().equals(player) && TXU.getText().equals(player)) ||
            (UXD.getText().equals(player) && DXD.getText().equals(player) && TXD.getText().equals(player)) ||
            (UXT.getText().equals(player) && DXT.getText().equals(player) && TXT.getText().equals(player)) ||
            (UXU.getText().equals(player) && DXD.getText().equals(player) && TXT.getText().equals(player)) ||
            (UXT.getText().equals(player) && DXD.getText().equals(player) && TXU.getText().equals(player));
    }

    private Integer valorRandom (){
        Random random = new Random();
        int valorAleatorio = random.nextInt(9) + 1;
        return valorAleatorio;
    }

    private void iteracaoComputador(){
        int randomButton = valorRandom();
        JButton selectedButton = null;
    
        switch(randomButton){
            case 1:
                selectedButton = UXU;
                break;
            case 2:
                selectedButton = UXD;
                break;
            case 3:
                selectedButton = UXT;
                break;
            case 4:
                selectedButton = DXU;
                break;
            case 5:
                selectedButton = DXD;
                break;
            case 6:
                selectedButton = DXT;
                break;
            case 7:
                selectedButton = TXU;
                break;
            case 8:
                selectedButton = TXD;
                break;
            case 9:
                selectedButton = TXT;
                break;
        }
    
        if (selectedButton != null && selectedButton.getText().equals(" ")) {
            selectedButton.setText("X");
        } else {
            iteracaoComputador();
        }
    }
    

    private void resetTexts() {
        UXU.setText(" ");
        UXD.setText(" ");
        UXT.setText(" ");
        DXU.setText(" ");
        DXD.setText(" ");
        DXT.setText(" ");
        TXU.setText(" ");
        TXD.setText(" ");
        TXT.setText(" ");
    }
}
