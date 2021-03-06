package Scanner;

import plus.*;
import last.*;
import minus.*;

public class Scann{
	double a = 0;
	char op;
	double b = 0;
	String line = "";
	byte index;
	
	java.util.Scanner in = new java.util.Scanner(System.in);
	public void takeLine(){
		line = in.nextLine();
		line = line.replaceAll("\\s+", "");
		
		boolean start = line.isEmpty();
		
		if(!start){
			char[] line_ch = line.toCharArray(); 
			/*
			for(char i : line_ch){
				if(a == 0 && (double)i >= 0 && (double) i <= 9){
					a = a + (double)i;
					a *= 10;
				}
				else if(a != 0 && (int)i >= 0 && (int) i <= 9){
					b = b + (int)i;
					b *= 10;
				}
				else if(i == '+' || i == '-' || i == '*' || i == '/' || i == '^' || i == '@'){
					op += i;
				}
			}
			*/
			byte tmp = 0;
			for(char i : line_ch){
				if(i == '+' || i == '-' || i == '*' || i == '/' || i == '^' || i == '@'){
					op += i;
					line_ch[tmp] = '0';
					index = tmp;
				}
				tmp++;
			}
			for(int i = 0; i < index; i++){
					a = a + ((double)line_ch[i] - 48);
					a *= 10;
			}
			a /= 10;
			for(int i = ++index; i < line_ch.length; i++){
					b = b + ((double)line_ch[i] - 48);
					b *= 10;
			}
			b /= 10;
		}
	}
	
	public double take_a(){
		return this.a;
	}
	public double take_b(){
		return this.b;
	}
	public char take_operation(){
		return this.op;
	}
	public void plus(Scann sc){
		Plus p = new Plus();
		double a = sc.take_a();
		double b = sc.take_b();
		p.plus_take_a(a);
		p.plus_take_b(b);
		p.plus();
		System.out.println("");
		System.out.print("Summ  " + a + "  +  " + b + "  =  ");
		System.out.println(p.plus_get_c());
		System.out.println("");
	}
	public void minus(Scann sc){
		Minus m = new Minus();
		double a = sc.take_a();
		double b = sc.take_b();
		m.minus_take_a(a);
		m.minus_take_b(b);
		m.minus();
		System.out.println("");
		System.out.print("Minus  " + a + "  -  " + b + "  =  ");
		System.out.println(m.minus_get_c());
		System.out.println("");
	}
}
