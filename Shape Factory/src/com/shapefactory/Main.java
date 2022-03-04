package com.shapefactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShapeFactory shapeFactory = new ShapeFactory();
		 
	      //circle
	      Geometric_shape shape_Circle = shapeFactory.shapeObject("CIRCLE");
	 
	      //draw method of Circle
	      shape_Circle.draw_shape();
	 
	      //Rectangle
	      Geometric_shape shape_Rectangle = shapeFactory.shapeObject("RECTANGLE");
	 
	      //draw method of Rectangle
	      shape_Rectangle.draw_shape();
	 
	      //Square
	      Geometric_shape shape_Square = shapeFactory.shapeObject("SQUARE");
	 
	      //draw method of square
	      shape_Square.draw_shape();
	   }
	}


