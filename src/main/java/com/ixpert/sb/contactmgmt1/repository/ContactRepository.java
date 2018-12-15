package com.ixpert.sb.contactmgmt1.repository;

import com.ixpert.sb.contactmgmt1.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
