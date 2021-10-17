package com.exp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp.demo.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
