package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Coonection.xml");
        JdbcTemplate jdbc=(JdbcTemplate)context.getBean("jdbcTemplate");
        String sql="insert into employee values(?,?,?)";
        int result=jdbc.update(sql,1,"sri","harsha");
        System.out.println("no of rows addes:"+result);
    }
}
