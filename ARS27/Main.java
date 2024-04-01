
import java.util.*;

import Service.ServiceI;
import Service.ServiceImpl;
public class Main 
{
public static void main(String[] args) 
{
Scanner ss = new Scanner(System.in);
boolean b = false;
ServiceI si=new ServiceImpl();

do
{
	print();
	System.out.print("\nEnter your choice: ");
	int ch=ss.nextInt();
	
	switch (ch) {
	case 1:
		si.addFlight();
		break;
	case 2:
		si.viewFlight();
		break;
	case 3:
		si.bookFlight();
		break;
	case 4:
		si.cancelFlight();
		break;
	case 5:
		si.viewBooking();
		break;
	case 6:
		b=true;
		System.out.println("!!!Thanks 4 Using!!!Visite Again..");
		break;

	default:
		System.out.println("\n!!!INVALID OPTION!!!");
		break;
	}
}while(!b);
}
public static void print()
{
	
	
	System.out.println("=======Airline Reservation System======");
	System.out.println("\n1.Add Flight");
	System.out.println("2.View Flight");
	System.out.println("3.Book Flight");
	System.out.println("4.Cancel Booking");
	System.out.println("5.Booking Details");
	System.out.println("6.Quit");
}
}
