package DAO;

import Repository.Pojo;

public interface DaoI 
{
	void addFlight(Pojo p);
	void viewFlight(Pojo p);
	void bookFlight(Pojo p);
	void cancelFlight(Pojo p);
	void viewBooking(Pojo p); 
}
