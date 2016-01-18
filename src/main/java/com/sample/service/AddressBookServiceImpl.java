package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import com.sample.entity.AddressBook;

public class AddressBookServiceImpl implements AddressBookService {
	
	private List<AddressBook> bookList = new ArrayList<AddressBook>();

	@Override
	public void save(AddressBook addressBook) {
		bookList.add(addressBook);
	}

	@Override
	public AddressBook findById(Long id) {
		for(AddressBook  book :  bookList) {
			if(book.getId().compareTo(id) ==0)
				return book;
		}
		return null;
	}

	@Override
	public List<AddressBook> findAll() {
		return bookList;
	}

}
