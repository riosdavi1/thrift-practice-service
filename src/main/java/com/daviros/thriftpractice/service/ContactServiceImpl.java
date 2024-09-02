package com.daviros.thriftpractice.service;

import java.util.List;

import org.apache.thrift.TException;

import com.daviros.thriftpractice.service.impl.ContactResource;
import com.daviros.thriftpractice.service.impl.ContactService;
import com.daviros.thriftpractice.service.impl.ServiceException;

public class ContactServiceImpl implements ContactService.Iface{

	@Override
	public ContactResource getContact(int id) throws ServiceException, TException {
		ContactResource contact = new ContactResource();
		contact.setId(id);
		contact.setName("John Doe");
		return contact;
	}

	@Override
	public boolean saveContact(ContactResource resource) throws ServiceException, TException {
		return resource.getId() != 0;
	}

	@Override
	public List<ContactResource> getContactList() throws ServiceException, TException {
		ContactResource contact = new ContactResource();
		contact.setId(1);
		contact.setName("John Doe");
		return List.of(contact);
	}

	@Override
	public boolean ping() throws ServiceException, TException {
		return true;
	}

}
