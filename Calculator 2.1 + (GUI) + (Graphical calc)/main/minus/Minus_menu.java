package minus;
import last.*;

public class Minus_menu{
	public void start_Minus(last last_operation){
		java.util.Scanner in = new java.util.Scanner(System.in);
		Minus m = new Minus();
		while(true){
			System.out.println("");
			System.out.println("Okey, what're we doing now?");
			System.out.println("change first number (1), change second number (2),");
			System.out.println("minus(3), view first (4), view second (5),");
			System.out.println("view difference (6), view all operations (7), let's start anew (0)");

			byte start = in.nextByte();
					
			double x = 0;
			if(start == (0)) {
				System.out.println("");
				break;
			}
			switch(start){
				case(1):
					System.out.println("");
					x = in.nextDouble();
					m.minus_take_a(x);
					System.out.println("");
					break;
				
				case(2):
					System.out.println("");
					x = in.nextDouble();
					m.minus_take_b(x);
					System.out.println("");
					break;
				
				case(3):
					System.out.println("");
					m.minus();
					double tmp = m.minus_get_c();
					last_operation.add_last((double)tmp);
					System.out.println(tmp);
					System.out.println("");
					break;
					
				case(4):
					System.out.println("");
					System.out.println(m.minus_get_a());
					System.out.println("");
					break;
					
				case(5):
					System.out.println("");
					System.out.println(m.minus_get_b());
					System.out.println("");
					break;
				
				case(6):
					System.out.println("");
					System.out.println(m.minus_get_c());
					System.out.println("");
					break;
				
				case(7):
					System.out.println("");
					last_operation.view();
			}
		}
	}
}
