import java.io.*;
import plus.*;
import last.*;
import minus.*;
import Scanner.*;

public class main{
	public static void main(String [] args) throws java.io.IOException{
		java.util.Scanner in = new java.util.Scanner(System.in);
		//ltsStart:
		last last_operation = new last();
		
		while(true){
			
			System.out.println("Main Menu");
			System.out.println("");
			System.out.println("Hi");
			System.out.println("What're we doing now?");
			System.out.println("Scann (S), Operation plus (+), minus (-), multiply (*), division (/), power (^), sqrt (@), exit (0)");
			
			String start = in.nextLine();
			Scann sc = new Scann();
			
			if(start.equals("S") || start.equals("s")){
				System.out.println("Scanning...");
				sc.takeLine();
				System.out.println(sc.take_a());
				System.out.println(sc.take_b());
				System.out.println(sc.take_operation());
				char operation = sc.take_operation();
				switch(operation){
					case('+'):
						sc.plus(sc);
						break;
					
					case('-'):
						sc.minus(sc);
						break;
				}
			}
			switch(start){
				case("+"):
					Plus_menu pm = new Plus_menu();
					pm.start_Plus(last_operation);
					break;
					
				case("-"):
					Minus_menu mm = new Minus_menu();
					mm.start_Minus(last_operation);
					break;
			
				case("0"):
					System.exit(0);
					break;
			}
		}
	}
}
