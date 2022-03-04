package com.singleton.pattern;

class SingletonObject {
	 //create an object of SingletonObject
	   private static SingletonObject instance = new SingletonObject();
	 
	   //private constructor so that we cannot instantiate the class
	   private SingletonObject(){}
	 
	   //returns the only available object
	   public static SingletonObject getInstance(){
	      return instance;
	   }
	 
	   public void printMessage(){
	      System.out.println("Hello from Singleton object!!!");
	   }
}
