package com.meetup.repository;

import com.meetup.entity.Meetup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetupRepository extends JpaRepository<Meetup, Integer> {

  Meetup findByName(String name);
}
