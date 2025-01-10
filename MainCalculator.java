package com.overloading;

public class MainCalculator {
	public static void main(String[] args) {
		Addition c=new Addition();
		double add1=c.add(23,34.45);
		System.out.println("Addition of three argument method(int,double,int):"+add1);
		double add2=c.add(23,34,45);
		System.out.println("Addition of three argument method(int,int,int):"+add2);
		double add3=c.add(23,32);
		System.out.println("Addition of three argument method(int,int):"+add3);
		double add4=c.add(23,45);
		System.out.println("Addition of three argument method(int,double):"+add4);
		double add5=c.add(34,45);
		System.out.println("Addition of three argument method(double,int):"+add5);
	
	
        System.out.println("---------------------------------------------------------------");
		Substraction s=new Substraction();
		double sub1=s.sub(23,15.20,2);
		System.out.println("substraction of three argument method(int,double,int):"+sub1);
		double sub2=s.sub(23,15,2);
		System.out.println("substraction of three argument method(int,int,int):"+sub2);
		double sub3=s.sub(23,15);
		System.out.println("substraction of two argument method(int,int):"+sub3);
		double sub4=s.sub(23,15.20,2);
		System.out.println("substraction of two argument method(int,double):"+sub4);
		double sub5=s.sub(23,15.20,2);
		System.out.println("substraction of two argument method(double,int):"+sub5);
		
		
		System.out.println("---------------------------------------------------------------");
		Multiplication m=new Multiplication();
		double multi1=m.multi(23,15.20,2);
		System.out.println("multiplication of three argument method(int,double,int):"+sub1);
		double multi2=m.multi(23,15.20,2);
		System.out.println("multiplication of three argument method(int,int,int):"+multi2);
		double multi3=m.multi(23,15.20,2);
		System.out.println("multiplication of two argument method(int,int):"+multi3);
		double multi4=m.multi(23,15.20,2);
		System.out.println("multiplication of two argument method(int,double):"+multi4);
		double multi5=m.multi(23,15.20,2);
		System.out.println("multiplication of two argument method(double,int):"+multi5);
		
		
		
		System.out.println("---------------------------------------------------------------");
		Division d=new Division();
		double div1=d.div(23,15.20,2);
		System.out.println("Division of three argument method(int,double,int):"+div1);
		double div2=d.div(23,15.20,2);
		System.out.println("Division of three argument method(int,double,int):"+div2);
		double div3=d.div(23,15.20,2);
		System.out.println("Division of two argument method(int,,int):"+div3);
		double div4=d.div(23,15.20,2);
		System.out.println("Division of two argument method(int,double):"+div4);
		double div5=d.div(23,15.20,2);
		System.out.println("Division of two argument method(double,int):"+div5);
		
		
	}
	
}
	


