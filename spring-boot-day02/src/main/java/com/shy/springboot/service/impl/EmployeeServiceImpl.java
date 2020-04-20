package com.shy.springboot.service.impl;

import com.shy.springboot.beans.Employee;
import com.shy.springboot.dao.EmployeeDao;
import com.shy.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-12 17:07
 * 描述：
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public Employee get(Integer id) {
        return employeeDao.get(id);
    }

    @Override
    public List<Employee> list() {
        return employeeDao.list();
    }

    @Override
    public boolean update(Employee employee) {
        int update = employeeDao.update(employee);
        if (update == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean add(Employee employee) {
        int add = employeeDao.add(employee);
        if (add == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        int delete = employeeDao.delete(id);
        if (delete == 0) {
            return false;
        }
        return true;
    }
}
