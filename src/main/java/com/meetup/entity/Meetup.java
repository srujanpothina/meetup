package com.meetup.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MEETUP")
public class Meetup {

  @Id
  @GeneratedValue
  private int id;
  @NotBlank(message = "Name is mandatory")
  private String name;
  private String dateTime;
  private String venue;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<Talk> talks;
}
