package com.example.kbe.spring.demo.start.ue2.endpoints;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
class FruitControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private FruitsRepository foodRepository;

    @Test
    public void testGetFoodsShouldRespondFoodObject() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/fruits");
        MvcResult result = this.mockMvc.perform(request).andReturn();
        assert result.getResponse().getStatus() == 200;
    }
}