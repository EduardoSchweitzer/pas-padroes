package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.Product;

public class BasicWindow extends JFrame{
	
	private JTextArea text;
	private AddButtonDecorator addButton;
	private ProductListDecorator list;
	private DelButtonDecorator delButton;
	private ArrayList<Product> pList;
	
	
	public BasicWindow(ArrayList<Product> plist) {
		this.pList = plist;
		this.text = new JTextArea();
		this.addButton = new AddButtonDecorator();
		this.list = new ProductListDecorator(pList);
		this.delButton = new DelButtonDecorator();	
		draw();
	}
	
	public void draw() {
		getContentPane().add(text);
		getContentPane().add(addButton);
		getContentPane().add(delButton);
		getContentPane().add(list);
	}
	
	public String getDescription() {return "";}
	
	
}  
