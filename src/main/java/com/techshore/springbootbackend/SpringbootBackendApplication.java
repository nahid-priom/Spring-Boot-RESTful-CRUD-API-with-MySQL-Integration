package com.techshore.springbootbackend;

import com.techshore.springbootbackend.model.Employee;
import com.techshore.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("nahid");
		employee.setLastName("priom");
		employee.setEmailId("nahid.priom.06@gmail.com");
		employeeRepository.save(employee);
		Employee employee1 = new Employee();
		employee1.setFirstName("kishor");
		employee1.setLastName("shuvo");
		employee1.setEmailId("nahid.shuvo.06@gmail.com");
		employeeRepository.save(employee1);
	}
}
