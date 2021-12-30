package com.drawingapp.services;

public class DrawSquare implements DrawShape{

	private String color;
	private Integer edge;
	
	public DrawSquare(String color,Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}
	
	public void draw() {
		System.out.println("Drawing Square of color " + color + " and edge " + edge);
	}

}
