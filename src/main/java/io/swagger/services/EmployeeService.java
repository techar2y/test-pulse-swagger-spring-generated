package io.swagger.services;

import io.swagger.mappers.EmployeeMapper;
import io.swagger.model.AvgSalary;
import io.swagger.model.AvgSalaryByDepartment;
import io.swagger.model.AvgSalaryByPosition;
import io.swagger.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Employee service for working with database
 */
@Service
public class EmployeeService implements IEmployeeService
{
    @Autowired
    EmployeeMapper employeeMapper;

    public final Integer CNT_NEXT_OFFSET = 100;

    @Override
    public ResponseEntity<List<Employee>> getAll (Integer offset)
    {
        try {

            Integer int_next = offset + CNT_NEXT_OFFSET;

            List<Employee> employees = employeeMapper.getAll(offset, int_next);
            if(employees.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<AvgSalary>> getAvgSalary ()
    {
        try {

            List<AvgSalary> avgCompanySalary = employeeMapper.getAvgSalary();
            if(avgCompanySalary.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgCompanySalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<AvgSalaryByDepartment>> getAvgSalaryByDepartment (Integer offset)
    {
        try {
            Integer int_next = offset + CNT_NEXT_OFFSET;

            List<AvgSalaryByDepartment> avgSalaryByDepartment = employeeMapper.getAvgSalaryByDepartment(offset, int_next);
            if(avgSalaryByDepartment.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgSalaryByDepartment, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<AvgSalaryByPosition>> getAvgSalaryByPosition (Integer offset)
    {
        try {
            Integer int_next = offset + CNT_NEXT_OFFSET;

            List<AvgSalaryByPosition> avgSalaryByPosition = employeeMapper.getAvgSalaryByPosition(offset, int_next);
            if(avgSalaryByPosition.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgSalaryByPosition, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
