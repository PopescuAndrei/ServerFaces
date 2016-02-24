package ro.andrei.serverfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.andrei.serverfaces.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
