package com.example.PhoneBookApplication.service;


import java.util.List;

import com.example.PhoneBookApplication.entity.Contact;

public interface ContactServiceI {
	
public abstract boolean saveContact(Contact contact);

public abstract List<Contact> getAllContact();
}


