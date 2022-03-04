package com.shapefactory;

class ShapeFactory {
	public Geometric_shape shapeObject(String shapeType){
	      if(shapeType == null){
	         return null;
	      } 
	      //retrieve Circle object
	      if(shapeType.equalsIgnoreCase("Circle")){
	         return new Circle();
	     
	      //retrieve Rectangle object     
	      } else if(shapeType.equalsIgnoreCase("Rectangle")){
	         return new Rectangle();
	     
	      ////retrieve Square object     
	      } else if(shapeType.equalsIgnoreCase("Square")){
	         return new Square();
	      }
	      return null;
	   }
	}

