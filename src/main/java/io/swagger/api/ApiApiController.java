package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.AvgSalary;
import io.swagger.model.AvgSalaryByDepartment;
import io.swagger.model.AvgSalaryByPosition;
import io.swagger.model.Employee;
import io.swagger.services.IEmployeeService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Min;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-21T08:50:46.352Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    IEmployeeService employeeService;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Employee>> apiEmployeeGetAllOffsetGet(@Min(1) @Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required = true, schema = @Schema(allowableValues = {}, minimum = "1"
    )) @PathVariable("offset") Integer offset) {
        try {
            return employeeService.getAll(offset);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<AvgSalaryByDepartment>> apiEmployeeGetAvgSalaryByDepartmentOffsetGet(@Min(1) @Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required = true, schema = @Schema(allowableValues = {}, minimum = "1"
    )) @PathVariable("offset") Integer offset) {
        try {
            return employeeService.getAvgSalaryByDepartment(offset);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<AvgSalaryByDepartment>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<AvgSalaryByPosition>> apiEmployeeGetAvgSalaryByPositionOffsetGet(@Min(1) @Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required = true, schema = @Schema(allowableValues = {}, minimum = "1"
    )) @PathVariable("offset") Integer offset) {
        try {
            return employeeService.getAvgSalaryByPosition(offset);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<AvgSalaryByPosition>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<AvgSalary>> apiEmployeeGetAvgSalaryGet() {
        try {
            return employeeService.getAvgSalary();
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<AvgSalary>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
