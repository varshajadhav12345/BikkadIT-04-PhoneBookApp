package com.example.PhoneBookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PhoneBookApplication.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
