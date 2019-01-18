package com.wangch.test;

import com.wangch.empService.EmpService;
import com.wangch.pojo.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Employee employee=new Employee();
        employee.setId(123);
        employee.setName("ZZZZZZ");

        EmpService empService = applicationContext.getBean("empServiceImpl", EmpService.class);
        int i = empService.register(employee);
        System.out.println("i:::"+i);
    }
}