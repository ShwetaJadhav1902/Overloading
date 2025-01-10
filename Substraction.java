package com.overloading;

public class Substraction {
	public double sub(double a,int b) {
		return a-b;
		}
		public double sub(int a,double b) {
			return a-b;
			}
		public double sub(int a,int b) {
			return a-b;
			}
		public double sub(int a,int b,int c) {
			return a-b-c;
			}
		public double sub(int a,double b,int c) {
			return a-b-c;
			}

}
