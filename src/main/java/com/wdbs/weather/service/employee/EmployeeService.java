package com.wdbs.weather.service.employee;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wdbs.weather.model.employee.Employee;
import com.wdbs.weather.repository.employee.EmployeeRepository;

public class EmployeeService implements UserDetailsService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public UserDetails loadUserByUsername(String code) throws UsernameNotFoundException {
		if (StringUtils.isEmpty(code)) {
			throw new UsernameNotFoundException("Username is empty");
		}
		Employee employee = employeeRepository.findByCode(code);
		if (employee == null) {
			throw new UsernameNotFoundException("User not found: " + code);
		}
		return employee;
	}

}
