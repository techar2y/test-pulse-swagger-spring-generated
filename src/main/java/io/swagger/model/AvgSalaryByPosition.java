package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvgSalaryByPosition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-21T12:02:37.040Z[GMT]")


public class AvgSalaryByPosition   {
  @JsonProperty("averageSalary")
  private Long averageSalary = null;

  @JsonProperty("position")
  private String position = null;

  public AvgSalaryByPosition averageSalary(Long averageSalary) {
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

  public AvgSalaryByPosition position(String position) {
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


  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof AvgSalaryByPosition))
      return false;
    AvgSalaryByPosition avgSalaryByPosition = (AvgSalaryByPosition) o;
    return Objects.equals(this.averageSalary, avgSalaryByPosition.averageSalary)
            && Objects.equals(this.position, avgSalaryByPosition.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.averageSalary, this.position);
  }

  @Override
  public String toString() {
    return "AvgSalaryByPosition{"
            + "averageSalary=" + this.averageSalary
            + ", position='" + this.position
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
