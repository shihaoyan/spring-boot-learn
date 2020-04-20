package com.shy.springboot.dao;

import com.shy.springboot.beans.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-12 17:04
 * 描述：
 */
@Repository
public interface EmployeeDao {
    /**
     * 根据id获取员工信息
     *
     * @param id
     * @return
     */
    @Select("select * from employee where id = #{id}")
    Employee get(Integer id);

    /**
     * 获取所有员工信息
     *
     * @return
     */
    @Select("select * from employee")
    List<Employee> list();

    /**
     * 更新数据
     *
     * @param employee
     */
    int update(Employee employee);

    /**
     * 删除员工
     *
     * @param id
     * @return
     */
    @Delete("delete from employee where id = #{id}")
    int delete(Integer id);

    /**
     * 添加员工信息
     */
    @Insert("insert into employee(lastName,email,gender,d_id) " +
            "values(#{lastName},#{email},#{gender},#{dId})")
    int add(Employee employee);
}
