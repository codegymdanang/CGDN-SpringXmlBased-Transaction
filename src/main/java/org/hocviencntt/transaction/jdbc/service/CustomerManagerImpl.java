package org.hocviencntt.transaction.jdbc.service;

import org.hocviencntt.transaction.jdbc.dao.CustomerDao;
import org.hocviencntt.transaction.jdbc.model.Customer;
import org.springframework.transaction.annotation.Transactional;

public class CustomerManagerImpl implements CustomerManager {

	private CustomerDao customerDAO;

	public void setCustomerDAO(CustomerDao customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}
