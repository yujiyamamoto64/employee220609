package com.yujiyamamoto64.employee220609.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yujiyamamoto64.employee220609.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
