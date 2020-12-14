package com.meetup.service;

import com.meetup.entity.User;
import com.meetup.repository.SpeakerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeakerService {

  @Autowired
  private SpeakerRepository repository;

  public User addSpeaker(final User user) {
    return repository.save(user);
  }

  public List<User> addSpeakers(final List<User> users) {
    return repository.saveAll(users);
  }

  public List<User> getAllSpeakers() {
    return repository.findAll();
  }

  public User getSpeakerById(final Integer id) {
    return repository.findById(id).orElse(null);
  }

  public User getSpeakerByName(final String name) {
    return repository.findByName(name);
  }

  public void deleteSpeaker(final Integer id) {
    repository.deleteById(id);
  }

  public User updateSpeaker(final User user) {
    final User existingUser = repository.findById(user.getId()).orElse(null);
    //if (existingUser == null) {
    //  throw new EntityNotFoundException("User with id:" + user.getId() + " not found.");
    //}
    return repository.save(user);
  }
}
