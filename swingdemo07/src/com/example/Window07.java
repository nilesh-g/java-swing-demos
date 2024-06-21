package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window07 extends JFrame {
	private JButton loginButton;
	
	public Window07() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Seventh Window");
		this.setLayout(null);	
		// initialize components
		loginButton = new JButton("Login");
		loginButton.setBounds(250, 150, 100, 30);
		this.add(loginButton);
		loginButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginDialog dialog = new LoginDialog();
				dialog.setModal(true);
				dialog.setVisible(true);
				String name = dialog.getName();
				String passwd = dialog.getPassword();
				String msg = "Entered Name: " + name + " and Password: " + passwd ;
				JOptionPane.showMessageDialog(Window07.this, msg);
			}
		});
	}
	
	public static void main(String[] args) {
		Window07 w = new Window07();
		w.setSize(600, 400);
		w.setVisible(true);
	}
}
