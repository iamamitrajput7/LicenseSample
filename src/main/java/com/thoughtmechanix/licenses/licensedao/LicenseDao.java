package com.thoughtmechanix.licenses.licensedao;


import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.thoughtmechanix.licenses.model.License;


@Repository
public interface LicenseDao {

	public void addLicense(License p);
	public void updateLicense(License p);
	public List<License> listLicense();
	public License getLicenseById(int id);
	public void removeLicense(int id);
	
}
