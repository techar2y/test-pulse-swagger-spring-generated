package io.swagger.mappers;

import io.swagger.model.AvgSalary;
import io.swagger.model.AvgSalaryByDepartment;
import io.swagger.model.AvgSalaryByPosition;
import io.swagger.model.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface EmployeeMapper
{
	/**
	 * Get all employees
	 * @return
	 */
	@Select("SELECT e.id, e.name, p.position, p.id AS positionId, " +
			"d.id AS departmentId, d.department_name AS departmentName, e.salary " +
			"FROM employees e " +
			"JOIN departments d ON e.department_id = d.id " +
			"JOIN positions p ON e.position_id = p.id " +
			"ORDER BY e.id " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<Employee> getAll (Integer cnt_offset, Integer cnt_next);

	/**
	 * Get average salary of employees
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as averageSalary " +
			"FROM employees e ")
	List<AvgSalary> getAvgSalary ();

	/**
	 * Get average salary by department
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as averageSalary, d.department_name as departmentName " +
			"FROM employees e JOIN departments d ON e.department_id = d.id " +
			"GROUP BY d.department_name " +
			"ORDER BY averageSalary " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<AvgSalaryByDepartment> getAvgSalaryByDepartment (Integer cnt_offset, Integer cnt_next);

	/**
	 * Get average salary by position
	 * @return
	 */
	@Select("SELECT AVG(e.salary) as averageSalary, p.position " +
			"FROM employees e JOIN positions p ON e.position_id = p.id " +
			"GROUP BY p.position " +
			"ORDER BY averageSalary " +
			"OFFSET #{cnt_offset} ROWS " +
			"FETCH NEXT #{cnt_next} ROWS ONLY")
	List<AvgSalaryByPosition> getAvgSalaryByPosition (Integer cnt_offset, Integer cnt_next);
}
