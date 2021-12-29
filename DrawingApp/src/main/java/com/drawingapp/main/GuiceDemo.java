package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.request.CircleRequest;
import com.drawingapp.request.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQUARE_REQ = "SQUARE";
	private static final String CIRCLE_REQ = "CIRCLE";
	
	private static void sendRequest(String req) {
		Injector injector = Guice.createInjector(new AppModule());
		if(req.equals(SQUARE_REQ)) {
			SquareRequest request1 = injector.getInstance(SquareRequest.class);
			request1.makeRequest();
			SquareRequest request2 = injector.getInstance(SquareRequest.class);
			request2.makeRequest();
			
			boolean equalDrawShapes = request1.getDrawShape() == request2.getDrawShape();
			System.out.println("were draw shapes equal : " + equalDrawShapes);
			boolean equalSquareRequest= request1 == request2;
			System.out.println("were SquareRequest  equal : " + equalSquareRequest);
		} else if(req.equals(CIRCLE_REQ)) {
			CircleRequest request = injector.getInstance(CircleRequest.class);
			request.makeRequest();
			
		}
	}
	
	public static void main(String[] args) {
		sendRequest(CIRCLE_REQ);
	}

}
