package com.jwen.springtest.com.jwen.springtest.service;

import com.jwen.springtest.entry.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    public void save(Person person);

    public void delete(Integer id) throws Exception;

}
