package com.thd.accessrequestfinder;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.thd.accessrequestfinder.controller.AccessRequestController;
import com.thd.accessrequestfinder.model.AccessRequest;
import com.thd.accessrequestfinder.service.AccessRequestService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

@WebMvcTest(AccessRequestController.class)
class AccessRequestFinderApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private AccessRequestService service;

	@Test
	void getAccessRequestsShouldReturnOkStatus() throws Exception {
		AccessRequest accessRequest = AccessRequest
			.builder()
			.id("id")
			.name("name")
			.description("description")
			.teamId("team-id")
			.build();

		when(service.findAll("clearing"))
			.thenReturn(Collections.singletonList(accessRequest));
		this.mockMvc.perform(get("/api/v1/access-request/find/clearing")).andExpect(status().isOk());
	}

}
