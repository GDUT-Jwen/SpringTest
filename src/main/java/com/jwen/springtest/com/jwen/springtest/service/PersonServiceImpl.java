package com.jwen.springtest.com.jwen.springtest.service;

import com.jwen.springtest.entry.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Types;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Person person) {
        jdbcTemplate.update("insert into person values(?,?,?)", new Object[]{person.getId(), person.getName(), person.getAge()}, new int[]{Types.INTEGER, Types.VARCHAR, Types.INTEGER});
    }

    @Transactional(propagation= Propagation.REQUIRED)
    public void delete(Integer id) throws Exception {
        int temp = jdbcTemplate.update("delete from person where id = ?",new Object[]{id});
        if (temp > 0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        throw new RuntimeException("我是check异常");
    }

}
