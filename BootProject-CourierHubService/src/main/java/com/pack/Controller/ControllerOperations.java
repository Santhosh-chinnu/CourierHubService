package com.pack.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.Entity.ContactUs;
import com.pack.Entity.ShipmentDetails;
import com.pack.Service.ICourierServiceMgmtImpl;

@Controller
public class ControllerOperations {
	

		@Autowired
		private ICourierServiceMgmtImpl cservice;
		
		@GetMapping("/")
		public String Home(){
			return "welcome";
		}
		
		@GetMapping("/about")
		public String about() {
			return "about";
		}
		
		@GetMapping("/contact")
		public String contact() {
			return "contact";
		}
		
		@GetMapping("/register")
		public String courierRegister() {
			return "register";
		}
		
		@PostMapping("/save")
		 public String Addcourier(@ModelAttribute ShipmentDetails ship) {
			cservice.Saveshipment(ship);
			return"redirect:/shipments";
		}
		
		
		@GetMapping("/shipments")
		public String showShipments(Map<String, Object> map) {
		    List<ShipmentDetails> shipments = cservice.ShowAllCouriers();
		    map.put("shipdata", shipments);
		    return "shipments";
		}
		
		
		@RequestMapping("/edit/{sid}")
		public String editShipment(@PathVariable("sid")int sid,Model model ) throws Exception {
			ShipmentDetails ship1=cservice.getCourierbyid(sid);
			model.addAttribute("ship", ship1);
			return"edit";
		}
		
		@RequestMapping("/delete/{sid}")
		public String deleteshipment(@PathVariable("sid") int sid){
	    	String	msg=cservice.deleteCourierbyid(sid);
			return "redirect:/shipments";
			
		}
		
		//conatctUs controller opeartions
		@PostMapping("/add") 
		public String addconatct(@ModelAttribute ContactUs contact) {
			return "redircet:/contactlist";
		}

			
		@GetMapping("/contactlist")
	   public String Seecontactlist(Map<String, Object> map) {
		List<ContactUs>	 colist=cservice.showAllcontacts();
		map.put("contact", colist);
		 return "contactlist";
	  }
	}

