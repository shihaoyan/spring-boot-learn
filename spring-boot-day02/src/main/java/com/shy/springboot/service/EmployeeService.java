package com.shy.springboot.service;

import com.shy.springboot.beans.Employee;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-12 17:05
 * 描述：
 */
public interface EmployeeService {
    /**
     * 根据id获取员工
     * @param id
     * @return
     */
    Employee get(Integer id);

    /**
     * 获取所有员工
     * @return
     */
    List<Employee> list();

    /**
     * 更新员工信息
     * @param employee
     * @return
     */
    boolean update(Employee employee);

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    boolean add(Employee employee);

    /**
     * 删除员工
     * @param id
     * @return
     */
    boolean delete(Integer id);
}
