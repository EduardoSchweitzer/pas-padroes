package view;

import java.util.ArrayList;

import javax.swing.*;

import model.Product;

public class ProductListDecorator extends JList {
	
	private ArrayList<String> list;
	private JTextArea text;
	
	public ProductListDecorator(ArrayList<String> list) {
		super(list.toArray());
		this.list = list;
		this.text = new JTextArea();
		setBounds(20,20,200,100);
	}

}
