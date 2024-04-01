package Service;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import DAO.DaoI;
import DAO.DaoImpl;
import Repository.Pojo;

public class ServiceImpl implements ServiceI
{
	Scanner ss=new Scanner(System.in);
	
	@Override
	public void addFlight() 
	{
		System.out.println();
		System.out.print("Enter Admin pin: ");
		String pin = new Scanner(System.in).nextLine();
		if(pin.equals("1010"))
		{
			System.out.println();
			System.out.print("Enter Flight Name: ");
			String fname=new Scanner(System.in).nextLine();
			
			System.out.println();
			System.out.print("Enter Flight No: ");
			int fno=new Scanner(System.in).nextInt();
			
			System.out.println();
			System.out.print("Enter Date: ");
			String date=null;
			try {
				date = new DataInputStream(System.in).readLine();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			System.out.println();
			System.out.print("From Location: ");
			String from=null;
			try {
				from = new DataInputStream(System.in).readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			System.out.println();
			System.out.print("To Location: ");
			String to=null;
			try {
				to = new DataInputStream(System.in).readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println();
			System.out.print("Arival Time: ");
			String arival=new Scanner(System.in).nextLine();
			
			System.out.println();
			System.out.print("Deparature Time: ");
			String dep=new Scanner(System.in).nextLine();
			
			Pojo p=new Pojo();
			p.setFname(fname);
			p.setFno(fno);
			p.setFrom(from);
			p.setTo(to);
			p.setDate(date);
			p.setArival(arival);
			p.setDept(dep);
			
			DaoI di=new DaoImpl();
			
			di.addFlight(p);
			
		}
		else {
			System.out.println();
			System.out.println("!!!Invalid Pin!!!");
			System.out.println();
		}
		
		
	}

	@Override
	public void viewFlight() 
	{
		Pojo p = new Pojo();
		
		DaoI di=new DaoImpl();
		
		di.viewFlight(p);
		
	}

	@Override
	public void bookFlight() {
		System.out.println();
		System.out.print("Enter Passenger Name: ");
		String pname=null;
		try {
			 pname=new DataInputStream(System.in).readLine();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println();
		System.out.print("Enter Passport No: ");
		int pno=new Scanner(System.in).nextInt();
		
		System.out.println();
		System.out.print("Enter Flight No: ");
		int fno=new Scanner(System.in).nextInt();
		
		
		
		
		
		String st="Booked";
		
		Pojo p=new Pojo();
		p.setPname(pname);
		p.setPno(pno);
		p.setFno(fno);
		p.setStatus(st);
		
		DaoI di=new DaoImpl();
		di.bookFlight(p);
		
		
	}

	@Override
	public void cancelFlight() 
	{
		System.out.println();
		System.out.print("Enter Passport No: ");
		int pno=new Scanner(System.in).nextInt();
		
		System.out.println();
		System.out.print("Enter Flight No: ");
		int fno=new Scanner(System.in).nextInt();
		
		String st="Canceled";
		
		Pojo p=new Pojo();
		
		p.setPno(pno);
		p.setFno(fno);
		p.setStatus(st);
		DaoI di=new DaoImpl();
		di.cancelFlight(p);
	}

	@Override
	public void viewBooking()
	{
		System.out.println();
		System.out.print("Enter Passport No: ");
		int pno = new Scanner(System.in).nextInt();
		Pojo p=new Pojo();
		p.setPno(pno);
		DaoI di=new DaoImpl();
		di.viewBooking(p);
		
	}

}
