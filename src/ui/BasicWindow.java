package ui;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class BasicWindow extends JFrame{
	
	private JTextArea text;
	private AddButtonDecorator addButton;
	private ProductListDecorator list;
	private DelButtonDecorator delButton;
	private ArrayList<String> pList;
	
	
	public BasicWindow(String title) {
		super(title);
		addButton = new AddButtonDecorator();
		delButton = new DelButtonDecorator();
		pList = new ProductListSample(10).getProducts();
		list = new ProductListDecorator(pList);
		setup();
		draw();
	}

	public BasicWindow() {
		this("Window");
	}
	
	public void setup(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(500, 500);
	}

	public void draw() {
		add(list);
		add(delButton);
		add(addButton);

		setVisible(true);
	}
	
	public String getDescription() {return "";}
	
	
}  
