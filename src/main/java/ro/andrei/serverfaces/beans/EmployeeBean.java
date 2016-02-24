package ro.andrei.serverfaces.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import ro.andrei.serverfaces.model.Employee;
import ro.andrei.serverfaces.service.EmployeeService;

@ManagedBean
@SessionScoped
public class EmployeeBean {

    @ManagedProperty(value = "#{employeeService}")
    private EmployeeService employeeService;

    private List<Employee> employees = new ArrayList<>();
    // private List<Employee> employees = new
    // ArrayList<Employee>(employeeService.getAllEmployees());

    public EmployeeBean() {

    }

    @PostConstruct
    public void populateEmployeeList() {
	for (int i = 1; i < 10; i++) {
	    Employee e = new Employee();
	    e.setEmployeeId(Long.valueOf(i));
	    e.setEmployeeName("Employee#" + i);
	    this.employees.add(e);
	}
    }

    public List<Employee> getEmployees() {
	return employees;
    }

    public void setEmployees(List<Employee> employees) {
	this.employees = employees;
    }

    public EmployeeService getEmployeeService() {
	return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
	this.employeeService = employeeService;
    }

}
