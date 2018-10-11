package com.nearsoft.skytouch.pm.controller;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class HomeControllerTest {

        @Autowired
        private TestRestTemplate restTemplate;

        @Test
        public void indexPageTest() throws Exception {
            ResponseEntity<String> entity = this.restTemplate.getForEntity("/", String.class);
            Assertions.assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
            Assertions.assertThat(entity.getBody()).contains("Hello World!");
        }
}
