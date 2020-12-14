package com.meetup.util;

public enum UserType {

  SPEAKER("Speaker"),
  ATTENDEE("Attendee");

  private final String type;

  UserType(final String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
