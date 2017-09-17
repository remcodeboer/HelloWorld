package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main extends JFrame implements ActionListener {

	private JPanel panel;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setSize(600, 600);
		frame.createGUI();
		frame.setVisible(true);
	}

	private JButton button1;
	private JTextField TextField1, TextField2;

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 400));
		window.add(panel);
		button1 = new JButton("Klik niet op mij!");
		window.add(button1);
		button1.addActionListener(this);
		TextField1 = new JTextField("x",10);
		TextField2 = new JTextField("y",10);
		window.add(TextField1);
		window.add(TextField2);

	}

	public void actionPerformed(ActionEvent event) {
		Graphics paper = panel.getGraphics();
		paper.clearRect(0,0,600,400);
		paper.setColor(Color.black);
		paper.drawLine(parseInt(TextField1.getText())+15, parseInt(TextField2.getText())+15, parseInt(TextField1.getText())-10, parseInt(TextField2.getText())-10);
		paper.drawLine(parseInt(TextField1.getText())+15, parseInt(TextField2.getText())+85, parseInt(TextField1.getText())-10, parseInt(TextField2.getText())+110);
		paper.setColor(Color.blue);
		paper.fillOval(parseInt(TextField1.getText()),parseInt(TextField2.getText()),100,100);
		paper.setColor(Color.red);
		paper.fillOval(parseInt(TextField1.getText())-50,parseInt(TextField2.getText())-50,50,50);
		paper.fillOval(parseInt(TextField1.getText())-50,parseInt(TextField2.getText())+100,50,50);

	}
}
