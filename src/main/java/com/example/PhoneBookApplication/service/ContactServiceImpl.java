package com.example.PhoneBookApplication.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PhoneBookApplication.entity.Contact;
import com.example.PhoneBookApplication.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{
	@Autowired
	private ContactRepository contactRepository;
	@Override
	public boolean saveContact(Contact contact) {
		Contact contact2 = contactRepository.save(contact);
		
		if(contact2 !=null) {
			return true;
		}else {
			return false;
		}
		
		

	}
}

