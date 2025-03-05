package com.pack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.Entity.ContactUs;

public interface IContactUsRepository extends JpaRepository<ContactUs, Integer> {

}