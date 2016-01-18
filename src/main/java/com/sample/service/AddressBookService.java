package com.sample.service;

import java.util.List;

import com.sample.entity.AddressBook;

public interface AddressBookService {
	public void save(AddressBook addressBook);

	public AddressBook findById(Long id);

	public List<AddressBook> findAll();

}
