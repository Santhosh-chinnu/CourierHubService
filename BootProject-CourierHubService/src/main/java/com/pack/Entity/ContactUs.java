package com.pack.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "contactusInfo")
@AllArgsConstructor
public class ContactUs {
	
	@Id
	private Integer cid;
	
	@NonNull
	private String fname;
	
	@NonNull
	private String lname;
	
	private String email;
	@NonNull
	@Column(length = 12)
	private String phone;
	
	private String subject;
	
	private String message;

}