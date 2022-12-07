package com.example.PhoneBookApplication.service;



import java.util.List;

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
	@Override
	public List<Contact> getAllContact() {

		List<Contact> list = contactRepository.findAll();
		return list;
	
	}
	@Override
	public Contact getContactById(Integer id) {
		Contact id2 = contactRepository.findById(id).get();
		return id2;
	}
	
	@Override
	public boolean updateContact(Contact contact) {
		Contact contact2 = contactRepository.save(contact);

		if(contact2 !=null) {
			return true;
		}else {
			return false;
		}
}
	@Override
	public boolean deleteContact(Integer id) {
		boolean existsById = contactRepository.existsById(id);
		if (existsById) {
			contactRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
}