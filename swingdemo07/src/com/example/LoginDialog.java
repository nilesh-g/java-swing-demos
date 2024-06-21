package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	private JButton submitButton;
	private String name="";
	private String password="";
	public LoginDialog() {
		// initialize window
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("Login");
		this.setSize(320, 250);
		this.setLayout(null);	
		// initialize components
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(50, 50, 80, 30);
		this.add(nameLabel);

		nameTextField = new JTextField();
		nameTextField.setBounds(150, 50, 120, 30);
		this.add(nameTextField);

		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50, 100, 80, 30);
		this.add(passwordLabel);

		passwordTextField = new JTextField();
		passwordTextField.setBounds(150, 100, 120, 30);
		this.add(passwordTextField);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(100, 150, 100, 30);
		this.add(submitButton);
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				name = nameTextField.getText();
				password = passwordTextField.getText();
				LoginDialog.this.dispose();
			}
		});
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
}
