package com.wdbs.weather;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private EmployeeService employeeService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/**").permitAll();
		//				.antMatchers("/**").hasRole("USER")
		//				.and()
		//				.formLogin();
	}

	// @Override
	// protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//     auth
	//             .userDetailsService(userService)
	//             .passwordEncoder(passwordEncoder());
	//     userService.registerAdmin("admin", "secret", "admin@localhost");
	// }

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}