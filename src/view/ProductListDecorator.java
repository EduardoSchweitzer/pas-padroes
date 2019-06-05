package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.Product;

public class ProductListDecorator extends JFrame{
	
	private ArrayList<Product> list;
	private JTextArea text;
	
	public ProductListDecorator(ArrayList<Product> list) {
		super("Produtos");
		this.list = list;
		this.text = new JTextArea();
		fill();
		JScrollPane rollPanel = new JScrollPane(text);
		getContentPane().add(rollPanel);
		setBounds(20,20,200,100);
	}
	
	private void fill() {
		for(Product p : list) {
			text.append(p.getDescription() + "\r\n");
		}
		
	}

}
