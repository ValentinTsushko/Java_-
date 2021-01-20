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
	public void takeLine(String line){
		//line = in.nextLine();
		line = line.replaceAll("\\s+", "");
		
		boolean start = line.isEmpty();
		
		if(!start){
			char[] line_ch = line.toCharArray(); 
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
	public double view_oper(Scann sc){
		double a = sc.take_a();
		double b = sc.take_b();
		double c = 0;
		switch(this.op){
			case('+'):
				Plus p = new Plus();
				p.plus_take_a(a);
				p.plus_take_b(b);
				p.plus();
				System.out.println("");
				System.out.print("Summ  " + a + "  +  " + b + "  =  ");
				System.out.println(p.plus_get_c());
				System.out.println("");
				c = p.plus_get_c();
				break;
			
			case('-'):
				Minus m = new Minus();
				m.minus_take_a(a);
				m.minus_take_b(b);
				m.minus();
				System.out.println("");
				System.out.print("Minus  " + a + "  -  " + b + "  =  ");
				System.out.println(m.minus_get_c());
				System.out.println("");
				c = m.minus_get_c();
				break;
		}
		return c;
	}

}
