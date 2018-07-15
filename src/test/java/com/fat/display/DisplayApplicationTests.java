package com.fat.display;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DisplayApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private BatchAssertionDelegator rh;

    @Test
    public void contextLoads() {
//        String url = "/word/haha";
//        String res = restTemplate.postForObject(url, "", String.class);
//        Assertions.assertThat("aha").isEqualTo(res);
//        rh.getUrl("/","good");
//        System.out.println("nice");
        Map<String, String> resMap = Map.of(
                "/","good",
                "/tt", "nice"

        );
        rh.getUrls(resMap);
    }

}
