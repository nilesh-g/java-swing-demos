package com.sunbeam;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Window04 extends JFrame {
	private DefaultListModel<String> hobbyListModel;
	private JList<String> hobbyList;
	private JScrollPane hobbyScrollPane;
	public Window04() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Fourth Window");
		this.setLayout(null);	
		// initialize components
		hobbyListModel = new DefaultListModel<>();
		for (int i = 1; i <= 9; i++)
			hobbyListModel.addElement("Hobby" + i);
		hobbyList = new JList<String>(hobbyListModel);
		
		hobbyScrollPane = new JScrollPane(hobbyList);
		hobbyScrollPane.setBounds(100, 100, 80, 100);
		this.add(hobbyScrollPane);
		
		ListSelectionModel hobbySelectionModel = hobbyList.getSelectionModel();
		hobbySelectionModel.addListSelectionListener(new ListSelectionListener() {		
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting() == false) {
					int index = hobbyList.getSelectedIndex();
					String value = hobbyList.getSelectedValue();
					System.out.println("Hobby Selected: " + index + ". " + value);
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Window04 w = new Window04();
		w.setSize(600, 400);
		w.setVisible(true);
	}
}
