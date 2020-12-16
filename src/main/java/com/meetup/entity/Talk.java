package com.meetup.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TALK")
public class Talk {
  @Id
  @GeneratedValue
  private int id;
  @Column()
  private String name;
  private String dateTime;
  private String description;
  private double duration;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Meetup meetup;
}
