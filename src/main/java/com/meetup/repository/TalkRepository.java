package com.meetup.repository;

import com.meetup.entity.Talk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalkRepository extends JpaRepository<Talk, Integer> {
}
