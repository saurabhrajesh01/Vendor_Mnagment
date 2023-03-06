package com.vendors.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendors.Model.VendorModel;

public interface VendorRepository extends JpaRepository<VendorModel, Integer>{

}
