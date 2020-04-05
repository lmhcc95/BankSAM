package com.lanqiao.service.impl;

import java.util.List;

import com.lanqiao.dao.PersonMapper;
import com.lanqiao.entity.Person;
import com.lanqiao.service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	PersonMapper personMapper ;

	@Override
	public List<Person> getAllPerson() {
		return personMapper.getAllPerson();
	}

}
