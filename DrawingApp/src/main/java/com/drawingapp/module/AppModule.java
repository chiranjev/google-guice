package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.CircleColorValue;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.annotations.Radius;
import com.drawingapp.annotations.Square;
import com.drawingapp.annotations.SquareColorValue;
import com.drawingapp.request.SquareRequest;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
//		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class).in(Scopes.SINGLETON);
//		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class).in(Scopes.SINGLETON);
		bind(SquareRequest.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
		bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Black");
		bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);
		bind(Integer.class).annotatedWith(Radius.class).toInstance(40);
	}
	
	@Provides
	@Singleton
	@Square
	DrawShape provideDrawSquare(@SquareColorValue String color,@EdgeSize Integer edge) {
		DrawShape d = new DrawSquare(color, edge);
		return d;
	}
	
	@Provides
	@Singleton
	@Circle
	DrawShape provideDrawCircle(@CircleColorValue String color,@Radius Integer radius) {
		DrawShape d = new DrawCircle(color, radius);
		return d;
	}

}
