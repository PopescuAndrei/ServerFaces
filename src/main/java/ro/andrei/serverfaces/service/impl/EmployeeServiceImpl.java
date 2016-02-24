package ro.andrei.serverfaces.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.andrei.serverfaces.model.Employee;
import ro.andrei.serverfaces.repository.EmployeeRepository;
import ro.andrei.serverfaces.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = Logger.getLogger(EmployeeServiceImpl.class);

    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Employee> getAllEmployees() {
	log.debug("employees retrieved");
	return employeeRepository.findAll();
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
	this.employeeRepository = employeeRepository;
    }

    @PostConstruct
    private void init() {
	checkNotNull(employeeRepository, "employeeRepository cannot be null");
    }
}
