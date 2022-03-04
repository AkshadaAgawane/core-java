package com.SingletonDesign.pattern;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Singleton obj=Singleton.getSingleInstance();
	    obj.str=sc.nextLine();
	    System.out.println("Hello I am a Singleton!Let me say\t"+ obj.str +"\tto you");
	    
	}

}
