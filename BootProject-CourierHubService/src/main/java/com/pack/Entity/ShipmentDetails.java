package com.pack.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "DeliveryInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ShipmentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	
	@NonNull
	@Column(length = 45)
	private String name;
	
	@NonNull
	@Column(length = 12)
	private Integer contact;
	
	 @NonNull
	  @Column(length = 45, name = "`from`") // Escape "from"
	   private String from;

	   @NonNull
	   @Column(length = 45, name = "`to`") // Escape "to"
	    private String to;
	    
	@NonNull
	@Column(length = 45)
	private String status;
	
	@NonNull
	@Column(length = 45)
	private Double price;

	@Column(length = 45)
	private int weight;

}