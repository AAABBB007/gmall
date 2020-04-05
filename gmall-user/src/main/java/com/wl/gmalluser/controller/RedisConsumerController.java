package com.wl.gmalluser.controller;

import com.wl.gmalluser.config.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 描述：消费者(消息接收方)
 * @author wl
 * @date 2020.04.04
 */
@RestController
@RequestMapping("/consumer")
public class RedisConsumerController {

    @Autowired
    RedisClient redisClient;

    /** 公共配置 */
    private final static String MESSAGE = "testmq";

    /**
     * 接收消息API
     * @return
     */
    @RequestMapping("/receiveMessage")
    public String sendMessage() {
        return (String) redisClient.brpop(MESSAGE, 0, TimeUnit.SECONDS);
    }

}
