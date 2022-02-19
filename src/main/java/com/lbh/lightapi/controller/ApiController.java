package com.lbh.lightapi.controller;

import com.lbh.lightapi.model.Api;
import com.lbh.lightapi.service.ApiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Copyright(c)lbhbinhao@163.com
 *
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

@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    private ApiService apiService;

    @PostMapping("/invoke")
    public String apiInvoke(@RequestBody Api api){
        return apiService.apiInvoke(api);
    }

    @GetMapping
    public String test(){
        return "hello world!";
    }
}
