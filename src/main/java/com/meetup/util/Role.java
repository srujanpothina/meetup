package com.meetup.util;

public enum Role {

  SPEAKER("Speaker"),
  ATTENDEE("Attendee"),
  ADMIN("Admin");

  private final String role;

  Role(final String role) {
    this.role = role;
  }

  public String getType() {
    return role;
  }
}
