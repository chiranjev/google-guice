package com.drawingapp.services;

public class DrawCircle implements DrawShape{
	private String color;
	private Integer edge;
	
	public DrawCircle(String color,Integer edge) {
		this.color = color;
		this.edge = edge;
	}
	
	public void draw() {
		System.out.println("Drawing Circle of color " + color + " and edge " + edge);
	}

}
