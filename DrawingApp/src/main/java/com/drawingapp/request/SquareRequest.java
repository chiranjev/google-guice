package com.drawingapp.request;

import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
	DrawShape d;
	
	//1. constructor injection
	@Inject
	public SquareRequest(@Square DrawShape d){ // binding annotation
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
