package com.thoughtmechanix.licenses.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtmechanix.licenses.licensedao.LicenseDao;
import com.thoughtmechanix.licenses.model.License;



@RestController
@RequestMapping(value="license")
public class LicenseController {
	

	public License license= new License();
	
	
	@Autowired
	public LicenseDao licenseDao;
	
	@RequestMapping(value="/{licensesId}",method=RequestMethod.GET)
	public License getLicenses(@PathVariable("organizationId")String organizationId,@PathVariable("licensesId")int licenseId){
		
		System.out.println("inside getLicenses");
		license.setId(licenseId);
		license.setOrganizationId(organizationId);
		license.setProductName("Teleco");
		license.setLicenseType("seat");
		return license;
		
	}
	
	@RequestMapping(value="/addlicense",method=RequestMethod.POST)
	public void addLicenses(@RequestParam("organizationId")String organizationId,@RequestParam("licensesId")int licenseId){
		
		
		try {
		System.out.println("inside getLicenses" + organizationId  +licenseId);
		license.setId(licenseId);
		license.setOrganizationId(organizationId);
		license.setProductName("Google-Cloud");
		license.setLicenseType("Cloud");
		System.out.println(license.getId()+","+license.getLicenseType()+","+license.getProductName()+","+license.getOrganizationId());
		licenseDao.addLicense(license);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
