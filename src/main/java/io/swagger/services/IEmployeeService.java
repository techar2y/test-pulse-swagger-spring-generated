package io.swagger.services;

import io.swagger.model.AvgSalary;
import io.swagger.model.AvgSalaryByDepartment;
import io.swagger.model.AvgSalaryByPosition;
import io.swagger.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 *  Interface of employee service
 */
public interface IEmployeeService
{
    ResponseEntity<List<Employee>> getAll (Integer offset);
    ResponseEntity<List<AvgSalary>> getAvgSalary ();
    ResponseEntity<List<AvgSalaryByDepartment>> getAvgSalaryByDepartment (Integer offset);
    ResponseEntity<List<AvgSalaryByPosition>> getAvgSalaryByPosition (Integer offset);
}
