package com.meetup.entity;

import com.meetup.util.Role;
import com.meetup.util.ValueOfEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER",
    uniqueConstraints =
    @UniqueConstraint(columnNames = {"email", "role"}))
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @NotNull(message = "NotNull.user.name")
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
  @ValueOfEnum(enumClass = Role.class)
  private String role;
}
