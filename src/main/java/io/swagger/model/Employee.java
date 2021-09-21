package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Employee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-21T12:02:37.040Z[GMT]")


public class Employee   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("positionId")
  private Long positionId = null;

  @JsonProperty("departmentId")
  private Long departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("salary")
  private Long salary = null;

  public Employee id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   **/
  @Schema(description = "")

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Employee positionId(Long positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
   **/
  @Schema(description = "")

  public Long getPositionId() {
    return positionId;
  }

  public void setPositionId(Long positionId) {
    this.positionId = positionId;
  }

  public Employee departmentId(Long departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
   **/
  @Schema(description = "")

  public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public Employee departmentName(String departmentName) {
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

  public Employee salary(Long salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   **/
  @Schema(description = "")

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }


  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id)
            && Objects.equals(this.name, employee.name)
            && Objects.equals(this.positionId, employee.positionId)
            && Objects.equals(this.departmentId, employee.departmentId)
            && Objects.equals(this.departmentName, employee.departmentName)
            && Objects.equals(this.salary, employee.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name,
            this.positionId, this.departmentId,
            this.departmentName, this.salary);
  }

  @Override
  public String toString() {
    return "Employee{"
            + "id=" + this.id
            + ", name='" + this.name + '\''
            + ", positionId='" + this.positionId + '\''
            + ", departmentId='" + this.departmentId + '\''
            + ", departmentName='" + this.departmentName + '\''
            + ", salary='" + this.salary + '\''
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
