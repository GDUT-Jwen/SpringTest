package com.jwen.springtest.dao;

import com.jwen.springtest.com.jwen.springtest.service.PersonService;
import com.jwen.springtest.entry.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDaoImpl implements PersonDao{
    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Autowired
    private PersonService personService;

    public void insert(Person person) {
        personService.save(person);
    }


    public void delete(Integer id) throws Exception {
        personService.delete(id);
    }
}
