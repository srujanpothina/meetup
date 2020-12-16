package com.meetup.controller;

import com.meetup.entity.Meetup;
import com.meetup.service.MeetupService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meetup")
public class MeetupController {
  @Autowired
  private MeetupService service;

  @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public Meetup createMeetup(@Valid @RequestBody final Meetup meetup) {
    return service.createMeetup(meetup);
  }

  @PostMapping("/createMeetups")
  public List<Meetup> createMeetups(@Valid @RequestBody final List<Meetup> meetups) {
    return service.createMeetups(meetups);
  }

  @GetMapping
  public List<Meetup> findAllMeetups() {
    return service.getAllMeetups();
  }

  @GetMapping("/{id}")
  public Meetup getMeetupById(@PathVariable final int id) {
    return service.getMeetupById(id);
  }

  @GetMapping("/meetupByName/{name}")
  public Meetup getMeetupByName(@PathVariable final String name) {
    return service.getMeetupByName(name);
  }

  @PutMapping
  public Meetup updateMeetup(@Valid @RequestBody final Meetup meetup) {
    return service.updateMeetup(meetup);
  }

  @DeleteMapping("/{id}")
  public void deleteMeetup(@PathVariable final int id) {
    service.deleteMeetup(id);
  }
}
