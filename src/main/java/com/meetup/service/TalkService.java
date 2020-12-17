package com.meetup.service;

import com.meetup.entity.Talk;
import com.meetup.repository.TalkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalkService {
  @Autowired
  private TalkRepository repository;

  public Talk addTalk(final Talk talk) {
    return repository.save(talk);
  }

  public List<Talk> addTalks(final List<Talk> talks) {
    return repository.saveAll(talks);
  }

  public List<Talk> getAllTalks() {
    return repository.findAll();
  }

  public Talk getTalkById(final Integer id) {
    return repository.findById(id).orElse(null);
  }

  public Talk getTalkByName(final String name) {
    return repository.findByName(name);
  }

  public void deleteTalk(final Integer id) {
    repository.deleteById(id);
  }

  public Talk updateTalk(final Talk talk) {
    final Talk existingtalk = repository.findById(talk.getId()).orElse(null);
    //if (existingtalk == null) {
    //  throw new EntityNotFoundException("talk with id:" + talk.getId() + " not found.");
    //}
    return repository.save(talk);
  }
}
