package com.cooksys.ftd.assignments.day.two.objects;

public class test {

	public static void main(String[] args) 
	{
		
		Rational rt = new Rational(2,3);
		Rational st = new Rational(3, 3);

		System.out.print(rt + " + " + st + " = " );
		
		System.out.println(rt.add(st));
		
		
	}

}
