package com.meetup.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.meetup.entity.User;
import com.meetup.service.SpeakerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class UserControllerTest {
  @Autowired
  SpeakerController controller;
  @MockBean
  private SpeakerService service;
  @Autowired
  private MockMvc mockMvc;

  @Before
  public void setUp() {
    when(service.addSpeaker(any()))
        .thenReturn(new User(1, "srujan#", "", "", "", "", "", null));
    //when(service.updateSpeaker(any()))
    //    .thenThrow(EntityNotFoundException.class);
  }

  @Test
  public void whenPostRequestToSpeakerAndValidUser_thenCorrectResponse() throws Exception {
    //final MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
    final String speaker = "{\n"
        + "        \"name\": \"srujan#\",\n"
        + "        \"dateOfBirth\": \"01-01-2000\",\n"
        + "        \"city\": \"Malvern\",\n"
        + "        \"state\": \"PA\",\n"
        + "        \"email\": \"sp@gmail.com\",\n"
        + "        \"phone\": \"9090909090\"\n"
        + "    }";
    //final ResultActions result = mockMvc.perform(post("/speaker")
    //    .content(user)
    //    .contentType(MediaType.APPLICATION_JSON))
    //    .andExpect(status().isOk())
    //    .andExpect(jsonPath("$[0].name", is("srujan")));

    mockMvc.perform(post("/speaker")
        .content(speaker)
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("name", is("srujan#")));
  }
}
