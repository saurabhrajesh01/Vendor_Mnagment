package com.vendors.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendors")
public class VendorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int vendor_id;
	
	@Column(name = "name")
	private String vendor_name;
	
	@Column(name = "code")
	private String vendor_code;
	
	@Column(name = "address")
	private String vendor_address;
	
	@Column(name = "city")
	private String vendor_city;
	
	@Column(name = "state")
	private String vendor_state;
	
	@Column(name = "pincode", columnDefinition = "varchar(6)")
	private String vendor_pincode;
	
	@Column(name = "phone", columnDefinition = "varchar(10)")
	private String vendor_phone;
	
	@Column(name = "email_address")
	private String vendor_email;

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getVendor_code() {
		return vendor_code;
	}

	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	public String getVendor_address() {
		return vendor_address;
	}

	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}

	public String getVendor_city() {
		return vendor_city;
	}

	public void setVendor_city(String vendor_city) {
		this.vendor_city = vendor_city;
	}

	public String getVendor_state() {
		return vendor_state;
	}

	public void setVendor_state(String vendor_state) {
		this.vendor_state = vendor_state;
	}

	public String getVendor_pincode() {
		return vendor_pincode;
	}

	public void setVendor_pincode(String vendor_pincode) {
		this.vendor_pincode = vendor_pincode;
	}

	public String getVendor_phone() {
		return vendor_phone;
	}

	public void setVendor_phone(String vendor_phone) {
		this.vendor_phone = vendor_phone;
	}

	public String getVendor_email() {
		return vendor_email;
	}

	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	public VendorModel(int vendor_id, String vendor_name, String vendor_code, String vendor_address, String vendor_city,
			String vendor_state, String vendor_pincode, String vendor_phone, String vendor_email) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.vendor_code = vendor_code;
		this.vendor_address = vendor_address;
		this.vendor_city = vendor_city;
		this.vendor_state = vendor_state;
		this.vendor_pincode = vendor_pincode;
		this.vendor_phone = vendor_phone;
		this.vendor_email = vendor_email;
	}

	public VendorModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	

}
