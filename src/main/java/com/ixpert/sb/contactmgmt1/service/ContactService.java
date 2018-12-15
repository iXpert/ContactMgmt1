package com.ixpert.sb.contactmgmt1.service;


import com.ixpert.sb.contactmgmt1.model.Contact;

public interface ContactService {

    Iterable<Contact> getAllContacts();
    Contact getContactById(Integer id);
    Contact saveContact(Contact contact);
    void delteContact(Integer id);


}
