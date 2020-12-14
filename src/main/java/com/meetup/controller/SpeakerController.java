package com.meetup.controller;

import com.meetup.entity.User;
import com.meetup.service.SpeakerService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeakerController {

  @Autowired
  private SpeakerService service;

  @PostMapping(value = "/speaker", produces = {MediaType.APPLICATION_JSON_VALUE})
  public User addSpeaker(@Valid @RequestBody final User user) {
    return service.addSpeaker(user);
  }

  @PostMapping("/addSpeakers")
  public List<User> addSpeaker(@Valid @RequestBody final List<User> users) {
    return service.addSpeakers(users);
  }

  @GetMapping("/speakers")
  public List<User> findAllSpeakers() {
    return service.getAllSpeakers();
  }

  @GetMapping("/speaker/{id}")
  public User getSpeakerById(@PathVariable final int id) {
    return service.getSpeakerById(id);
  }

  @GetMapping("/speakerByName/{name}")
  public User getSpeakerByName(@PathVariable final String name) {
    return service.getSpeakerByName(name);
  }

  @PutMapping("/speaker")
  public User updateSpeaker(@Valid @RequestBody final User user) {
    return service.updateSpeaker(user);
  }

  @DeleteMapping("/speaker/{id}")
  public void deleteSpeaker(@PathVariable final int id) {
    service.deleteSpeaker(id);
  }
}
