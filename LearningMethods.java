package com.tests;

import org.testng.reporters.jq.Main;

public class LearningMethods {
	public void addition(int x, int y) {
		int result=x+y;
		System.out.println(x);
		System.out.println(y);
		System.out.println("result: "+ 9+y);
		System.out.println("result: "+result);
		
	}
	public int division(int x, int y) {
		int result=x/y;
		System.out.println(x);
		System.out.println(y);
		//System.out.println("result: "+ x/y);
		return result;
	}
	public static void main(String[] args) {
		LearningMethods myObject=new LearningMethods();
		myObject.addition(4,9);
		int result=myObject.division(50, 5);
		System.out.println(result);
		
		
		
	}

}
