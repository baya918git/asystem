package com.wdbs.weather.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdbs.weather.model.employee.Employee;

/**
 * ユーザーリポジトリクラス。
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public Employee findByCode(String code);
}
