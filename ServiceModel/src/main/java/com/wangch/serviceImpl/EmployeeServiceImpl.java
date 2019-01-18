package com.wangch.serviceImpl;

import com.wangch.Mapper.EmpMapper;
import com.wangch.empService.EmpService;
import com.wangch.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public int register(Employee employee) {
        return empMapper.register(employee);
    }
}
