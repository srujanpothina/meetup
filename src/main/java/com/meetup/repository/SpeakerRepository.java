package com.meetup.repository;

import com.meetup.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<User, Integer> {

  User findByName(String firstName);
}
