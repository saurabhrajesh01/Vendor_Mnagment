package com.vendors.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendors.Model.VendorModel;
import com.vendors.Service.VendorServiceImpl;

@RestController
@RequestMapping("api/vendor")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class VendorController {
	
	 @Autowired
	  private VendorServiceImpl vendorServiceImpl;
	    
	    
	    @PostMapping(value = "saveVendors")
	    public VendorModel saveVendor(@RequestBody VendorModel vendorModel)
	    {
	    	return vendorServiceImpl.saveVendor(vendorModel);
	    }
	    
	    
	    
	    @GetMapping(value = "getAllVendors")
	    public List<VendorModel> getAllVendors()
	    {
	    	return vendorServiceImpl.getAllVendors();
	    	
	    }
	    
	    @PostMapping(value = "updateVendor/{vendorId}")
	    public VendorModel updateVendor(@RequestBody VendorModel vendorModel, @PathVariable int vendorId)
	    {
	    	
	    	return vendorServiceImpl.updateVendor(vendorModel,vendorId);
	    	
	    }
	    
	    @DeleteMapping(value = "deleteVendor/{vendorId}")
	    public String deleteVendor(@PathVariable int vendorId)
	    {
	    	vendorServiceImpl.deleteVendor(vendorId);
	    	return "Vendor deleted";
	    	
	    }

}
