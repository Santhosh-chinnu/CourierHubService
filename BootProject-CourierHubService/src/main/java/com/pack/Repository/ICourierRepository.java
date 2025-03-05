package com.pack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.Entity.ShipmentDetails;

public interface ICourierRepository extends JpaRepository<ShipmentDetails, Integer> {

}
