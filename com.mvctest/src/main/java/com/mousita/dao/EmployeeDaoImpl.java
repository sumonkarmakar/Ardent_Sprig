package com.mousita.dao;
import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mousita.model.Employee;
 
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
 
    }
 
  
    @SuppressWarnings("unchecked")
    @Transactional
	public List<Employee> getAllEmployees() {
 
        return sessionFactory.getCurrentSession().createQuery("from Employee")
                .list();
    }
 
   @Override
   @Transactional
    public void deleteEmployee(Integer employeeId) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(
                Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
 
    }
 @Override
 @Transactional
    public Employee getEmployee(int empid) {
        return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, empid);
    }
 
    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }
 
}