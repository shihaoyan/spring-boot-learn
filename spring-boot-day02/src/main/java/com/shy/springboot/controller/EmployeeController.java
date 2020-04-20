package com.shy.springboot.controller;

import com.shy.springboot.beans.Employee;
import com.shy.springboot.beans.ResultMsg;
import com.shy.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-12 17:13
 * 描述：
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public ResultMsg get(@PathVariable Integer id) {
        Employee employee = employeeService.get(id);
        return ResultMsg.ok(employee);
    }

    @GetMapping("/emp")
    public ResultMsg list() {
        List<Employee> list = employeeService.list();
        return ResultMsg.ok(list);
    }

    @PutMapping("/emp")
    public ResultMsg update(Employee employee) {
        return ResultMsg.build(employeeService.update(employee));
    }

    @DeleteMapping("/emp/{id}")
    public ResultMsg delete(@PathVariable Integer id) {
        return ResultMsg.build(employeeService.delete(id));
    }

    @PostMapping("/emp")
    public ResultMsg add(Employee employee) {
        System.out.println(employee);
        return ResultMsg.build(employeeService.add(employee));
    }


}
