package minus;

import last.*;

public class Minus{
	double a = 0;
	double b = 0;
	double c = 0;
	
	public void minus_take_a(double c){
		this.a = c;
	}
	public double minus_get_a(){
		return this.a;
	}
	
	public void minus_take_b(double c){
		this.b = c;
	}
	public double minus_get_b(){
		return this.b;
	}
	
	public double minus_get_c(){
		return this.c;
	}
	
	public void minus(){
		this.c = a - b;
	}
}
