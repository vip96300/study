package com.hhf.study.client.controller;

import com.hhf.study.client.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:15 2018/5/2
 */
public class UserControllerTest extends BaseTest{
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void register() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/user/register")
                .param("userName","huanghongfei")
                .param("password","123456"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }
}
