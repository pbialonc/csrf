package com.pbialonc.csrf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CsrfApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnTeapot() throws Exception {
		this.mockMvc.perform(post("/teapot")).andExpect(status().isIAmATeapot());
	}

	@Test
	public void shouldReturn400() throws Exception {
		this.mockMvc.perform(post("/other")).andExpect(status().isBadRequest());
	}
}

