package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.annotations.Square;
import com.drawingapp.request.SquareRequest;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class).in(Scopes.SINGLETON);;
		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class).in(Scopes.SINGLETON);;
		bind(SquareRequest.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
	}

}
