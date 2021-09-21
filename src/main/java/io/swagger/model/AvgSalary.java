package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvgSalary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-21T12:02:37.040Z[GMT]")


public class AvgSalary   {
  @JsonProperty("averageSalary")
  private Long averageSalary = null;

  public AvgSalary averageSalary(Long averageSalary) {
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


  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof AvgSalary))
      return false;
    AvgSalary avgSalary = (AvgSalary) o;
    return Objects.equals(this.averageSalary, avgSalary.averageSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.averageSalary);
  }

  @Override
  public String toString() {
    return "AvgSalary{"
            + "averageSalary=" + this.averageSalary
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
