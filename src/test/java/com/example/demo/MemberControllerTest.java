package com.example.demo;

import com.example.demo.controller.MemberController;
import com.example.demo.models.Member;
import com.example.demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MemberController.class)
public class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @SuppressWarnings("removal")
    @MockBean
    private MemberService memberService;

    @Test
    public void testGetAllMembers() throws Exception {
        // Mock the service response
        Mockito.when(memberService.searchMembersByName(Mockito.anyString()))
                .thenReturn(Collections.singletonList(new Member()));

        // Perform the GET request and verify the response
        mockMvc.perform(get("/api/members/search?name=test")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        "[{\"id\":null,\"name\":null,\"address\":null,\"email\":null,\"phoneNumber\":null,\"startDate\":null,\"duration\":0,\"tournaments\":null}]"));
    }
}