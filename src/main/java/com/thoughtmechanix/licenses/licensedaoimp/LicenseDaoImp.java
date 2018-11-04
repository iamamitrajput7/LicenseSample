package com.thoughtmechanix.licenses.licensedaoimp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.thoughtmechanix.licenses.licensedao.LicenseDao;
import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.util.HibernateUtil;


@Component
public class LicenseDaoImp implements LicenseDao{

	
	


	@Override
	public void addLicense(License p) {
		System.out.println("add inside addLicense");
		
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			if (session!=null) {
			Transaction transaction=session.beginTransaction();
		System.out.println(p.toString());
		session.save(p);
		transaction.commit();
			}else {
				System.out.println("Session not created");
			}
		}catch(Exception e) {
			System.out.println("Exception in add");
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLicense(License p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<License> listLicense() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public License getLicenseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLicense(int id) {
		// TODO Auto-generated method stub
		
	}

}
