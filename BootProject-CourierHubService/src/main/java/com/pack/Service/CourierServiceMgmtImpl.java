package com.pack.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.Entity.ContactUs;
import com.pack.Entity.ShipmentDetails;
import com.pack.Repository.IContactUsRepository;
import com.pack.Repository.ICourierRepository;

@Service("serv")
public class CourierServiceMgmtImpl implements ICourierServiceMgmtImpl {
	
	@Autowired
	private ICourierRepository  coupo;
	
	@Autowired
	private IContactUsRepository crepo;

	@Override
	public String Saveshipment(ShipmentDetails shipment) {
		return "Shipment Registered Successfully "+coupo.save(shipment);
	}

	@Override
	public List<ShipmentDetails> ShowAllCouriers() {
		return coupo.findAll();
	}

	@Override
	public ShipmentDetails getCourierbyid(int id) throws Exception {
		return coupo.findById(id).orElseThrow(()-> new IllegalAccessException("invalid data"));
	}

	@Override
	public String EditCourier(ShipmentDetails ship1) {
		return "Edited Succesufully "+coupo.save(ship1);
	}

	@Override
	public String deleteCourierbyid(int id) {
		 Optional<ShipmentDetails> opt=coupo.findById(id);
		   if(opt.isPresent()) {
		   coupo.deleteById(id);
		   return id+" Book  is delete successfully";
		   }
		   else {
				return id+"Book Is Not deleted ";
	      }
	   }
	
	@Override
	public String saveconact(ContactUs conatctus) {
		return "conatct registerded successfully"+crepo.save(conatctus);
	}
	
	@Override
	public List<ContactUs> showAllcontacts() {
		return crepo.findAll();
	}
	

}
