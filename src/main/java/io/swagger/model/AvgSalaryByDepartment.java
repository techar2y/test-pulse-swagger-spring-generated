package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvgSalaryByDepartment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-21T12:02:37.040Z[GMT]")


public class AvgSalaryByDepartment   {
  @JsonProperty("averageSalary")
  private Long averageSalary = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  public AvgSalaryByDepartment averageSalary(Long averageSalary) {
    this.averageSalary = averageSalary;
    return this;
  }

  /**
   * Get averageSalary
   * @return averageSalary
   **/
  @Schema(description = "")

  public Long getAverageSalary() {
    return averageSalary;
  }

  public void setAverageSalary(Long averageSalary) {
    this.averageSalary = averageSalary;
  }

  public AvgSalaryByDepartment departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
   **/
  @Schema(description = "")

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof AvgSalaryByDepartment))
      return false;
    AvgSalaryByDepartment avgSalaryByDepartment = (AvgSalaryByDepartment) o;
    return Objects.equals(this.averageSalary, avgSalaryByDepartment.averageSalary)
            && Objects.equals(this.departmentName, avgSalaryByDepartment.departmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.averageSalary, this.departmentName);
  }

  @Override
  public String toString() {
    return "AvgSalaryByDepartment{"
            + "averageSalary=" + this.averageSalary
            + ", departmentName='" + this.departmentName
            + '}';
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
