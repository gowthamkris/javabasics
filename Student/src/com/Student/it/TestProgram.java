package com.Student.it;


public class TestProgram {
	 
	   public static void main(String[] args){
	      Square1 s = new Square1() {
			
			@Override
			public double getPerimeter(double side) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	      //s.getArea(0);
	      System.out.print(s.getArea(42));
	   }
	}
