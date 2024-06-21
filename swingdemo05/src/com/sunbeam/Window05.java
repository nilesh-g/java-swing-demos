package com.sunbeam;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Window05 extends JFrame {
	private JTable productTable; 
	private DefaultTableModel productModel;
	private JScrollPane productScrollPane;
	
	public Window05() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Fifth Window");
		this.setLayout(null);	
		// initialize components
		Object[] colNames = { "Id", "Name", "Price" };
		productModel = new DefaultTableModel(colNames, 0);
		for (int i = 1; i <= 8; i++) {
			Object[] row = { i, "Prod"+i, i*100.0 };
			productModel.addRow(row);
		}
		productTable = new JTable(productModel);
		
		productScrollPane = new JScrollPane(productTable);
		productScrollPane.setBounds(100, 100, 300, 100);
		this.add(productScrollPane);
		
		ListSelectionModel tableSelectionModel = productTable.getSelectionModel();
		tableSelectionModel.addListSelectionListener(new ListSelectionListener() {	
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting() == false) {
					int index = productTable.getSelectedRow();
					if(index != -1) {
						int id = (Integer)productModel.getValueAt(index, 0);
						String name = (String) productModel.getValueAt(index, 1);
						double price = (Double)productModel.getValueAt(index, 2);
						System.out.println("Selected Row: " + id + ". " + name + " - " + price);
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Window05 w = new Window05();
		w.setSize(600, 400);
		w.setVisible(true);
	}
}
