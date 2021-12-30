package com.drawingapp.request;

import com.drawingapp.annotations.Circle;
import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CircleRequest {
	DrawShape d;
	
	//1. constructor injection
	@Inject
//	public CircleRequest(@Named("Circle") DrawShape d){ // named annotation
	public CircleRequest(@Circle DrawShape d){
		this.d = d;
	}

	//2. method injection
	
//	public void setDrawShape(DrawShape d) {
//		this.d = d;
//	}
	
	//3. field injection
//	@Inject
//	DrawShape d;
	
	public void makeRequest() {
		d.draw();
	}
	
	public DrawShape getDrawShape() {
		return d;
	}

}
