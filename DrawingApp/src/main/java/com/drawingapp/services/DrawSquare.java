package com.drawingapp.services;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape{

	private String color;
	private Integer edge;
	
	@Inject
	public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}
	
	public void draw() {
		System.out.println("Drawing Square of color " + color + " and edge " + edge);
	}

}
