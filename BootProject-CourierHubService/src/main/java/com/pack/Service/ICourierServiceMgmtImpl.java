package com.pack.Service;

import java.util.List;

import com.pack.Entity.ContactUs;
import com.pack.Entity.ShipmentDetails;

public interface ICourierServiceMgmtImpl {
	public String Saveshipment(ShipmentDetails shipment);
	public List<ShipmentDetails>ShowAllCouriers();
	public ShipmentDetails getCourierbyid(int id) throws Exception;
	public String EditCourier(ShipmentDetails ship1);  
	public String deleteCourierbyid(int id);
	
	//contact
	public String saveconact(ContactUs conatctus);
	public List<ContactUs>showAllcontacts();
}
