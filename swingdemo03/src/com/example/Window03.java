package com.example;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Window03 extends JFrame {
	private JComboBox<String> subjectComboBox;
	private DefaultComboBoxModel<String> subjectComboModel;
	
	public Window03() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Third Window");
		this.setLayout(null);
	
		// initialize components
		String[] subjects = { "Java", "Big Data", "Database", "Linux" };
		subjectComboModel = new DefaultComboBoxModel<>(subjects);
		subjectComboBox = new JComboBox<>(subjectComboModel);
		subjectComboBox.setBounds(100, 100, 100, 30);
		this.add(subjectComboBox);
		subjectComboBox.setSelectedIndex(2);
		subjectComboBox.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					String item = (String) e.getItem();
					System.out.println("Selected Item: " + item);
					int index = subjectComboBox.getSelectedIndex();
					System.out.println("Selected Index: " + index);
					item = (String) subjectComboBox.getSelectedItem();
					System.out.println("Selected Item: " + item);
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Window03 w = new Window03();
		w.setSize(600, 400);
		w.setVisible(true);
	}

}
