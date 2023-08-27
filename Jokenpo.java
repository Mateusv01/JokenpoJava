package principal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class Jokenpo extends JFrame implements ActionListener{
	
	JPanel panel, panelresult, panelplacar;
	JButton button, button2, button3;
	JCheckBox checkBox;
	ImageIcon icon, icon2, icon3, iconpc1, monitor;
	JLabel question, placar,j1,pc,ept;
	int jogador, computador;
	int pj=0;
	int ppc=0;
	int empate=0;


	
	Jokenpo(){
		
		ImageIcon icon = new ImageIcon("JokenpoPapel.png");
		ImageIcon icon2 = new ImageIcon("JokenpoPedra.png");
		ImageIcon icon3 = new ImageIcon("JokenpoTesoura.png");

		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panelresult = new JPanel();
		panelresult.setLayout(new FlowLayout());
		panelplacar = new JPanel();
		panelplacar.setLayout(new FlowLayout());
		
		
		
		
		
	

		
		question = new JLabel("Faça Sua Escolha");
		panelresult.add(question);
		
		placar = new JLabel("Placar: ");
		j1 = new JLabel("J1: 0");
		ept = new JLabel("Empate: 0");
		pc = new JLabel("PC: 0");
		panelplacar.add(placar);
		panelplacar.add(j1);
		panelplacar.add(ept);
		panelplacar.add(pc);
		
		button = new JButton();
		button.setFocusable(false);
		button.setIcon(icon);
		button.addActionListener(this);
		button.setBackground(Color.WHITE);


		button2 = new JButton();
		button2.setFocusable(false);
		button2.setIcon(icon2);
		button2.addActionListener(this);
		button2.setBackground(Color.WHITE);
		
		button3 = new JButton();
		button3.setFocusable(false);
		button3.setIcon(icon3);
		button3.addActionListener(this);
		button3.setBackground(Color.WHITE);
		

		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);


		this.setTitle("Jokenpo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		this.add(panelresult, BorderLayout.NORTH);
		this.add(panelplacar, BorderLayout.SOUTH);
		

		this.setSize(500, 500);
	 	
		

		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			jogador = 1;
			
		}
		if(e.getSource() == button2) {
			jogador = 2;
		}
		if(e.getSource() == button3) {
			jogador = 3;
		}
		switch(jogador) {
		case 1:
			//System.out.println("Jogador escolheu Papel");
			break;
		case 2:
			//System.out.println("Jogador escolheu Pedra");
			break;
		case 3:
			//System.out.println("Jogador escolheu Tesoura");
			break;
		}
		
		
		
		
		
		computador = (int)(Math.random()*3 + 1);
		switch(computador) {
		case 1:
			//System.out.println("Computador escolheu papel");
			break;
		case 2:
			//System.out.println("Computador escolheu pedra");
			break;
		case 3:
			//System.out.println("Computador escolheu tesoura");
			break;
		}

		
		
		if (jogador == computador) {
			JOptionPane.showMessageDialog(null, "Empate");
			empate++;
			atualizar();
		}
		else if ((jogador == 1 && computador == 2) || (jogador == 2 && computador == 3) || ((jogador == 3 && computador == 1))){
			JOptionPane.showMessageDialog(null, "Vitoria!");
			pj++;
			atualizar();
			if (pj == 3) {
				JOptionPane.showMessageDialog(null, "Vitoria do Jogador!!");
				this.setVisible(false);
			};
		}
		else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || ((jogador == 3 && computador == 2))) {
			JOptionPane.showMessageDialog(null, "Derrota!");
			 ppc++;
			atualizar();
			if (ppc == 3) {
				JOptionPane.showMessageDialog(null, "Derrota do Jogador!!");
				this.setVisible(false);
			};
		}
		
		}

	public void atualizar() {
		pc.setText("PC: " + ppc);
		ept.setText("Empate: " + empate);
		j1.setText("J1: " + pj);
	}
	

		
		
		
		
		
		
	}

