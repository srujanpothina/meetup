package com.meetup.controller;

import com.meetup.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class TalkController {
  @Autowired
  private TalkService service;

  //@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  //public Talk createTalk(@Valid @RequestBody final Talk Talk) {
  //  return service.addTalk(Talk);
  //}
  //
  //@PostMapping("/createTalks")
  //public List<Talk> createTalks(@Valid @RequestBody final List<Talk> Talks) {
  //  return service.addTalks(Talks);
  //}
  //
  //@GetMapping
  //public List<Talk> findAllTalks() {
  //  return service.getAllTalks();
  //}
  //
  //@GetMapping("/{id}")
  //public Talk getTalkById(@PathVariable final int id) {
  //  return service.getTalkById(id);
  //}
  //
  //@GetMapping("/talkByName/{name}")
  //public Talk getTalkByName(@PathVariable final String name) {
  //  return service.getTalkByName(name);
  //}
  //
  //@PutMapping
  //public Talk updateTalk(@Valid @RequestBody final Talk Talk) {
  //  return service.updateTalk(Talk);
  //}
  //
  //@DeleteMapping("/{id}")
  //public void deleteTalk(@PathVariable final int id) {
  //  service.deleteTalk(id);
  //}
}
