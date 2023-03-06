package com.vendors.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendors.Model.VendorModel;
import com.vendors.Repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	public VendorModel saveVendor(VendorModel vendorModel) {

		String vendorName = vendorModel.getVendor_name();
		String vendorCode = vendorModel.getVendor_code();
		String vendorAddress = vendorModel.getVendor_address();
		String vendorCity = vendorModel.getVendor_city();
		String vendor_state = vendorModel.getVendor_state();
		String vendor_pincode = vendorModel.getVendor_pincode();
		String vendor_phone = vendorModel.getVendor_phone();
		String vendor_email = vendorModel.getVendor_email();

		if (vendor_email != null) {
			String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(vendor_email);
			if (!matcher.matches()) {
				System.out.println("Email not valid ");

			} else {
				if (vendor_phone != null) {
					String regexPhoneNo = "^\\d{10}$";
					Pattern patternForPhoneNo = Pattern.compile(regexPhoneNo);
					Matcher matcherPhoneNo = patternForPhoneNo.matcher(vendor_phone);
					if (!matcherPhoneNo.matches()) {
						System.out.println("Phone No. is not valid ");

					} else {

						if (vendor_pincode != null) {
							String regexPinCode = "^\\d{6}$";
							Pattern patternForPinCode = Pattern.compile(regexPinCode);
							Matcher matcherPincode = patternForPinCode.matcher(vendor_pincode);
							if (!matcherPincode.matches()) {
								System.out.println("Pincode is not valid ");

							} else {
								vendorRepository.save(vendorModel);
							}
						} else {
							System.out.println("Please enter pincode!");
						}

					}
				} else {
					System.out.println("Please Enter Phone No.");
				}

			}
		} else {
			System.out.println("Please Enter Email!");
		}

		return vendorModel;
	}

	public List<VendorModel> getAllVendors() {

		return vendorRepository.findAll();
	}

	public VendorModel updateVendor(VendorModel vendorModel, int vendorId) {
		java.util.Optional<VendorModel> option = vendorRepository.findById(vendorId);
		VendorModel vendModel = null;
		if (option.isPresent()) {

			vendModel = option.get();
			vendModel.setVendor_name(vendorModel.getVendor_name());
			vendModel.setVendor_code(vendorModel.getVendor_code());
			vendModel.setVendor_address(vendorModel.getVendor_address());
			vendModel.setVendor_city(vendorModel.getVendor_city());
			vendModel.setVendor_state(vendorModel.getVendor_state());
			vendModel.setVendor_pincode(vendorModel.getVendor_pincode());
			vendModel.setVendor_phone(vendorModel.getVendor_phone());
			vendModel.setVendor_email(vendorModel.getVendor_email());
			
		}
		
		String vendorName = vendModel.getVendor_name();
		String vendorCode = vendModel.getVendor_code();
		String vendorAddress = vendModel.getVendor_address();
		String vendorCity = vendModel.getVendor_city();
		String vendor_state = vendModel.getVendor_state();
		String vendor_pincode = vendModel.getVendor_pincode();
		String vendor_phone = vendModel.getVendor_phone();
		String vendor_email = vendModel.getVendor_email();
		
		if (vendor_email != null) {
			String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(vendor_email);
			if (!matcher.matches()) {
				System.out.println("Email not valid ");

			} else {
				if (vendor_phone != null) {
					String regexPhoneNo = "^\\d{10}$";
					Pattern patternForPhoneNo = Pattern.compile(regexPhoneNo);
					Matcher matcherPhoneNo = patternForPhoneNo.matcher(vendor_phone);
					if (!matcherPhoneNo.matches()) {
						System.out.println("Phone No. is not valid ");

					} else {

						if (vendor_pincode != null) {
							String regexPinCode = "^\\d{6}$";
							Pattern patternForPinCode = Pattern.compile(regexPinCode);
							Matcher matcherPincode = patternForPinCode.matcher(vendor_pincode);
							if (!matcherPincode.matches()) {
								System.out.println("Pincode is not valid ");

							} else {
								vendorRepository.save(vendModel);
								System.out.println("Vendor updatedsuccesfully!..");
							}
						} else {
							System.out.println("Please enter pincode!");
						}

					}
				} else {
					System.out.println("Please Enter Phone No.");
				}

			}
		} else {
			System.out.println("Please Enter Email!");
		}

		return null;
	}

	public String deleteVendor(int vendorId) {
		vendorRepository.deleteById(vendorId);
		return null;
	}

}
