package com.lbh.lightapi.service.impl;

import com.lbh.lightapi.model.Api;
import com.lbh.lightapi.service.ApiService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Copyright(c)lbhbinhao@163.com
 * @author liubinhao
 * @date 2022/2/19
 * ++++ ______                           ______             ______
 * +++/     /|                         /     /|           /     /|
 * +/_____/  |                       /_____/  |         /_____/  |
 * |     |   |                      |     |   |        |     |   |
 * |     |   |                      |     |   |________|     |   |
 * |     |   |                      |     |  /         |     |   |
 * |     |   |                      |     |/___________|     |   |
 * |     |   |___________________   |     |____________|     |   |
 * |     |  /                  / |  |     |   |        |     |   |
 * |     |/ _________________/  /   |     |  /         |     |  /
 * |_________________________|/b    |_____|/           |_____|/
 */
@Service
public class ApiServiceImpl implements ApiService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public String apiInvoke(Api api) {
        HttpMethod method = HttpMethod.resolve(api.getMethod().toUpperCase());
        if (method == null){
            throw new RuntimeException("No such request method!");
        }
        String uri = api.getUri();
        String body = api.getBody();
        Map<String, String> headers = api.getHeaders();
        return restTemplate.exchange(uri, method, transHttpHeaders(body, headers), String.class)
                .getBody();
    }

    private <T> HttpEntity<T> transHttpHeaders(T body, Map<String,String> headers){
        HttpHeaders httpHeaders = new HttpHeaders();
        headers.forEach(httpHeaders::add);
        return new HttpEntity<>(body, httpHeaders);
    }
}
