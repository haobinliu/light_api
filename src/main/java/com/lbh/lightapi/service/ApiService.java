package com.lbh.lightapi.service;

import com.lbh.lightapi.model.Api;

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
public interface ApiService {
    /**
     * using for sending a request
     * @param api a complicated request
     * @return a string formatted response
     */
    String apiInvoke(Api api);

}
