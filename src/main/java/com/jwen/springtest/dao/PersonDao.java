package com.jwen.springtest.dao;

import com.jwen.springtest.entry.Person;
import org.springframework.stereotype.Component;

@Component
public interface PersonDao {

    public void insert(Person person);

    public void delete(Integer id) throws Exception;

}
