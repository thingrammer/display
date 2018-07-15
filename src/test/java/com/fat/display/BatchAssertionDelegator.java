package com.fat.display;

import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BatchAssertionDelegator {
    @Autowired
    TestRestTemplate restTemplate;

    public void getUrl(String url, String expect) {
        var res = restTemplate.getForObject(url, String.class);
        Assertions.assertThat(res).isEqualTo(expect);
    }

    public void getUrls(Map<String, String> resMap) {
        for (Map.Entry<String, String> entry : resMap.entrySet()) {
            getUrl(entry.getKey(), entry.getValue());
        }
    }
}
