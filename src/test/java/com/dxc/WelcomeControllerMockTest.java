package com.dxc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.dxc.controller.HelloController;

@WebMvcTest(HelloController.class)
public class WelcomeControllerMockTest {
	@Autowired
	MockMvc mockMvc;
	@Test
	public void welcomeTest() throws Exception {
		mockMvc.perform(get("/hello")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string("Welcome to  RestFull  webservices"));
	
		
	}
	@Test
	public void welcomeTest2() throws Exception {
               String name="bhumika";
		mockMvc.perform(get("/hello/{name}")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(" Welcome" + " " +name ));
	
		
	}
	
}

