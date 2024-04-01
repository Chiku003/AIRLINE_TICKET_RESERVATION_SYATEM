package DAO;
import java.util.*;



import Repository.Pojo;

public class DaoImpl implements DaoI
{
	static HashMap<Integer, Object> h=new HashMap<Integer, Object>();
	
	static HashMap<Integer, Object> h1=new HashMap<Integer, Object>();
	
	@Override
	public void addFlight(Pojo p) 
	{
		h.put(p.getFno(), p);
		System.out.println();
		System.out.println("!!!Flight Added Sucessfully!!!");
		System.out.println();
		
	}

	@Override
	public void viewFlight(Pojo p) 
	{
		Iterator<Integer> ii = h.keySet().iterator();
		
		if(ii.hasNext()) {
			
		while(ii.hasNext())
		{
					int k=ii.next();
					
					Pojo p1=(Pojo)h.get(k);
					
					System.out.println();
					System.out.println("=================Flight Details======================");
					System.out.println("Flight No:"+p1.getFno()+"\tFlight Name:"+p1.getFname());
					System.out.println("From:"+p1.getFrom()+"\tTo:"+p1.getTo()+"\tDate:"+p1.getDate());
					System.out.println("Arival time:"+p1.getArival()+"\tDeparature Time:"+p1.getDept());
					System.out.println("=====================================================");
					System.out.println();
		}
		}
		else
		{
			System.out.println();
			System.out.println("!!!No Flights Available!!!");
			System.out.println();
		}
		
	}
	@Override
	public void bookFlight(Pojo p) 
	{
		int fn1=p.getFno();
		Iterator<Integer> ii=h.keySet().iterator();
		boolean b=false;
		while(ii.hasNext())
		{
					int k=ii.next();
					Pojo p1=(Pojo)h.get(k);
					int fn2=p1.getFno();
					if(fn1==fn2)
					{
						b=true;
					}
		}
		if(b)
		{
		h1.put(p.getPno(), p);
		System.out.println();
		System.out.println("!!!Flight Booked Sucessfully!!!");
		System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("!!!Flight Number Doesn't Exist!!!");
			System.out.println();
		}
		
	}

	@Override
	public void cancelFlight(Pojo p) 
	{
		Iterator<Integer> ii=h1.keySet().iterator();
		if(ii.hasNext())
		{
		while(ii.hasNext())
		{
			int k=ii.next();
			String k1=Integer.toString(k);
			if(k1.equals(p.getPno())||k==p.getPno())
			{
				Pojo p1=(Pojo)h1.get(k);
				System.out.println();
				System.out.println("====================Booking Details======================");
				System.out.println("\tFlight No:"+p1.getFno()+"\tPassenger Name:"+p1.getPname());
				System.out.println("\tStatus:"+p.getStatus());
				System.out.println("=========================================================");
				System.out.println();
				h1.remove(p.getPno());
				break;
			}
			else
			{
				System.out.println();
				System.out.println("!!!No Flight Booked at this Passport number!!!");
				System.out.println();
			}
		
			
		}
		}
		else
		{
			System.out.println();
			System.out.println("!!!No Flight Booked at this Passport number!!!");
			System.out.println();
		}
		
	}

	@Override
	public void viewBooking(Pojo p) 
	{
		Iterator<Integer> ii=h1.keySet().iterator();
		if(ii.hasNext())
		{
		while(ii.hasNext())
		{
			int k=ii.next();
			String k1=Integer.toString(k);
			if(k1.equals(p.getPno())||k==p.getPno())
			{
				
				Pojo p1=(Pojo)h1.get(k);
				System.out.println();
				System.out.println("====================Booking Details======================");
				System.out.println("Passenger Name:"+p1.getPname()+"\tFlight No:"+p1.getFno());
				System.out.println("\tStatus:"+p1.getStatus());
				System.out.println("=========================================================");
				System.out.println();
				}
			else {
				System.out.println();
				System.out.println("!!!No Flight Booked at this Passport number!!!");
				System.out.println();
			}
				
			
			
		}
		}
		else {
			System.out.println();
			System.out.println("!!!No Flight Booked at this Passport number!!!");
			System.out.println();
		}
		
		
	}

}
