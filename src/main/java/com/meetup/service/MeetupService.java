package com.meetup.service;

import com.meetup.entity.Meetup;
import com.meetup.repository.MeetupRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetupService {
  @Autowired
  private MeetupRepository repository;

  public Meetup createMeetup(final Meetup meetup) {
    return repository.save(meetup);
  }

  public List<Meetup> createMeetups(final List<Meetup> meetups) {
    return repository.saveAll(meetups);
  }

  public List<Meetup> getAllMeetups() {
    return repository.findAll();
  }

  public Meetup getMeetupById(final Integer id) {
    return repository.findById(id).orElse(null);
  }

  public Meetup getMeetupByName(final String name) {
    return repository.findByName(name);
  }

  public void deleteMeetup(final Integer id) {
    repository.deleteById(id);
  }

  public Meetup updateMeetup(final Meetup meetup) {
    final Meetup existingUser = repository.findById(meetup.getId()).orElse(null);
    return repository.save(existingUser);
  }
}
