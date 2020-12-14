package com.meetup.entity;

import com.meetup.util.UserType;
import com.meetup.util.ValueOfEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SPEAKER")
public class User {

  @Id
  @GeneratedValue
  private int id;
  @NotBlank(message = "Name is mandatory")
  private String name;
  private String dateOfBirth;
  @NotBlank(message = "City is mandatory")
  private String city;
  @NotBlank(message = "State is mandatory")
  private String state;
  @NotBlank(message = "Email is mandatory")
  private String email;
  @NotBlank(message = "Phone is mandatory")
  @Column(length = 10)
  private String phone;
  @NotNull(message = "User Type has to be present")
  @ValueOfEnum(enumClass = UserType.class)
  private String type;

  //public int getId() {
  //  return id;ßßßß
  //}
  //
  //public void setId(final int id) {
  //  this.id = id;
  //}
  //
  //public String getFirstName() {
  //  return firstName;
  //}
  //
  //public void setFirstName(final String firstName) {
  //  this.firstName = firstName;
  //}
  //
  //public String getLastName() {
  //  return lastName;
  //}
  //
  //public void setLastName(final String lastName) {
  //  this.lastName = lastName;
  //}
}
